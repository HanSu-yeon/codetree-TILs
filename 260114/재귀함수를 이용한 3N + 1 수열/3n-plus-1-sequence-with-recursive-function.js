const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');

let n = Number(input[0]);
let cnt =0
// Please Write your code here.
function f(n){
    if(n===1){
        return cnt 
    }
    cnt++
    if(n%2 ===0){
        return f(parseInt(n/2))
    }else{
        return f(n*3+1)
    }
}

console.log(f(n))