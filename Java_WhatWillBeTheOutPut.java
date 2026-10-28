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

       Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        System.out.println(set.size());  //3
        System.out.println(set.contains(10));  //true
//Why? A HashSet does not store duplicate elements. The order of its elements is not guaranteed.

=========================x============================x=======================

       Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Selenium");
        map.put(1, "Playwright");

        System.out.println(map.size());  //2
        System.out.println(map.get(1));  //Playwright
//Why? A map cannot have duplicate keys. Putting a new value for key 1 replaces the old value.

======================x===============================x====================================x=======================
       

  


