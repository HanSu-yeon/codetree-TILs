const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');
const N = Number(input[0]);

// Please write your code here.
function f(n){
    if(n === 0){
        return 1
    }

    return f(n-1) * n
}
console.log(f(N))