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
        isLoadingAssignments: false
    }

    componentDidMount(){
        this.getCourses()
        this.getSavedAssignments()
    }

    delete = () =>{
        axios.get("/delete")
    }

    parseData= (data) =>{
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
        axios.get("/getCourses", {transformResponse:[data=>data]}).then(response =>{
            let parsed_courses = this.parseData(response.data)
            this.setState({all_courses: parsed_courses})
        })
    }

    render() {
        return(
            <div className="pageWrapper">
                <div className="coursesWrapper">
                    <ListGroup>
                    {this.state.all_courses.map( course =>
                        <ListGroup.Item className={this.state.activeCourse.id == course.id ? 'active' : null} onClick={() => this.loadAssignments(course)} key={this.state.keys +=1}>{course.name}</ListGroup.Item>
                    )}
                    </ListGroup>
                </div>
                <div className="assignmentWrapper">
                    <Spinner style={this.state.isLoadingAssignments ? {display: "block"}:{display: "none"}} animation="grow" />
                    <div style={!this.state.isLoadingAssignments ? {display: "block"}:{display: "none"}}>
                        {this.state.assignments.map(assignment =>
                            <Assignment key={this.state.keys+=1} saved={this.state.savedAssignments} assignment={assignment} course={this.state.activeCourse}></Assignment>
                        )}
                    </div>
                </div>
                <button onClick={this.delete}>del</button>
            </div>
        )
    }
}

export default Classes