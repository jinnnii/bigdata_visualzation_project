/**
 * Axios란?
 * 자바스크립트로 비동기 통신을 할 수 있도록 해주는 모듈
 * 자바스크립트에는 기본적으로 비동기 통신을 위한 XHR(XML Http Request) 라는 것이 존재함
 * XHR을 사용하여 ajax 통신을 하는데 사용함(사용법의 어려움)
 * jquery를 사용 시, ajax통신을 쉽게 할 수 있음 $.ajax, $.get, $.post
 * frontend 개발 시, jquery의 각종 문제점 때문에 jquery를 사용하지 않게 되면서
 * 비동기 통신을 쉽게 할 수 있는 방법이 필요함
 * React 및 Vue.js 에서는 Axios 모듈을 사용하여 비동기 통신을 구현함
 * promise 기반으로 설계되어있다.
 */

/**
 *  Axios 설치
 * yarn add axios
 */

/**
 * axios 사용법
 * axios.통신방식(서버주소).then(콜백함수).catch(콜백함수);
 */

// import axios from 'axios';
const axios = require('axios').default;

//*비동기 방식을 사요하지 않는 경우
// 정상적인 동작은 되지 않지만 프로그램 흐름을 파악하기 쉬움
function logname1(userId) {
    const login = axios.get('http://loacalhost:8080?userId=' + userId);

    if (login.auth === 'success') {
        console.log(login.name);
    }
}

// *비동기 방식을 사용했을 경우(promise)
// 비동기 방식 혹은 콜백 방식에 대한 이해가 있을 경우에만 사용
function logname2(userId) {
    axios.get('http://loacalhost:8080?userId=' + userId).then((res) => {
        if (res.auth === 'success') {
            console.log(res.name);
        }
    });
}

// *async/ await 를 적용했을 경우
// 콜백에 대한 이해가 없어도 프로그램의 흐름을 쉽게 파악할 수 있음
async function logname3(userId) {
    const login = await axios.get('http://loacalhost:8080?userId=' + userId);

    if (login.auth === 'success') {
        console.log(login.name);
    }
}

axios
    .get('https://yts.mx/api/v2/list_movies.json')
    .then((resp) => {
        console.log(resp);
    })
    .catch((error) => {
        console.log(error);
    });

console.log('axios test');
