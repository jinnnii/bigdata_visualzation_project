const qs = '?banana=100&apple=20&orange=30';

function parse1(qs) {
    var queryString = qs.substr(1);
    var chunks = queryString.split('&');
    var result = {};

    for (var i = 0; i < chunks.length; i++) {
        var parts = chunks[i].split('=');
        var key = parts[0];
        var val = Number.isNaN(Number(parts[1])) ? parts[1] : Number(parts[1]);
        result[key] = val;
    }
    return result;
}

// console.log(parse1(qs));

function parse2(qs) {
    const queryString = qs.substr(1);
    var chunks = queryString.split('&');
    var result = {};

    chunks.forEach((chunk) => {
        const [key, value] = chunk.split('=');
        result[key] = Number.isNaN(Number(value)) ? value : Number(value);
    });
    return result;
}
console.log(parse2(qs));

const arr = [1, 2, 3, 4, 5];
arr.forEach((val, idx, arr) => {
    console.log(idx, val, arr);
});
