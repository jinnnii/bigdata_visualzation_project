import React, { Component } from 'react';
import Address from './Address';
import Info from './Info';

//문제 1. 컴포넌트 component01.js 파일을 생성하고 자신의 간단한 정보를 출력하는 페이지를 화면에 출력하세요
//..ps1. src 폴더 아래에 components01.js 생성
//..ps2. 이름 나이 성별 이메일 주소 출력
//..ps3. UI 구성은 원하는 방식대로 사용

//문제 2. 친구의 정보를 출력하는 컴포넌트 address.js 파일을 생성하고 친구의 간단한 정보를 화면에 출력하세요
//..ps1. src 폴더 아래에 컴포넌트 생성, address.js
//..ps2. 이름 성별 이메일
//..ps3. UI 구성은 원하는 방식대로 사용
//..ps4. 2명 이상 출력
//..ps5. 친구의 정보를 props를 통해서 하위 컴포넌트로 전달하여 출력

export default class AppTest extends Component {
    render() {
        return (
            <table border="1">
                <tr>
                    <th>이름</th>
                    <th>나이</th>
                    <th>성별</th>
                    <th>이메일</th>
                    <th>주소</th>
                </tr>
                <Info />
                <Address name="friend1" sex="femail" email="justice@naver.com" />
                <Address name="friend2" sex="mail" email="looky@naver.com" />
            </table>
        );
    }
}
