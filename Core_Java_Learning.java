//Collection
// -Collection used to store Group of elements
// -Collection is an root interface and this is extended in the another interfaces such as List and set interface
// -List interface implemented in the Array List class and Set implemented in the HashSet Class
// -We can not store primitive data type directly in the collection 
// -If we want to store then we can use wrapper class
// -It is coming from package- java.util

//ArrayList
ArrayList mylist= new ArryList();
//List mylist= new ArrayList();  //we can declare like this as well. becuase child object we can store into parent of variable. here List is parent
mylist.add(100); //To add the data into arraylist
mylist.size();  //To get the size
mylist.remove(3);  //To remove element
mylist.add(2,"java");  //To add the element in middle of the arraylist
mylist.get(2);  //To Accesss the specific element from the array by there index
mylist.isEmpty();  //To check whether arrauy is empty or not

//To Iterate all the data
for(Object list:mylist)
  {
    System.out.println(list);
  }


//HashMap
//Declaration
HashMap<Character,Integer> hm= new HashMap<>();
HasgMap hm = new HashMap();
//HasnMpa Methods
// 1. put(key, value) → Adds a key-value pair to the HashMap.
// 2. putAll(map) → Adds all key-value pairs from another Map.
// 3. get(key) → Returns the value associated with the given key.
// 4. getOrDefault(key, defaultValue) → Returns the value for a key, or default value if 
// 5. containsKey(key) → Checks whether the given key exists.
// 6. containsValue(value) → Checks whether the given value exists.
// 12. size() → Returns the number of key-value pairs.
// 13. isEmpty() → Checks whether the HashMap is empty.
// 15. keySet() → Returns all keys as a Set.
//  17. entrySet() → Returns all key-value pairs as a Set.

//String
String str="ishwar";
System.out.println(str.indexOf('w'));  //Output==3
System.out.println(str.indexOf('p'));  //If given element is not there then in that case it will give output as -1
//If Character not found → returns -1.

/*Constructor
Constructor name must be the same as the class name.
It does not have a return type, not even void.
It is automatically called when an object is created.
It is mainly used to initialize object variables.
It can be public, and if not mentioned then it will be default
-we can make constructor private as we do in singltone class
-It can be overload but not Override becuase constructor is always refer to class not to object
*/

//String Study
//Contains
String str="Welcome";
boolean status=str.contains("Wel");

//substring 
String str="Welcome";
String result=str.substring(0,3);  //Add start Index and end index +1
//If you pass invalid index- Exception will be - StringIndexOutOfBoundsException

//replace
String str="Welcome";
String result=str.replace('e','E');
String result=str.replace("Wel","Cel");  //If we want to string replace then pass in the string format

//replaceAll -> Replace using regex
String str="Welcome123"; 
String result=str.replaceAll("[0-9]",""); //Return=-> Welcome
//If you want to remove special symbol from the string
String str="Wel$%^come123";
String result=str.replaceAll("[^a-zA-Z0-9]","");

//trim() – Remove spaces from beginning and end
String str="   Welcome  ";
String result=str.trim();


  



