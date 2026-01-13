const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');
const n = Number(input[0]);
// Please Write your code here.

function getCnt(n){
    //1이되면 종료
    if(n === 1){
        return 0
    }

    if(n % 2 ===0){
        return getCnt(parseInt(n/2))+1
    }else{
        return getCnt(parseInt(n/3))+1
        
    }
}

console.log(getCnt(n))