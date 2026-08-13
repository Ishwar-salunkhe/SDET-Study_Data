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

  //Int Number Reverse Progarmme And Check Number is Palindrome or Not

        int num=12321;
        int orgNum=num;
        int rev=0;

        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }

        //System.out.println(rev);
        if(rev==orgNum)
        {
            System.out.println(orgNum+" Palindorme Number");
        }
        else
        {
            System.out.println(orgNum+" No Palindrome");
        }

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


       //Find Duplicate Number in Array

          int a[]={1,2,1,3,5,3};
          
          for(int i=0; i<a.length; i++)
          {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Duplicate Number is :"+a[i]);
                }
            }
          }

===============================x======================================================










  
