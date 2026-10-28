       //What will be the output
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2);  //False -> == Compare Object refrence
        System.out.println(s1.equals(s2));  //true -> compare only value contains
============================x=========================================

        String s = "Hello";
        s.concat(" World");
        System.out.println(s);  //Hello
//Why? Strings are immutable. concat() returns a new String, but the result is not assigned back to s.
==========================================x===========================================

  


