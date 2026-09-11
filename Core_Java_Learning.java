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

    //We Can store diff types of data in hashmap
    HashMap<Object, Object> hm= new HashMap<>();
    hm.put("Name","Ishwar");
    hm.put("Roll No",12);
    System.out.println(hm.entrySet());  //Ouput: [Roll No=12, Name=Ishwar]
=====================x============================================================================

  //Interface Points
  //Interface contain abstract, default and static method
  //we can declare default method as below which can have body implementation
  // For default method- we need to declare default keyword
  //Methods are public abstract by default
  //Variables are public static final by default
  //we can achieve mulitple Inheritance
  //We can not create object of interface but we can create ref varibale
  //An interface can have a main() method becuase main is a static method so we can have it
  //We cannot override an interface static method in the child class
  default void show()
    {     
       System.out.println("Show"); // ✅ default method 
    }

  //Abstract method
    void show();  //No need to declare public and abstartc keyword as it is by default in nature

  //Static methods cannot be overridden because they belong to the class rather than the object. 
  //If a child class defines a static method with the same signature as the parent, it is called method hiding, not method overriding.

//Encapsulation
class Employee {
    private String name;   // private data

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
  
  








  
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

//======== > String Concepts <================
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
//We can use like below as well
String str="$15,20,30";  //Remove $ and , from string
String result=str.replace("$","").replace(",","");

//replaceAll -> Replace using regex
String str="Welcome123"; 
String result=str.replaceAll("[0-9]",""); //Return=-> Welcome
//If you want to remove special symbol from the string
String str="Wel$%^come123";
String result=str.replaceAll("[^a-zA-Z0-9]","");

//Scenario Based Quetions
//Fetch the OTP from this user message
String str = "Dear customer, your OTP is 458921. It is valid for 5 minutes.";
String otp=str.replaceAll(".*\\b(\\d{6})\\b.*","$1");
//Explaination
//-> \\d{6} //\\d → any digit from 0-9 and {6} → exactly 6 digits and to The parentheses create a capturing group:(\\d{6})
//-> \\b means word boundary.
//-> "$1" -> Replace the entire matched string with Group 1.
System.out.println(otp);

//trim() – Remove spaces from beginning and end
String str="   Welcome  ";
String result=str.trim();

//split() – Split String using delimeter- @, ; : , etc
String str="ishwar@gmail.com";
String a[]=str.split("@");  //Output-> ishwar
//Scenario Based Quetion on split methos
//1.Fethc the only OTP from this text OR string
String str="OTP:458921";
String a[]=str.split(":");
System.out.println(a[1]);

//2. Fetch the OTP from this message
String str="Your OTP is 782345. Please use it.";
String result=str.replaceAll("[^0-9]","");

//concat() – Join two Strings
String s1="Welcome";
String s2=" To Java";
System.out.println(s1.concat(s2));

//valueOf() – Convert other data types to String such as int, char, double
int num=100;
String str=String.valueOf(num);

//Convert String into Int
String str = "123456";
int number=Integer.parseInt(str);

//indexOf() – Find index of character/text
String str="Wecome";
int ind =str.indexOf('c');  //Output-> 2

//StringBuffer Declaration
StringBuffer sf= new StringBuffer("welcome");
System.out.println(sf);

//StringBuilder Declaration
StringBuilder sf= new StringBuilder("welcome");
System.out.println(sf);

//Arrays Method
Arrays.toString() // To print Array in readable format
Arrays.sort(a); //To sort the array in ascending order
int a[]={12,1,24,56,60};
Arrays.sort(a);
System.out.println(Arrays.toString(a));  //Output: [1, 12, 24, 56, 60]

//To Add Multiple Conditions
int a=2;
int b=2;

if(a==b)
{
     System.out.println("Both Are Equals");
}
else if(a>b)
{
     System.out.println("a Is gerater");
}
else if(a<b)
{
     System.out.println("b Is gerater");
}
else
{
     System.out.println("Invalid");
}

//SingleTone class
class Singleton {

    // Create one object of Singleton class
    private static Singleton obj = new Singleton();

    // Private constructor
    private Singleton() {
    }

    // Method to get the object
    public static Singleton getInstance() {
        return obj;
    }
}


//Read Data from Properties file
String filepath="src/test/resource/data/GlobalData.properties";
FileInputStream file= new FileInputStream(filepath);
Properties properties= new Properties();
properties.load(file);
String value=properties.getProperty("Key");
file.close();

===============x====================================
  //To Get the Input from User //import java.util.Scanner;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the in Number :");
int num=sc.nextInt();

/*========================================================================
 Q-What are the Java 8 Features 
  1.Lambda expressions,
  2.Stream API,
  3.Date/Time API.
  ->Java 8 Date and Time API provides classes like LocalDate, LocalTime, and LocalDateTime to handle dates and times more easily and safely.
  4.Functional Interfaces,
  5.Default and Static Methods in Interface
  6.Method References
  7.Optional class
  ->Optional class is a Java 8 feature used to represent a value that may or may not be present and helps avoid NullPointerException.
  8.MetaSpace

  4.Functional Interface
  -> It should have only one abstract method which we can use with lambda expression and method references

  #Lambda expressions,
  -> short way of writing a function/implementation which reduce the boilerplate(repetitive) code.
  ->list.forEach(options -> System.out.println(options));
  -> Runnable obj = () -> System.out.println("Hello");

  #Method References
  -> Method reference used to refer to an existing method using :: instead of writing a Lambda expression.

  #Stream API
  -> It is used to Process Collections of data in a simple and efficient way using operations like filter(), map(), sort(), and collect().



  
  */

  



