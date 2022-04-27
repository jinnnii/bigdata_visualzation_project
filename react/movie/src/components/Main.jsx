import React, { Component } from 'react';
import { Container, Nav, NavItem, NavLink, Row, Col } from 'react-bootstrap';

export default class Main extends Component {
    render() {
        return (
            <Container className="mt-5">
                <Row>
                    <Col className="sm-4">
                        <h2>About Me</h2>
                        <h4>Photo of me:</h4>
                        <div className="fakeimg"> Fake image </div>
                        <p>Some text about me in culpa qui officia desrunt mollitanim..</p>
                        <h3>Some Links</h3>
                        <p>Lorem ipsum dolor sit ame</p>
                        <Nav className="nav-pills flex-column">
                            <NavItem>
                                <NavLink href="#" active>
                                    Active
                                </NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="#">Link</NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="#">Link</NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="#" disabled>
                                    Disable
                                </NavLink>
                            </NavItem>
                        </Nav>
                    </Col>
                    <Col className="sm-8">
                        <h2>TITLE HEADING</h2>
                        <h4>Title description, Dec 7, 2020</h4>
                        <div className="fakeimg">Fake Image</div>
                        <p>Some text...</p>
                        <p>
                            Sunt in culpa qui officia deserunt mollit anim id est laborum
                            consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
                            et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
                            exercitation ullamco.
                        </p>
                    </Col>
                </Row>
            </Container>
        );
    }
}
