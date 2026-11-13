//=====JS Basics ==========X=======================X=======================
//Data Types-> 
//Premitive Data types 
//-> String, Number, Boolean, Undefined, Null, BigInt, symbol
//JavaScript is a single Threaded language

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

 Q- Diff between Null and Undefined?
 -> Undefined-> We have declare the variable but does not assigned any value. Data type will be Undefied
 For undefined, we can assigned value later.
 Null-> we have declare the variable and assigned the value as Null. Data type for null is Object
 Null also we can reassigned later

 Q-What is Array Destrcturing?
 -> Extracting values from objects or arrays.
 

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

 //Object
 const users= {
  name:"ishwar",
  RollNo: 201,
  Desination: {  //Nested object
    Grade:"A"
  }
}
console.log(users.name);  //ishwar
console.log(users.Desination);  //{Grade:'A'};
console.log(users.Desination.Grade); //A

//Spread operator
//Copies or expands object/array properties.
//Important: This creates a shallow copy, not a deep copy.
const user = {
    name: "John",
    city: "Pune"
};

const copy = { ...user };   //Spread operator
console.log(copy);

//Imp Quetion in int asking for output
const user = {
    name: "John",
    address: {
        city: "Pune"
    }
};

const copy = {...user};
copy.address.city = "Mumbai";
console.log(user.address.city); //Output- Mumbai 

//Array Methods
//Direct reverse method is also there
//map()
const names = ["ishwar", "rahul", "amit"];
const newNames = names.map(name => name.toUpperCase());
console.log(newNames);  //[ 'ISHWAR', 'RAHUL', 'AMIT' ]

const employees = [
    { name: "Amit", salary: 40000 },
    { name: "Rahul", salary: 60000 },
    { name: "Priya", salary: 75000 }
];

const name = employees.map(emp => emp.name);
console.log(name); // [ 'Amit', 'Rahul', 'Priya' ]


//String Methods
charAt();
concat();
includes();
length;  //No Bracket here
replace();
replaceAll();
slice();
splice();

//For Loop Pattern
for (let i = 0; i < 5; i++) {
    console.log(i);
}

//for of loop
for(const n of num)
{
 console.log("test");
}

//Template Literals - Use backtick
console.log(`even number count is ${even}`);

//Arrays
//typeOf- Array type of will be Object
const fruits = ["Apple", "Mango", "Banana"];
console.log(fruits[1]);
console.log(fruits.length);
fruits.push("Watermelon"); //To Add New Value In Array at the last index
fruits.unshift("Watermelon"); //To Add New Value In Array at the start of the array
fruites.pop();  //To remove the last element
fruits.shift("Watermelon"); //delete the start element from an array
fruites[0]="Pineapple"; //to Replace the Value with other value    
const fruits = ["Apple", 10, true, {name: "John"}];  //we can store any type of data in the javascript array

const marks =[10,20,30];
marks[2]=300; //Use to change the value of element
makrs[5] //Error as Undefined
consol.log(marks) // [10,20,300]

const books = ["marathi", "Hindi", "English"];
for(const book of books)
{
  console.log(book.toUpperCase());  //we can print all this in Uppercase
}

//slice method
const fruits = ["Apple", "Mango", "Banana","Kivi", "Grapes"];
console.log(fruits.slice(1));    //output= ["Mango", "Banana","Kivi", "Grapes"];
console.log(fruits.slice(2,5));  //output= ["Banana","Kivi", "Grapes"];

//JavaScript String data methods
//Split
const str="test@RahulSheety.com";
const array = str.split("@");
console.log(array[1]);
//length;
console.log(str.length);
//charAt(i);
console.log(data.charAt(3));

//Slice-> it is used to extract the small portion of the string OR Array (Similar to Java substring method)
const name = "JavaScript";
const result = name.slice(0, 4);
console.log(result); //output = Java

//splice() => Used to add,remove and replace the element, It will change the original array

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

//Try Catch Block
try {
    console.log("Inside try block");
} catch (error) {
    console.log("Error occurred");
} finally {
    console.log("Finally block executed");
}

/*Q- Diff between == and === ? (== loose equality and === strict equaliy)
//  == Compare value only and === compare value and data type as well

Q-What is NaN?
-> Not a Number -> it indicate that value is not valid number

Q- What is Hoisting in Javascript?
-> Hoisting is a Javascript behaviour of moving variable and function declaration to the top of there scope before the executions

Q- What is the diff between the map(), filter(), find() and forEach()?
-> All are the Arrays methods
map()-> It transform the element and return new array
filter()-> It return the new array which contains the elements that satisfy the conditions
find()-> it return the firts mathcing element
forEach()-> It will iterate through the each element .Not returing new aray
Example: 
const numbers = [10, 20, 30, 40, 50];
const result = numbers.map(n => n * 2);
console.log(result);
// [20, 40, 60, 80, 100]

const result = numbers.filter(n => n > 25);
console.log(result);
// [30, 40, 50]

console.log(5 + "5");  //55
console.log(5 - "2"); //3
console.log("10" * 2); //20
Explain- + performs string concatenation when one operand is a string. Other arithmetic operators convert numeric strings into numbers.

const user = {
    name: "John"
};

user.name = "Rahul";
console.log(user.name); //output -> Rahul
//You can modify object properties declared using const. You cannot reassign the entire object variable.


*/

//==========================x==========================================================

