let cartItems = [];

function addToCart() {
  const title = document.getElementById("cardT").innerHTML;
  const desc = document.getElementById("cardD").innerHTML;

  const data = { title, desc };
  // let pre = JSON.parse(localStorage.getItem("data"));

  cartItems.push(data);
  cartItems = [...JSON.parse(localStorage.getItem("data")), data];

  if(cartItems[0] === null) {
      cartItems = cartItems.reverse();
      cartItems.pop();
      cartItems = cartItems.reverse(); 
  }

  localStorage.setItem("data", JSON.stringify(cartItems));
}
