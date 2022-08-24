import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a,b and c:");
		int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
		float determinant = (float)(b*b-4*a*c);
		if(determinant > 0) {
		    float root1= (float)(-b+Math.sqrt(b*b-4*a*c))/2*a;
		    float root2= (float)(-b-Math.sqrt(b*b-4*a*c))/2*a;
		    System.out.println("The roots of the equation are: "+root1+" and "+root2);
	    }
		sc.close();

	}
}
