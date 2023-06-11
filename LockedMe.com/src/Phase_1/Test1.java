package Phase_1;

import java.util.Scanner;

public class Test1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			displayWelcomeScreen();
			showUserInterface();
			getUserInput();

		}
		
		public static void displayWelcomeScreen() {
			System.out.println("Welcome to LockedMeIn.Com");
			System.out.println("Developed By Ayush Karn");
			System.out.println();
		}
		
		public static void showUserInterface() {
			System.out.println("----------Choose one of the following----------");
			System.out.println("Display Files in the Directory");
			System.out.println("More Opearations");
			System.out.println("Close the Application");
		}
		
		public static void getUserInput() {
			Scanner scanner = new Scanner (System.in);
			int choice=0;
			
			do {
				System.out.println("Enter your choise 1-4");
				
				if(scanner.hasNextInt()) {
					
					choice =scanner.nextInt();
					
					if (choice < 1 || choice > 4) {
						System.out.println("Invalid Input!!! Please Enter number between 1-4");
						scanner.nextLine();
					}
				}
				else {
					System.out.println("Invalid Input!!! Please Enter a number between 1-4");
					scanner.nextLine();
					}
			}while(choice < 1 || choice > 4);
			
			
			switch(choice) {
				case 1:
					System.out.println("Files in this Directory: ");
					addFiles();
					break;
				case 2:
					System.out.println("More options are: ");
					moreOptions();
					break;
				
				case 3:
					System.out.println("Thank You for Using the Application");
					closeApplication();
					break;
			}
			scanner.close();
		}

		private static void closeApplication() {
			// TODO Auto-generated method stub
			
			
		}

		private static void moreOptions() {
			// TODO Auto-generated method stub
			
		}

		private static void addFiles() {
			// TODO Auto-generated method stub
			
			
		}

	}
