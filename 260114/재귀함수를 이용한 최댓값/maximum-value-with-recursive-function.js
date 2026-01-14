const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');
const n = Number(input[0]);
const arr = input[1].split(" ").map(Number);

// Please Write your code here.
function maxValue(a){
    //a는 배열 인덱스
    //종료조건
    if(a === 0 ) return arr[0]
    
    //재귀
    return Math.max(maxValue(a-1), arr[a])
}

console.log(maxValue(n-1))