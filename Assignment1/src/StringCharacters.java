
public class StringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        String text = "To be or not to be, that is the question;" +
	                      " Whether `tis nobler in the mind to suffer" +
	                      " the slings and arrows of outrageous fortune," +
	                      " or to take arms against a sea of troubles," +
	                      " and by opposing end them?";

	        int spaces = 0, vowels = 0, letters = 0;

	        for (char c : text.toCharArray()) {
	            if (Character.isLetter(c)) {
	                letters++;
	                if ("AEIOUaeiou".indexOf(c) != -1) {
	                    vowels++;
	                }
	            } else if (c == ' ') {
	                spaces++;
	            }
	        }

	        System.out.println("The text contained vowels: " + vowels);
	        System.out.println("Consonants: " + (letters - vowels));
	        System.out.println("Spaces: " + spaces);
	    }
	}