import java.util.*;
class Max
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
          int max=a[0];
      //display an array
      System.out.println("maxmum value");
    
      for(int i=0;i<5;i++)
        {
          if(a[i]>max)
          {
            max=a[i]; 
            }
          }
      //print result
      System.out.println(max);
          
    }
  }