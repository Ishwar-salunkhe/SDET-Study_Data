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



