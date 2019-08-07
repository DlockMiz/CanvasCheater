import React, {Component} from 'react'
import axios from 'axios'
import {ListGroup, Dropdown, Spinner} from 'react-bootstrap'
import './courses.css'
import JSONbig from 'json-bigint'
import Assignment from "../Assignment";

class Classes extends Component{

    state = {
        all_courses: [],
        filtered_courses: [],
        assignments: [],
        keys: 0,
        activeCourse: false,
        isLoadingAssignments: false
    }

    componentDidMount(){
        this.getCourses()
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

    filterCourses = (sem) =>{
        let courses = []
        this.state.all_courses.forEach(function(course){
            if(course.name.search(sem) == 0){
                courses.push(course)
            }
        })
        this.setState({filtered_courses: courses})
    }

    loadAssignments = (course) =>{
        this.setState({activeCourse: course.id, isLoadingAssignments: true})
        axios.post('/getAssignments', course, {transformResponse:[data=>data]}).then(response =>{
            let parsed_assignments = this.parseData(response.data)
            this.setState({assignments: parsed_assignments, isLoadingAssignments: false})
        })
    }

    getCourses = () =>{
        axios.get("/getCourses", {transformResponse:[data=>data]}).then(response =>{
            let parsed_corses = this.parseData(response.data)
            this.setState({all_courses: parsed_corses})
            this.setState({filtered_courses: parsed_corses})
        })
    }

    render() {
        return(
            <div className="coursesWrapper">
                <Dropdown style={{marginBottom: "20px"}}>
                    <Dropdown.Toggle variant="success" id="dropdown-basic">
                        Semester
                    </Dropdown.Toggle>
                    <Dropdown.Menu>
                        <Dropdown.Item onClick={() => this.filterCourses('2016FS')}>Fall 19</Dropdown.Item>
                        <Dropdown.Item onClick={() => this.filterCourses('2017SP')}>Spring 20</Dropdown.Item>
                        <Dropdown.Item onClick={() => this.setState({filtered_courses: this.state.all_courses})}>All</Dropdown.Item>
                    </Dropdown.Menu>
                </Dropdown>
                <ListGroup>
                {this.state.filtered_courses.map( course =>
                    <ListGroup.Item className={this.state.activeCourse == course.id ? 'active' : null} onClick={() => this.loadAssignments(course)} key={this.state.keys +=1}>{course.name}</ListGroup.Item>
                )}
                </ListGroup>
                <div className="assignmentWrapper">
                    <Spinner style={this.state.isLoadingAssignments ? {display: "block"}:{display: "none"}} animation="grow" />
                    <div className="assignmentBox" style={!this.state.isLoadingAssignments ? {display: "block"}:{display: "none"}}>
                    {this.state.assignments.map(assignment =>
                        <Assignment key={this.state.keys+=1} assignment={assignment}></Assignment>
                    )}
                    </div>
                </div>
            </div>
        )
    }
}

export default Classes