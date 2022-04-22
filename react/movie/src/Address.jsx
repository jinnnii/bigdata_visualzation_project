import React, { Component } from 'react';

export default class Address extends Component {
    render() {
        return (
            <tr>
                <td>{this.props.name}</td>
                <td>-</td>
                <td>{this.props.sex}</td>
                <td>{this.props.email}</td>
                <td>-</td>
            </tr>
        );
    }
}
