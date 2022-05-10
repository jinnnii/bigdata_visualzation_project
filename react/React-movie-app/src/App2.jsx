import React, { Component } from 'react';
import PropTypes from 'prop-types';
/**
 * 문제1. class 형 컴포넌트를 생성하고 화면에 현재 채널, 볼륨을 표시하고, 볼륨 up/down
 * 채널 up/down 버튼을 생성하여 버튼을 클릭시 마다 현재 채널 및 볼륨의 크기가 변경되는 프로그램을 작성하시오
 *
 * ps1. 볼륨은 0 ~ 15, 0이하로 내려갈 수 없음 15이상 올라갈 수 없음
 * ps2. 채널은 1 ~ 15, 1이하로 내려가면 최대값 15가 출력, 15이상 올라가면 1이 출력
 * ps3. 각각 볼륨 및 채널은 1씩 변경될 수 있음
 */
class App2 extends Component {
    state = {
        chanel: 1,
        volumn: 0,
    };
    volumUp = () => {
        const volumn = this.state.volumn + 1 > 15 ? 15 : this.state.volumn + 1;
        this.setState({ volumn });
    };
    volumDown = () => {
        const volumn = this.state.volumn - 1 < 0 ? 0 : this.state.volumn - 1;
        this.setState({ volumn });
    };
    chanelUp = () => {
        const chanel = this.state.chanel + 1 > 15 ? 1 : this.state.chanel + 1;
        this.setState({ chanel });
    };
    chanelDown = () => {
        const chanel = this.state.chanel - 1 < 1 ? 15 : this.state.chanel - 1;
        this.setState({ chanel });
    };

    render() {
        return (
            <>
                <h1>현재 채널 : {this.state.chanel}</h1>
                <h1>현재 볼륨 : {this.state.volumn}</h1>
                <button onClick={this.volumUp}>볼륨 업</button>
                <button onClick={this.volumDown}>볼륨 다운</button>
                <button onClick={this.chanelUp}>채널 업</button>
                <button onClick={this.chanelDown}>채널 다운</button>
            </>
        );
    }
}

export default App2;
