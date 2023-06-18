package Phase_1;

import java.util.Scanner;

public class UserInput {
	public void getUserInput() {
		Scanner scanner = new Scanner (System.in);
		int choice=0;
		do {
			System.out.println("Enter your choice 1-3");
			
			if(scanner.hasNextInt()) {
				
				choice =scanner.nextInt();
				
				if (choice < 1 || choice > 3) {
					System.out.println("Invalid Input!!! Please Enter number between 1-3");
					scanner.nextLine();
				}
			}
			else {
				System.out.println("Invalid Input!!! Please Enter a number between 1-3");
				scanner.nextLine();
				}
		}while(choice < 1 || choice > 3);
		
		
			switch(choice) {
			case 1:
				System.out.println("Files in this Directory: ");
				System.out.println(Test1.folder);
				WelcomeScreen ws = new WelcomeScreen();
				ws.displayWelcomeScreen();
				break;
			case 2:
				System.out.println("More options are: ");
				Options obj= new Options();
				obj.moreOptions();
				break;
			
			case 3:
				System.out.println("Thank You for Using the Application");
				break;
		}
		
		scanner.close();
		
	}

}
