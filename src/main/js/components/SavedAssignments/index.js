import React, {Component} from 'react'
import axios from 'axios'

class SavedAssignments extends Component{
    componentDidMount() {
        axios.get('/getSavedAssignments').then(function(response){
            console.log(response.data)
        })
    }

    render(){
        return(
            <div>
                test
            </div>
        )
    }
}

export default SavedAssignments