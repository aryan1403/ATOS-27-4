let counter = 1;
window.onload = function () {
  let data = [];

  data = JSON.parse(localStorage.getItem("data"));

  console.log(data);

  data.forEach((value) => {
    const title = value.title;
    const desc = value.desc;

    var div = document.getElementById("meow");

    var card = document.createElement("div");
    card.className = "card";
    card.style = "width: 18rem;";

    var cardImage = document.createElement("img");
    cardImage.className = "card-img-top";
    cardImage.style =
      "background-image: url('https://images.unsplash.com/photo-1615807713086-bfc4975801d0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Y2F0JTIwZmFjZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60');";

    var cardTitle = document.createElement("h5");
    cardTitle.className = "card-title";
    cardTitle.innerHTML = title;

    var cardDesc = document.createElement("p");
    cardDesc.className = "card-text";
    cardDesc.innerHTML = desc;

    var deleteBtn = document.createElement("button");
    deleteBtn.className = "btn btn-danger";
    deleteBtn.innerHTML = "Delete";
    deleteBtn.onclick = () => {
      data.splice(data.indexOf(value));
      localStorage.setItem("data", data);
      card.parentNode.removeChild(card);
    };

    card.appendChild(cardTitle);
    card.appendChild(cardDesc);
    card.appendChild(cardImage);
    card.appendChild(deleteBtn);

    div.appendChild(card);
  });
};

function decrement() {
  if (counter > 1) {
    counter = counter - 1;
    document.getElementById("count").innerHTML = "Buy " + counter;
  }
}

function increment() {
  if (counter > 4) {
    alert("only 5 in stock!");
  } else {
    counter = counter + 1;
    document.getElementById("count").innerHTML = "Buy " + counter;
  }
}
