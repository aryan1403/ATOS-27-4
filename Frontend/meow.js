let counter = 1;

function increment() {
    counter = counter + 1;
    if(counter > 5) {
        alert('only 5 in stock!');
    } else {
        document.getElementById('count').innerHTML = "Buy " + counter;
    }
}