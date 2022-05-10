import React, { Component } from 'react';

/**
 * 문제2. state객체에서는 변수를 추가하여 해당 변수의 값을 매 1초마다 확인하고,
 *       해당 변수의 값이 0이 될 때 화면에 출력하는 글자를
 *       We Are Ready !! 로 변경하는 프로그램을 작성하시오
 * ps1. 로딩 중일 때는 Loading... x 로 화면에 글자를 출력함
 */
export default class App3 extends Component {
    state = {
        count: 5,
        isLoading: true,
    };
    componentDidMount() {
        console.log('mount');
        setTimeout(() => {
            this.setState({ count: this.state.count - 1 });
        }, 1000);
    }

    componentDidUpdate() {
        console.log('update');
        let timer = setTimeout(() => {
            if (this.state.count > 0) {
                this.setState({ count: this.state.count - 1 });
            } else {
                this.setState({ isLoading: false });
            }
        }, 1000);
        if (this.state.isLoading == false) {
            clearTimeout(timer);
        }
    }
    render() {
        const { isLoading, count } = this.state;
        return <div>{isLoading ? `Loading...${count}` : 'We are ready'}</div>;
    }
}
