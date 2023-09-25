import java.util.Arrays;

public class AnagramCheckerDemo {
	public static void main(String[] args) {
		String word1 = "listen4";
		String word2 = "4siLent";
		
		String result = "";
		
		if(word1.length()!=word2.length()) {
			result = "Not Anagram";
		}else {
			char[] word1CharArray = word1.toLowerCase().toCharArray();
			char[] word2CharArray = word2.toLowerCase().toCharArray();
			
			Arrays.sort(word1CharArray);
			Arrays.sort(word2CharArray);
			
			String sortword1 = new String(word1CharArray);
			String sortword2 = new String(word2CharArray);
			
			if(sortword1.equals(sortword2)) {
				result = "Anagram";
			}else {
				result = "Not Anagram";
			}
		}
		
		System.out.println("Result: " + result);
	
		
		int[] myMarks1 = new int[5];
		int[] myMarks2 = new int[5];
		System.out.println(myMarks1==myMarks2);
	}
}
