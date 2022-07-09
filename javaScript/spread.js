// ... is used to expand an array of value
const arr = ["a","b","c","d","e","f","'g'"];
console.log(...arr);
// copy array using spread operator
const arr1 = [1,2,3];
const arr2 = [...arr1, 4,5,6,7];
console.log(...arr2);
arr2.push(8);
// push multiple
arr2.push(...arr)
console.log(...arr2);

let stdName = [
    {name : "imran"},
    {name : "Sana"},
    {name : "Hafsa"},
    {name : "Kanza"},
    {name : "Mahrukh"},
];
const EditName = (oldName, newName , array) =>
  array.map(item =>{
    if(item.name === oldName){
        return {
        ...item,
        name : newName}
    }else{
        return item
    }
});
let updateName = EditName('imran', 'Wajeeha', ...stdName);
console.log(stdName[0]);



// When the spread op used as a parameter is known as resr operator
 






