import java.util.Scanner;

public class EvenOddChecker
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter an integer: ");
	    int num = scanner.nextInt();
	    
	    if (num % 2 == 0){
	        System.out.print(num + "is an Even number");
	    }
	    else if (num % 2 != 0){
	        System.out.print(num + "is an Odd number");
	    }
	}
}	