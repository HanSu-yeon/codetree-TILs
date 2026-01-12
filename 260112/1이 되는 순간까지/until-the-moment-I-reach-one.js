const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');
const n = Number(input[0]);
// Please Write your code here.

function getCnt(n, cnt) {
    if (n === 1) {
        return cnt
    }
    if (n % 2 === 0) {
    cnt++
        return getCnt(parseInt(n / 2))


    } else {
        return getCnt(parseInt(n / 3))

    }
    


}

let cnt = 0
getCnt(n, cnt)