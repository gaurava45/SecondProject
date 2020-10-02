import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Commit and push");
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		if(num == 1) {
			System.out.println("hello 1");
		}else if(num == 3) {
		    System.out.println("hello 3");	
		}else if(num == 2){
			System.out.println("hello 2");
		}else if(num == 5){
			System.out.println("hello 5");
        }else if(num == 4){
			System.out.println("hello 4");
		}else {
			System.out.println("default");
		}

	}

}
