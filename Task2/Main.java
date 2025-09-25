import java.util.Scanner;
class Main{
	


	public static void main(String [] args){

		String input;
		int age;
		int deathTimer;

	

		Scanner scanner = new Scanner(System.in);

			System.out.println("Please type your name: ");

			 input = scanner.nextLine();

		System.out.println("Hello " + input + ", please type your age");
			

			 age = scanner.nextInt();
			 System.out.println("Congratiolations, you are " + age + " years old " + " How many siblings do you have?");


			  deathTimer = scanner.nextInt();
			 System.out.println("Congratiolations, you will die in " + deathTimer + " years.");


	}



}