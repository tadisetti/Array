import java.util.*;
class Sumevennumber
  {
    public static void main(String args[])
    {
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter an array");
       int sum=0;
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      //display an array
       System.out.println("array elements ");
      for(int i=0;i<5;i++)
        {
          if(a[i]%2==0)
            sum=sum+a[i];
            
      
          //print result
          
        }
      System.out.println(sum);
      
    }
  }