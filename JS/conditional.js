function compare(a, b) {
    if(a > b) {
        return `${a} is greater`;
    } else if(a === b) {
        return `Both are equal!`;
    }
    return `${b} is greater`;
}

let result = compare(1, 2);

console.log(result);