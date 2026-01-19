const fs = require("fs");
const input = fs.readFileSync(0).toString().trim();

let arr = [...input]
arr.sort()
let sortedStr = arr.join("")
console.log(sortedStr)