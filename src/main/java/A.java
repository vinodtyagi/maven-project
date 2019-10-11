import java.util.Scanner;

 class A {
	 public static void main(String args[])
	    {
	      try
	      {
	       int a,b,c;
	       Scanner sc = new Scanner(System.in);
	       System.out.println("enter first number");
	       a=sc.nextInt();
	       System.out.println("enter second number");
	       b=sc.nextInt();
	       c=a+b;
	       System.out.println(c);  
	       }
	       catch(Exception ex)
	       {
	          System.out.println("enter number only");
	       }
	      
	        

	   }

}
