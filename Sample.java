import java.util.*;
class Factorial
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Enter factorial number ");

      for(i=1;i<n;i++)
        {
          if(n%i==0)
          {
            System.out.println(i);
          }
        }
         
    }
  }