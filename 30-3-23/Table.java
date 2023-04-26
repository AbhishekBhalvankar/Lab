package Basic;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a number to print its table: ");
		 int num = input.nextInt();
		 int i;
		 
		 for( i = 1; i <= 12; i++) 
		 {
			 System.out.println(num + " x " + i + " = " + (num*i));
		 }
			 
			 
	}

}
