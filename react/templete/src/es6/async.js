console.log('시작과 동시에 실행하는 부분');

setTimeout(() => {
    console.log('5초 후에 실행되는 부분');
}, 5000);

console.log('마지막에 실행되는 부분');

function getData(callback) {
    return new Promise((resolve, reject) => {
        $.get('http://localhost:8080/ajax?data=ok', (response) => {
            if (response == 'success') {
                resolve(response);
            } else {
                reject(response);
            }
        });
    });
}

getData().then().catch();
