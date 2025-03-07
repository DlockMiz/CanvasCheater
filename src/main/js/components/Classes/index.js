import React, {Component} from 'react'
import axios from 'axios'
import {ListGroup, Spinner} from 'react-bootstrap'
import './courses.css'
import JSONbig from 'json-bigint'
import Assignment from "../Assignment";

class Classes extends Component{

    state = {
        all_courses: [],
        assignments: [],
        keys: 0,
        activeCourse: {id:null},
        selectedCourse: null,
        savedAssignments: null,
        isLoadingCourses: false,
        isLoadingAssignments: false,
        loadingProgress: 10
    }

    componentDidMount(){
        this.getCourses()
        this.getSavedAssignments()
    }

    delete = () =>{
        axios.get("/delete")
    }

    parseData= (data) =>{
        var that = this
        let parsed = []
        let json = JSONbig.parse(data)
        json.forEach(function(obj){
            if(obj.name != null){
                obj.id = obj.id.toString()
                parsed.push(obj)
            }
        })
        return parsed
    }

    loadAssignments = (course) =>{
        this.setState({activeCourse: course, isLoadingAssignments: true})
        axios.post('/getAssignments', course, {transformResponse:[data=>data]}).then(response =>{
            let parsed_assignments = this.parseData(response.data)
            this.setState({assignments: parsed_assignments, isLoadingAssignments: false})
        })
    }

    getSavedAssignments = () =>{
        var that = this
        axios.get("/getSavedAssignments").then(function(response){
            that.setState({savedAssignments: response.data})
        })
    }

    getCourses = () =>{
        this.setState({isLoadingCourses: true})
        axios.get("/getCourses", {transformResponse:[data=>data]}).then(response =>{
            let parsed_courses = this.parseData(response.data)
            this.setState({all_courses: parsed_courses, isLoadingCourses: false})
        })
    }

    render() {
        return(
            <div className="pageWrapper">
                <div className="coursesWrapper">
                    <ListGroup>
                        <Spinner style={this.state.isLoadingCourses ? {display: "block", margin: "auto"}:{display: "none"}} animation="grow" />
                        {this.state.all_courses.map( course =>
                        <ListGroup.Item className={this.state.activeCourse.id == course.id ? 'active' : null} onClick={() => this.loadAssignments(course)} key={this.state.keys +=1}>{course.name}</ListGroup.Item>
                    )}
                    </ListGroup>
                </div>
                <div className="assignmentWrapper">
                    <Spinner style={this.state.isLoadingAssignments ? {display: "block", margin: "auto"}:{display: "none"}} animation="grow" />
                    <div style={!this.state.isLoadingAssignments ? {display: "block"}:{display: "none"}}>
                        {this.state.assignments.map(assignment =>
                            <Assignment key={this.state.keys+=1} saved={this.state.savedAssignments} assignment={assignment} course={this.state.activeCourse}></Assignment>
                        )}
                    </div>
                </div>
            </div>
        )
    }
}

export default Classes