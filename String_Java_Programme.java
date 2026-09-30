//String Reverse Programme

String str="Ishwar";
String rev="";
int len=str.length();

for(int i=len-1; i>=0; i--)
  {
     rev=rev+str.charAt(i);
  }

System.out.println(rev);

================x=============================x=============================================

  //TO Check Strig is Palindrom or not
        String str="ishwar";
        String rev="";
        int len=str.length();
        
        for(int i=len-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }
      

        if(rev.equals(str))
        {
            System.out.println("String is Palindrome "+str);
        }
        else
        {
            System.out.println("No Palindorme");
        }

===============x==============x================x==========================x=

      //Find Duplicate Charcters in String
String str="Ishwarhs";

for(int i=0; i<str.length(); i++)
   {
 for(int j=i+1; j<str.length(); j++)
     {
          if(str.charAt(i)==str.charAt(j))
            {
              System.out.println("Duplicate is : "+str.charAt(i)); 
            }
      }
   }
==========================================================================================

  //Find Duplicate word in the String
        String str="i love my india india is my love";
        String a[]=str.split(" ");

        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i].equals(a[j]))  //same apporch as we have used for other- just use equals here
                {
                    System.out.println(a[i]+" Duplicate words");
                }
            }
        }

==========================================================================================================
    //Same above programme with Duplicate Count
    String str = "Ishwhara";
    for (int i = 0; i < str.length(); i++) {
    int count = 1;

    for (int j = i + 1; j < str.length(); j++)
      {
        if (str.charAt(i) == str.charAt(j))
        {
            count++;
        }
      }

    if (count > 1) 
    {
        System.out.println("Duplicate character is "+ str.charAt(i) + " and count is " + count);
    }
}

===========================================================================================================

      //Get the count of specific word in the string
        String str="i love my india india is my love";
        String a[]=str.split(" ");
        int count=0;

        for(int i=0; i<a.length; i++)
        {
            if(a[i].equals("india"))
            {
                count++;
            }
        }

        System.out.println(count);
=========================================================================================================


  //Get The Count of each Characters in the string

       String str="Welcome to Automation";
     str=str.replace(" ","");
     char a[]=str.toCharArray();
     HashMap<Character,Integer> hm = new HashMap<>();

     for(char ch:a)
     {
        hm.put(ch,hm.getOrDefault(ch,0)+1);
     }

     for(char c:hm.keySet())
     {
        System.out.println(c+" : "+hm.get(c));
     }

     //Instead of KeySet- We can use EntrySet as well- Just Alternate Option
     for(Map.Entry<Character, Integer> entry : hm.entrySet())
     {
         System.out.println(entry.getKey() + " : " + entry.getValue());
     }

    //import java.util.HashMap; -> Need to import this If you keySet method
    //import java.util.Map;  -> need to import both if you use entrySet Method

===========================================x=============================================

     //Get the count of each word-(Not character) in the string
        String str="i love my india india is my love";
        String a[]=str.split(" ");

        HashMap<String,Integer>hm = new HashMap<>();

        for(String word:a)
        {
            hm.put(word,hm.getOrDefault(word,0)+1);
        }

        for(String wordText:hm.keySet())
        {
            System.out.println(wordText+" = "+hm.get(wordText));
        }

==========================================================================================================

    //Substring Programme
//Print only specific charcters from string- such as Print only Automation
//Count the index which we need to remove such as java need to remove so last index is 3+1=4  
String str="JavaAutomation";
String result=str.substring(4);
System.out.println(result);

===========================x=========================================

  //Find first Non repatable charcter in the string
  String str="swiss";
      HashMap<Character, Integer> hm = new HashMap<>();

      char a[]=str.toCharArray();

      for(char ch:a)
      {
        hm.put(ch,hm.getOrDefault(ch,0)+1);
      }

      for(char ch:a)
      {
        if(hm.get(ch)==1)
        {
            System.out.println("Charatcer is "+ch);
            break;
        }
      }

=================================================x=======================================================================

//Replace specific word in the String sentense  
String str="Welcome to Java and Python Automation";
String temp="temp";

 str=str.replace("Java",temp);
 str=str.replace("Python", "Java");
 str=str.replace(temp,"Python");

System.out.println(str);

===========================================================================

      //Replace vovels with * in String Tomorrow
      String str="Tomorrow";
      str=str.toLowerCase();
      String result="";
     
      for(int i=0; i<str.length(); i++)
      {
        char ch=str.charAt(i);
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o'|| ch=='u')
        {
           result=result+"*";
        }
        else
        {
          result=result+ch;
        }

      }

      System.out.println(result);
==============================x==================================x=============x
//String Anarame Programme
      String s1="java";
      String s2="vaja";

      char arr1[]= s1.toCharArray();
      char arr2[]=s2.toCharArray();

      Arrays.sort(arr1);
      Arrays.sort(arr2);

      if(Arrays.equals(arr1,arr2))
      {
        System.out.println("Anagrame");
      }
      else
      {
        System.out.println("No");
      }

===================x==============================x==================================

//Secondary Programme (Non Priority)
String str="java";
String result="";
for(int i=0; i<str.length(); i++)
 {
   char ch=str.charAt(i);
    if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
      {
        result=result+ch;
      }
    }

System.out.println(result);  
===================x=========================x=====================
  

  





  
