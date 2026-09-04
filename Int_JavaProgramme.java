//Pyramid Number Patern Programme

int num = 1;
for (int i = 1; i <= 4; i++)
  {
      // Print spaces
      for (int j = 1; j <= 4 - i; j++)
      {
          System.out.print(" ");
       }

      // Print numbers
      for (int j = 1; j <= i; j++)
        {
           System.out.print(num + " ");
            num++;
        }

     System.out.println();

 }

=================x==================================================

  //Prime Number ==> Number which is divided by 1 and by itself which is prime Number
     int num=7;
     int count=0;

     for(int i=1; i<=num; i++)
     {
        if(num%i == 0)
        {
            count++;
        }
     }

     if(count==2)
     {
        System.out.println(num+" NUmber is prime");
     }
     else
     {
        System.out.println(num+ "Not prime");
     }

//==================================================================================

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

=====================================x=================================

  //Swapping Int numbers without Third variable
int a=10;
int b=20;

a=a+b;
b=a-b;
a=a-b;

System.out.println("After swapping a: "+a);
System.out.println("After swapping b: "+b);
System.out.println("After swapping "+a);

=========================================x==========================================================
      
  //Count even and odd numner
      int num=12345;
      int even=0;
      int odd=0;

      while(num>0)
      {
        int digit=num%10;
        if(digit%2==0)
        {
            even++;
        }
        else
        {
            odd++;
        }
        
        num=num/10;
      }

      System.out.println("even number count is "+ even);
      System.out.println("odd number count is "+ odd);

===============================x==================================================================

  //Factorial Programme
      int num=5;
      int fact=1;

      for(int i=1; i<=5; i++)
      {
         fact=fact*i;
      }

      System.out.println(fact);

===================================x==================================x===============================

  //Fibnoccie Series
  
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

=================x===================================x=========================================

  //Find the missing Number in Array
  //It will work when - No duplicte and Number should be in range
int a[]={1,5,4,2,6};
int sum1=0;
int sum2=0;

for(int i=0; i<a.length; i++)
  {
      sum1=sum1+a[i];
  }
       
for(int i=1; i<=6; i++)
  {
    sum2=sum2+i;
  }

int missingNumber=sum2-sum1;
System.out.println("Missing number is "+missingNumber);

=============================x===================================================





  
