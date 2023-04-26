import java.util.Scanner;
public class HalfPyramid {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the number of rows :");
		int rows = Sc.nextInt();
		
		int i,j;
		
		for (i=1; i<=rows; i++)
		{
			for(j=1; j<=i; j++){
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
