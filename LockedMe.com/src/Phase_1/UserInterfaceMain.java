package Phase_1;

public class UserInterfaceMain {
	
	public void showUserInterface() {
		System.out.println("----------Choose one of the following----------");
		System.out.println("1) Display Files in the Directory");
		System.out.println("2) More Opearations");
		System.out.println("3) Close the Application");
		UserInput UIn = new UserInput();
		UIn.getUserInput();
	}
	

}
