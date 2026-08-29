//String Reverse Programme

String str="Ishwar";
String rev="";
int len=str.length();

for(int i=len-1; i>=0; i--)
  {
     rev=rev+str.charAt(i);
  }

System.out.println(rev);

===============x==============x================x==========================x=

 
======================================x=====================================================

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
    
//Fibnoccie series
     int n1=0;
     int n2=1;
     int sum=0;
     System.out.print(n1+" "+n2);

     for(int i=2; i<=10; i++)
     {
        sum=n1+n2;
        System.out.print(" "+sum);
        n1=n2;
        n2=sum;
     }

===========================x=========================================
  





  
