import java.util.Scanner;


public class menor
{
	  static int numeroMenor (int a,int b)
	  { 
		  if(a<b)
		  {
			  return a;
		  }else if(b<a)
		  {
			  return b;
		  }else 
		  {
			  return a;
		  }	  
  }
	public static void main(String[] args) 
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Ingrese a: ");
	int a= s.nextInt();
	System.out.println("Ingrese b: ");
	int b= s.nextInt();
	System.out.println("El numero menor es: " +numeroMenor(a,b));
		}

  	}
