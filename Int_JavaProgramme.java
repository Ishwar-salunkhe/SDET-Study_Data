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
