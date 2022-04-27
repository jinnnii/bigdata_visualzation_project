import React from 'react';
import ReactDOM from 'react-dom/client';
// import App from './App';
// import AppTest from './AppTest';
// import AxiosTest from './AxiosTest';
import RouterTest from './RouterTest';
import Catering from './Catering';
/**
 *!라우터 사용
 */
import { BrowserRouter } from 'react-router-dom';
import Boot2 from './Boot2';

// ReactDOM : 리액트의 가상 DOM 을 의미
// createRoot : 가상 DOM 을 생성함
const root = ReactDOM.createRoot(document.getElementById('root'));

//render: 리액트의 가상 DOM을 사용하여 실제 화면을 그려줌
//StrictMode : 본연 느슨한 자바스크립트 언어에 규칙을 강화하여 적용함
//<App/> : 사용자 컴포넌트

//리액트의 기본 구성요소
// 컴포넌트 : 실제 구현될 화면, 각 JS 파일
// JSX: HTML과 JS가 합해진 형태의 문법
// PROP : 각 컴포넌트끼리 데이터를 주고받기 위한 객체, 일종의 매개변수
// root.render(
//     <React.StrictMode>
//         <Boot2 />
//     </React.StrictMode>,
// );

/**
 * 라우터 사용 렌더링
 */
root.render(
    <BrowserRouter>
        <Catering />
    </BrowserRouter>,
);
