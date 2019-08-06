import React, {Component} from 'react'
import axios from 'axios'
import {ListGroup} from 'react-bootstrap'
import './classes.css'

class Classes extends Component{

    state = {
        classes: []
    }

    componentDidMount(){
        this.getAssignments()
    }

    getAssignments = () =>{
        axios.get("/getAssignments").then(response =>{
            this.setState({classes: response.data})
        })
    }

    render() {
        return(
            <div className="classesWrapper">
                <ListGroup>
                {this.state.classes.map( course =>
                    <ListGroup.Item key={course.id}>{course.name}</ListGroup.Item>
                )}
                </ListGroup>
            </div>
        )
    }
}

export default Classes