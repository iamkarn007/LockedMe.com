package Phase_1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class UserOperations {
	 Options obj = new Options();
	 String path= "C:\\Users\\ayush\\OneDrive\\Desktop\\Phase1Project";
	 Scanner scanner = new Scanner (System.in);
	
	public void Operations(int choice){
		
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
		
		case 4:
			WelcomeScreen ws1= new WelcomeScreen();
			ws1.displayWelcomeScreen();
	}	
		
	}

	private void searchFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Filename: ");
	     
	     String str = scanner.nextLine();
	     if(!Test1.folder.contains(str)) {
	    	 System.out.println("File Not Found");
	     }
	     else {
	    	 System.out.println("The Folder Contains the file " + str);
	     }
	     obj.moreOptions();
	}

	private void removeFile() {
		// TODO Auto-generated method stub
		 
	        try {
	        	System.out.println("Enter the Filename: ");
	   	     	
	   	     	String str = scanner.nextLine();
	        	File file = new File(path+"\\"+str);
				if(file.delete()) {
			        System.out.println("File " + str + " Deleted from the directory");
					Test1.folder.remove(str);
					Test1.updateTreeSet();
				}
				else {
					System.out.println("File Does not Exists");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     obj.moreOptions();
		
		
	}

	private void addFile() {
		// Elements are added using add() method
        
        System.out.println("Enter the Filename: ");
        
        String str = scanner.nextLine();
        File file = new File(path+"\\"+str);
        try {
			if(file.createNewFile()) {
		        System.out.println("File " + str + " Saved in the directory");
				Test1.folder.add(str);
				Test1.updateTreeSet();
			}
			else {
				System.out.println("File Already Exists");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        obj.moreOptions();
	}

}
