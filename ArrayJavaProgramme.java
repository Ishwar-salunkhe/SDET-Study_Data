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

==================x=======================================================x===============================
		  		  
//Move all zero element to end of the array
int a[]={1,0,3,0,8,12};
int result[]= new int[a.length];
int index=0;

for(int i=0; i<a.length; i++)
  {
    if(a[i]!=0)
      {
          result[index]=a[i];
          index++;
      }
  }

for(int num:result)
  {
    System.out.print(num+" ");
  }

====================x================================x====================================x====================

//Move all zero element to Start of the array
//Only index need to start from reverse side and then decrement the index
int a[]={1,0,3,0,8,12};
int result[]= new int[a.length];
int index=a.length-1;

for(int i=0; i<a.length; i++)
  {
    if(a[i]!=0)
      {
          result[index]=a[i];
          index--;
      }
  }

for(int num:result)
  {
    System.out.print(num+" ");
  }
  
  =============================x==================================x=============================================
  
//Find max number in array  
int a[]={1,2,6,7,8,12};
int max=a[0];

for(int i=1; i<a.length; i++)
  {
    if(a[i]>max)
      {
        max=a[i];
      }
  }

System.out.println(max);  

================================x===========================================x============================================
  
//Find Min number in array  
int a[]={1,3,6,7,8,12};
int min=a[0];

for(int i=1; i<a.length; i++)
  {
    if(a[i]<min)
      {
        min=a[i];
      }
  }

System.out.println(min);
===============================x=============================================x==================================================

//Find sum of the array 
int a[]={1,2,3,4,5};
int sum=0;
for(int i=0; i<a.length; i++)
{
    sum=sum+a[i];
}

System.out.println(sum);

===============================x=============================================x==================================================

//Print Array Element Indices(Index)
int[] arr = {10, 20, 30, 40, 50};
for (int i = 0; i < arr.length; i++)
  {
      System.out.println("Index: " + i);
  }

===============================x=============================================x==================================================

