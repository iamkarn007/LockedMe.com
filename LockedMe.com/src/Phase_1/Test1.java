package Phase_1;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	static Set<String> folder = new TreeSet<>();
	
	public static void updateTreeSet() {
		String path= "C:\\Users\\ayush\\OneDrive\\Desktop\\Phase1Project";
		File file1=new File(path);
		File[] listOfFiles=file1.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			  if (listOfFiles[i].isFile()) {
			    

				folder.add(listOfFiles[i].getName());
			  } else if (listOfFiles[i].isDirectory()) {
			    
			  }
			}
	}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			updateTreeSet();
			WelcomeScreen obj = new WelcomeScreen();
			obj.displayWelcomeScreen();
		}

	}
