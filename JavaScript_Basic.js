//=====JS Basics ==========X=======================X=======================
//Data Types-> 
//Premitive Data types 
//-> String, Number, Boolean, Undefined, Null

//Non Premetive -> Array, Object, Function, date, regex

/*
Q-What is JavaScript?
-> Javascript is a scripting language and it is used to convert static web page into
 dynamic ad intercative web pages

Q- Types of Functions
-> 1.Named/Generic Function
   2.Anonymous function
   3.Arrow Function
   4.Call Back function

 Q- What is Promises?
 -> It is the way to handle the asynchronous operations and those are- Pending, Rejection and Fullfilled



*/

//Q- Diff between VAR, CONST and LET
var — can redeclare and reassign
Example:
var name = "Ishwar";
var name = "Rahul";
name = "Amit";
console.log(name); // Amit

let — can reassign, but cannot redeclare in the same scope
let age = 25;
age = 30; // Allowed
// let age = 35; // Error in the same scope
console.log(age); // 30

const — cannot be reassigned
const browser = "Chrome";
// browser = "Firefox"; // TypeError
console.log(browser); // Chrome
*/

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

//CallBack Function
//callback function is a function which is pass as an argument/parameter to the another function
//Example
function greet(name) {
    console.log("Hello " + name);
}
function display(callback) {
    callback("Ishwar");
}
display(greet);

/*Q- Diff between == and === ?
//  == Compare value only and === compare value and data type as well

Q-What is NaN?
-> Not a Number -> it indicate that value is not valid number




*/






//==========================x==========================================================

