package ifStatement;
//que no 65.odd or even
import java.util.Scanner;

public class oddEven {
	public static void odd(int num) {
		/*if (num==0)
			System.out.println("no is neither even nor odd");
		else if(num%2==0)
			System.out.println("no is even ");
		else 
			System.out.println("no is odd ");
			*/
		System.out.println((num==0)?"no is neither even nor odd":(num%2==0)?"no is even":"no is odd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
int n=sc.nextInt();
odd(n);
	}

}
