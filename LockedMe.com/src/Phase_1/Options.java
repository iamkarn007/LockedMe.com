package Phase_1;

import java.util.Scanner;

public class Options {
	
	
	
	void moreOptions() {
		System.out.println("----------Choose one of the following----------");
		System.out.println("1) Add a file");
		System.out.println("2) Delete a File");
		System.out.println("3) Search File");
		Scanner scanner = new Scanner (System.in);
		int choice=0;
			
			do {
				System.out.println("Enter your choise 1-3");
				
				if(scanner.hasNextInt()) {
					
					choice =scanner.nextInt();
					
					if (choice < 1 || choice > 4) {
						System.out.println("Invalid Input!!! Please Enter number between 1-3");
						scanner.nextLine();
					}
				}
				else {
					System.out.println("Invalid Input!!! Please Enter a number between 1-3");
					scanner.nextLine();
					}
			}while(choice < 1 || choice > 3);
			
			System.out.println("Enter File Name");
			switch(choice) {
			
				case 1:
					addFile();
					break;
				case 2:
					removeFile();
					break;
				
				case 3:
					searchFile();
					break;
			}
			scanner.close();
		}

	}

