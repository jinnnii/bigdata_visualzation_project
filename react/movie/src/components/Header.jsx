import React from 'react';
import { Container, Nav, Navbar, NavItem, NavLink } from 'react-bootstrap';

export default function Header() {
    return (
        <>
            <Container fluid className="bg-primary text-white text-center p-5">
                <h1>My First Bootstrap5 page</h1>
                <p>반응형 웹 지원됨</p>
            </Container>
            <Navbar className="navbar-expand-sm bg-dark navbar-dark">
                <Container fluid>
                    <Nav>
                        <NavItem>
                            <NavLink href="#" active>
                                Link
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
                                disabled
                            </NavLink>
                        </NavItem>
                    </Nav>
                </Container>
            </Navbar>
        </>
    );
}
