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
