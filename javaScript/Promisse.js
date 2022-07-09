// 
function getUsers(){
    return[
        {username : "Imran", email : "imran@gmail.com", age : 21},
        {username : "Hasnain", email : "Hasnain@gmail.com", age : 22}
    ];
}
// this fnction is Sychronous
function findUser(username){
  const users = getUsers();
  const user = users.find((User)=> User.username === User.username)
//   const  user1 = users.find((user) => user.username === user.username);
  return user;
}

//console.log(findUser('Hasnain'));

// in above e.g there is no call data from api's time is not taking
// Now we will apply Promise and add delay as a api's time
// e.g bellow data come from db then take time
function getUsersByDely(){
 let users = [];
   setTimeout(() => {
    users = [
        {username : "Imran", email : "imran@gmail.com", age : 21},
        {username : "Hasnain", email : "Hasnain@gmail.com", age : 22}
    ];
   }, 3000);
   return users;
}

const findDataFromDB = (username) =>{
    const data = getUsersByDely();
    const user = data.find((User)=> User.username === User.username);
    return user; 
}
let userData = findDataFromDB('Imran');
//console.log(userData); //outPut will be undefined
// coz getUser is Empty array
// how to access users , one classical approach is used callback 

// +++++++ Using Callbacks deals with asynchronous operation
function getUsersByDely1(callback){
      setTimeout(() => {
       callback([
           {username : "Imran", email : "imran@gmail.com", age : 21},
           {username : "Hasnain", email : "Hasnain@gmail.com", age : 22}
       ]);
      }, 1000);
   }

const findDataFromDBUsingCallBack = (username,callback) =>{
    getUsersByDely1((users)=>{
     const user = users.find((User)=> User.username === User.username);
     callback(user); 
 })}
findDataFromDBUsingCallBack('Hasnain',console.log)

// in callback adds complexity 
// PROMISE:
// promise is an object that encapsulates the result 
// of an asynchronous operation
// 1 .2 callback => 1 res, 2 rej
// 2 .asynchronous success => call resolve
// 3 .error => then call reject
// 4 .then() =>get the value of a promise

// ================================================================






