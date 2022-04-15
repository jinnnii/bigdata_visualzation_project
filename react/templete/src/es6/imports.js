// 라이브러리 의존성 관리

// 로딩하는 모듈
import Math from './Math';

// 모듈 내의 특정 함수나 변수를 직접 참조
//import {Math} from './Math';

//로딩한 모듈의 이름이 다른 모듈의 이름과 겹칠 경우 이름 변경
//import {Math as mt} from './Math';
function Func() {
    Math();
}

function Func2() {
    console.log('func2');
}
//외부에서 해당 모듈의 변수나 함수등의 이름을 알려주는 역할
//export를 해야지만 import 가능

//변수를 외부에 노출하여 외부에서 호출할 수 있도록 설정
export const CONST_VALUE = 0;

// default : import했을 때 기본적으로 가져와지는 함수 혹은 변수 지정
// 모듈 로딩 시, 기본으로 참조할 수 있도록 설정
export default new Func();

// const num1 = 3;
// const num2 = 4;

// const sum = Math.sum(num1, num2);
// const pi = Math.pi;

// console.log(sum);
