import React, {Component} from 'react'

class Assignment extends Component{
    render(){
        return(
            <div>
                {this.props.assignment.name}
            </div>
        )
    }
}

export default Assignment