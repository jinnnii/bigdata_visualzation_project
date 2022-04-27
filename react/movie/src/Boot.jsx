import React, { Component } from 'react';
import { Button, Container } from 'react-bootstrap';

import 'bootstrap/dist/css/bootstrap.min.css';

export default class Boot extends Component {
    render() {
        return (
            <Container className="bg-primary text-white text-center p-5">
                <Button variant="btn">기본 버튼</Button>
                <Button variant="btn btn-primary">primary 타입</Button>
                <Button variant="btn btn-success">success 타입</Button>
                <Button variant="btn btn-info">info 타입</Button>
                <Button variant="btn btn-warning">warning 타입</Button>
                <Button variant="btn btn-outline-info">outline 타입</Button>
                <Button variant="btn btn-outline-warning">ourline-warning 타입</Button>
                <Button variant="danger">테마색상 danger</Button>
                <Button variant="light">테마색상 light</Button>
                <Button variant="link">link 버튼용</Button>
            </Container>
        );
    }
}
