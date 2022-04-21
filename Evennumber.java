import java.util.*;
class Negative
  {
    public static void main(String args[])
    {
       int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter an array");

      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      //display an array
       System.out.println("array elements ");
      for(int i=0;i<5;i++)
        {
          if(a[i]<0)
            
    //print result
         {
          System.out.println(a[i]);
        }
          }
      }
  }