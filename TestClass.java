import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Commit and push");
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		if(num == 1) {
			System.out.println("hello 1");
		}else {
			System.out.println("default");
		}

	}

}
