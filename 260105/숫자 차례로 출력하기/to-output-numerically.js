const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');
const n = Number(input[0]);

// Please Write your code here.
function printNum(n){
    if(n === 0){
        return;
    }
    printNum(n-1)
    process.stdout.write(n + " ");
}

function printNum2(n){
    if(n===0){
        return;
    }
    process.stdout.write(n + " ");
    printNum2(n-1)


}

printNum(n)
console.log()