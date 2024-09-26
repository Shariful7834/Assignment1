import java.util.ArrayList;
import java.util.Collections;

public class SortWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "To be or not to be, that is the question;" +
                " Whether `tis nobler in the mind to suffer" +
                " the slings and arrows of outrageous fortune," +
                " or to take arms against a sea of troubles," +
                " and by opposing end them?";

  // Extract words
  String[] words = text.split("\\W+"); // Splits by non-word characters
  ArrayList<String> wordList = new ArrayList<>();
  Collections.addAll(wordList, words);

  // Bubble sort
  
  for (int i = 0; i < wordList.size() - 1; i++) {
      for (int j = 0; j < wordList.size() - 1 - i; j++) {
          if (wordList.get(j).compareToIgnoreCase(wordList.get(j + 1)) > 0) {
        	  
              // Swap
              String temp = wordList.get(j);
              wordList.set(j, wordList.get(j + 1));
              wordList.set(j + 1, temp);
          }
      }
  }

  // Output sorted words
  System.out.println("Sorted words:");
  for (String word : wordList) {
      System.out.println(word);
  }
}
}