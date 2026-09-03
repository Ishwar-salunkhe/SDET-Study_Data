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

  





  
