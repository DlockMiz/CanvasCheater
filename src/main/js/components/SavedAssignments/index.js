import React, {Component} from 'react'
import axios from 'axios'
import Assignment from "../Assignment";

class SavedAssignments extends Component{
    state = {
        assignments: []
    }

    componentDidMount() {
        this.getSavedAssignments()
    }

    getSavedAssignments = () =>{
        var that = this
        axios.get('/getSavedAssignments').then(function(response){
            that.setState({assignments: response.data})
        })
    }

    render(){
        return(
            <div>
            {this.state.assignments.map(assignment =>
                    assignment.name
            )}
            </div>
        )
    }
}

export default SavedAssignments