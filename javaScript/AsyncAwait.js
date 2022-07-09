const doSomethingAsync = () => {
  return new Promise((res, rej) => {
    setTimeout(() => res("i did something"), 3000);
  }).then();
  rej("Spmething Wrong");
};
const doSomething = async () => {
  const doSomething = await doSomethingAsync();
  console.log(doSomething);
};
console.log("before");
doSomething();
console.log("after");

// e.g
// await => will wait for promise
// async => A function that handle asynchronous operations

function getUsersByDely() {
  let users = [];
  setTimeout(() => {
    users = [
      { username: "Imran", email: "imran@gmail.com", age: 21 },
      { userq21name: "Hasnain", email: "Hasnain@gmail.com", age: 22 },
    ];
  }, 3000);
  return users;
}
const findUser = async (username) => {
  const users = await getUsersByDely();
  const User = await users.find((user) => user.username === user.username);
  //    const User = await users.find((user)=>user.username === user.username);
  return User;
};
let getData = findUser("Hasnain");
console.log(getData);
