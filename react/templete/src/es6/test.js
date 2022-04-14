//ES 6 의 변수 키워드
//let const var

var var1 = 10;
let let1 = 10;
const const1 = 10;
console.log('var로 선언한 변수: ', var1);
console.log('let으로 선언한 변수: ', let1);
console.log('const로 선언한 변수: ', const1);

var1 = 20;
let1 = 20;
const1 = 20;

console.log('var 재할당: ', var1);
console.log('let 재할당: ', let1);
// console.log('const 재할당: ', const1); const로 생성한 변수는 데이터의 재할당이 불가능하다

console.log('--------------------------------------------------');

var var1 = 30;
// let let1=30 동일한 범위 내에서 한번 선언하면 동일한 이름으로 다시 선언할 수 없음

function a() {
    let let1 = 30; // 같은 범위에 해당하지 않는다면 선언이 가능하다
}

// 맨처음 선언은 undefined
// 재선언 시 기존 것 그대로, 데이터도 그대로
// 따라서, let 사용을 권장
var var1 = 40;
console.log(var1); //40
var var1;
console.log(var1); //40

if (true) {
    var var2 = 10;
    let let2 = 10;

    console.log(`if문의 코드블럭에서 선언된 var 변수: ${var2},  let 변수 : ${let2}`);
}

console.log(`if문 밖에서 호출한 var 변수 :${var2}`);
// console.log(`let 변수 : ${let2}`);

const info = { name: '홍길동', age: 34 };
console.log(info);
// info = { name: '아가사', age: 84 };
info.name = '아가사';
info.age = 84;
console.log(info);

//무결성 내장함수 사용하기
//...push, pop , slice, shift, unshift ==> concat, slice로 변경하여 사용
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];

console.log('원본 배열 arr1 : ', arr1);
arr1.push(4);
arr1.push(5);
console.log('수정 배열 arr1 : ', arr1);

console.log('원본 배열 arr2 : ', arr2);
const arr3 = arr2.concat(4);
const arr4 = arr3.concat(5);
console.log('무결성 내장함수로 수정된 배열 : ', arr4);

console.log('원본 배열 arr4 : ', arr4);
const arr5 = arr4.slice(0, arr4.length - 1);
const arr6 = arr5.slice(0, arr5.length - 1);
console.log('무결성 내장함수로 수정된 배열 : ', 6);
