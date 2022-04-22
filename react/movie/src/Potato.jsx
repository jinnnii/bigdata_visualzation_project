import React, { Component } from 'react';

export default class Potato extends Component {
    render() {
        console.log(this.props);
        return <div>I Potato U</div>;
    }
}

// 1. object 타입의 변수 props가 가지고 있는 키 명을 사용하여 출력
// let data = props.data
// 2. ES5 버전의 객체 분할 할당을 통해서 object 타입의 변수 props 의 key명을 사용하여 새로운 변수에 데이터를 할당하고 jsx 부분에서 해당 변수 사용
//return <h3>i love {props.data}</h3>
// 3. ES6 버전의 객체 분할 할당을 통해서 object 타입의 변수 props의 key 명을 새로운 변수명으로 사용하고, 해당 key의 값을 새 변수의 값으로 할당하여 사용
//const {data}= props;
// 4.

//export : 해당 파일을 외부에서 impot할 경우 외부에서 지정한 함수,  class, 변수 등을 사용할 수 있도록 설정하는 명령어
//default : 해당 파일을 import할 경우, 기본적으로 사용할 수 있는 함수 및 클래스, 변수 등으로 등록
