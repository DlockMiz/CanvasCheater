import React, {Component} from 'react'
import {Card, Button, Alert} from 'react-bootstrap'
import {FontAwesomeIcon} from '@fortawesome/react-fontawesome'
import './assignment.css'

class Assignment extends Component{

    componentDidMount() {
        // console.log(new Date(this.props.assignment.due_at).toString())
        // console.log(this.props.assignment)
    }

    checkDueSoon = () => {
        let current_date = new Date()
        let due_date = new Date(this.props.assignment.due_at)
        var ms = due_date - current_date
        let days = (ms / (1000 * 60 * 60 * 24))
        return days <= 3 ? true : false
    }

    saveAssignment = () =>{
        var postData = {
            id: this.props.assignment.id,
            name: this.props.assignment.name,
            due_at: this.props.assignment.due_at,
            course: this.props.course.name
        }
        console.log(postData)
    }


    render(){
        return(
            <Card className="assignmentBox">
                <Card.Header as="h6">{this.props.assignment.name}</Card.Header>
                <Card.Body className="assignmentBody">
                    <Card.Title></Card.Title>
                    <Card.Text className="assignmentDescription">
                        Due on: {new Date(this.props.assignment.due_at).toDateString()}
                    </Card.Text>
                    <Button variant="success" style={{float: "left"}} onClick={this.saveAssignment}><FontAwesomeIcon icon="plus"/></Button>
                    <Alert variant="danger" show={this.checkDueSoon()} style={{width: "65%", float: "right", textAlign: "center"}}>Due Soon</Alert>
                </Card.Body>
            </Card>
        )
    }
}

export default Assignment