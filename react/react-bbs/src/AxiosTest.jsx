import React, { Component } from 'react';
import axios from 'axios';

export default class AxiosTest extends Component {
    /**
     * 스프링부트로 생성한 로컬 서버에 접속 시 오류가 발생함
     * CORS(Cross-Origin-Resource-Sharing)
     * : 리소스 요청 시 서버의 주소와 요청하는 곳의 주소가 같아야 한다는 오류
     * : http 헤더를 사용하여 한 출처에서 실행중인 웹 애플리케이션이 다른 출처의 자원에 접근할 경우 오류가 발생함
     *
     * package.json 에서 proxy : 로컬주소를 입력해 주어야 함
     * 만약 오류가 또 발생하는 경우, 스프링부트 쪽에서 설정해 주어야 함
     *
     *
     * 1. 리액트의 package.json 파일에 "proxy" : 서버 주소를 추가하는 방법
     * 2. 스프링서버에 처리하는 방식
     *      2.1. @CorsOrigin 어노테이션 사용 방식(컨트롤러파일에 사용)
     *      2.2. WebMvcConfigurer 에서 설정
     */
    getData = () => {
        axios
            .get('/ajax/boardList')
            .then((res) => {
                console.log('axios 통신 성공');
                console.log(res);
            })
            .catch((err) => {
                console.log('axios 통신 실패');
                console.log(err);
            });
    };

    render() {
        return (
            <div>
                <h1>리액트로 서버와 통신하기</h1>
                <button type="button" onClick={this.getData}>
                    통신하기
                </button>
            </div>
        );
    }
}
