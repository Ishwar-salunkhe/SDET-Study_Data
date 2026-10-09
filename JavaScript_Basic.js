//=====JS Basics ==========X=======================X=======================
//Data Types-> String, Number, Boolean, Undefined, Array, Object, Null

//STring Methods
charAt();
concat();
includes();
length;  //No Bracket here
replace();
replaceAll();

//For Loop Pattern
for (let i = 0; i < 5; i++) {
    console.log(i);
}

//Print statement
console.log(`even number count is ${even}`);

//Arrays
const fruits = ["Apple", "Mango", "Banana"];
console.log(fruits[1]);
console.log(fruits.length);
fruits.push("Watermelon"); //To Add New Value In Array
fruites.pop();  //To remove the last element
fruites[0]="Pineapple"; //to Replace the Value with other value    
const fruits = ["Apple", 10, true, {name: "John"}];  //we can store any type of data in the javascript array

//JavaScript String data methods
//Split
const str="test@RahulSheety.com";
const array = str.split("@");
console.log(array[1]);
//length;
console.log(str.length);
//charAt(i);
console.log(data.charAt(3));

//Objects-> Object stores data as key-value pairs.
   const employee={
    name:"Ishwar",
    age:20,
    Address: "Pune"
   }

   console.log(employee.name);

//typeof -> Used to find the data type.

 //Data Types methods    
 str.includes("Auto")    

//Function Declaration
function Demo(){
    console.log("testing");
}
Demo(); //function calling

//Anonymous function
const greet=function(name){
    return "Hello i am "+name;
}
console.log(greet);


//==========================x==========================================================

