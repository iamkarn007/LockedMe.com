package Phase_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameValidityCheck {
	
	 private static final Pattern INVALID_CHARACTERS_PATTERN = Pattern.compile("[^a-zA-Z0-9_.]");

	    public boolean isValidFileName(String fileName) {
	        if (fileName == null || fileName.isEmpty()) {
	            return false;
	        }

	        Matcher matcher = INVALID_CHARACTERS_PATTERN.matcher(fileName);
	        return !matcher.find();
	    }

}
