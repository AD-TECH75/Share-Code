console.log("ok")

const endPoint = "https://reqres.in/api/users"

fetch(endPoint, { 
    method: "POST",
    headers: {
        "content-type": "application/json"
    },
    body: JSON.stringify({
    email: "aaaa3333@gmail.com",
    firstName: "hehehe",
    })
})
    .then((result) => result.json())
    .then((data) => console.log(data))
