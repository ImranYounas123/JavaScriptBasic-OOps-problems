const numbers = [16];
// numbers.map(item => console.log(Math.sqrt(item)));
// 
let info = [
    {
        id : "1",
        product : "apple",
        quantity : 3,
        rate  : 200,
    },{
        id : 2,
        product : "banana",
        quantity : 1,
        rate  : 4200,
    }
]

const Mapfind = () =>{
    info.map(item => {
        // console.log(item.id);
        console.log(item.id*3);
    })
}
Mapfind();
 




