# JavaScript Notes

## Variables
`let` and `const`
Always use const unless the value needs to change.

## Arrow Functions
`const add = (a, b) => a + b;`
Shorter syntax for writing functions.

## DOM Manipulation
// Change text content
`document.getElementById("demo").innerHTML = "Hello";`
Used to interact with HTML elements dynamically.

## Promises and Async/Await
```javascript
async function getData() {
    let res = await fetch('url');
    let data = await res.json();
}
```
Used for handling asynchronous operations like API calls.