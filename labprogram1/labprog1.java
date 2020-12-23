import java.util.Scanner;
 public class Quadratic 
{

    public static void main(String[] args) 
	{
        float r1,r2,a,b,c;
        System.out.println("Enter the numbers A,B and C:");
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        float d = (b*b)-(4*a*c);
		  if(d > 0) 
		  {
            r1 = (-b+Math.sqrt((d/(2*a)));
            r2 = (-b-Math.sqrt((d/(2*a)));
            System.out.println("The roots are:",r1,r2);
        }
      
        else if(d==0)
		{
		    r1 = (-b /(2*a));
            r2 = (-b /(2*a));
			System.out.println("The roots are Equal=;",r1);
        }
        else 
		{
            double realpart = (-b/(2*a));
            double imgpart = (Math.sqrt(-d)/(2*a));
            System.out.println("Real and imaginary pat of roots are:",realpart,imgpart,realpart,imgpart);
        }
    }
}
