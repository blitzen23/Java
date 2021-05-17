import java.util.Scanner;

public class Main {

	int choice, firstNum, secondNum;
	Scanner in = new Scanner(System.in);
	public Main() {
		while (true) {
			menu();
			if (choice == 1) {
				start();
			}
			else if (choice == 2) {
				System.out.println("Thank you for using the apps!!");
				in.nextLine();
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}
	
	public void menu() {
		while (true) {
			try {
				System.out.println("1. Start The Simulation!!");
				System.out.println("2. Close App");
				System.out.print("Choice >> ");
				choice = in.nextInt();
				in.nextLine();
				if (choice >= 1 && choice <= 2) {
					break;
				}
			}
			catch (Exception e){
				System.out.println("Input must be a number");
				in.nextLine();
			}
		}
	}
	
	public void start() {
		while (true) {
			try {
				System.out.print("Input the first number [1 - 100](inclusive): ");
				firstNum = in.nextInt();
				in.nextLine();	
				if (firstNum >= 1 && firstNum <= 100) {
					break;
				}
			}
			catch (Exception e) {
				System.out.println("Input must be a number");
				in.nextLine();
			}
		}
		while (true) {
			try {
				System.out.print("Input the second number [1 - 100](inclusive): ");
				secondNum = in.nextInt();
				in.nextLine();	
				if (secondNum >= 1 && secondNum <= 100) {
					break;
				}
			}
			catch (Exception e) {
				System.out.println("Input must be a number");
				in.nextLine();
			}
		}
		System.out.println("+===============================================================================================================+");
		System.out.println("+ + (String type) | (Character Type) | * (Integer Type) | / (Floating Type) | input 1 == input 2 (Boolean Type) +");
		System.out.println("+===============================================================================================================+");
		System.out.printf("+     %-3s+ %-3s    |      %c    %c      |      %5d       |       %.3f       |               %-5b               +\n", firstNum, secondNum, (char)firstNum, (char)secondNum, firstNum * secondNum, (double)firstNum / secondNum, firstNum == secondNum);
		System.out.println("+===============================================================================================================+");
		System.out.println("Press enter to proceed..");
		in.nextLine();
		
		System.out.println("+=================================================================+");
		System.out.println("+ Data Type : Integer                                             +");
		System.out.println("+=================================================================+");
		System.out.println("+      +      |      -     |      *     |      /     |      %     +");
		System.out.println("+=================================================================+");
		System.out.printf("+    %4d     |     %-2d     |   %-5d    |     %-2d     |     %-2d     + \n", firstNum + secondNum, firstNum - secondNum, firstNum * secondNum, firstNum / secondNum, firstNum % secondNum);
		System.out.println("+=================================================================+");
		System.out.println("Press enter to proceed..");
		in.nextLine();
		
		boolean p1, p2;
		while (true) {
			try {
				System.out.print("Give me value for p1 [true | false]: ");
				p1 = in.nextBoolean();
				in.nextLine();
				if (p1 == true || p1 == false) {
					break;
				}
			}
			catch (Exception e) {
				in.nextLine()
;			}
		}
		while (true) {
			try {
				System.out.print("Give me value for p2 [true | false]: ");
				p2 = in.nextBoolean();
				in.nextLine();
				if (p2 == true || p2 == false) {
					break;
				}
			}
			catch (Exception e) {
				in.nextLine()
;			}
		}
		System.out.println("+===================================================================+");
		System.out.println("+ Logical Table                                                     +");
		System.out.println("+===================================================================+");
		char a, b;
		if (p1 == true) {
			a = 'T';
		}
		else {
			a = 'F';
		}
		if (p2 == true) {
			b = 'T';
		}
		else {
			b = 'F';
		}
		System.out.printf("P1 = %c, P2 = %c                                                         +\n", a, b);
		System.out.println("+===================================================================+");
		System.out.println("+      !P1      |       !P2       |       &&       |       ||       +");
		System.out.println("+===================================================================+");
		System.out.printf("+     %-6b    |      %-6b     |     %-6b     |      %-6b    +\n", !p1, !p2, p1 && p2, p1 || p2);
		System.out.println("+===================================================================+");
	}
}
