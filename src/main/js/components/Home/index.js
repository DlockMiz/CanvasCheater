import React, {Component} from 'react'
import {Navbar, Nav} from 'react-bootstrap'
import {Route, NavLink} from "react-router-dom";
import Classes from "../Classes"
import SavedAssignments from "../SavedAssignments";
import './home.css'

class Home extends Component {
    render() {
        return(
            <div>
                <div id="navBarWrapper">
                <Navbar bg="dark" variant="dark">
                    <Navbar.Brand as={NavLink} to="/">Canvas Cheater</Navbar.Brand>
                    <Nav className="mr-auto">
                        <Nav.Link as={NavLink} to="/classes"> Classes</Nav.Link>
                        <Nav.Link as={NavLink} to="/saved_assignments"> Assignments</Nav.Link>
                        <Nav.Link as={NavLink} to="/other"> Other</Nav.Link>
                    </Nav>
                </Navbar>
                </div>
                <Route path="/"/>
                <Route path="/classes" component={Classes}/>
                <Route path="/saved_assignments" component={SavedAssignments}/>
            </div>
        )
    }
}

export default Home