
public class StringReverseDemo {

	public static void main(String[] args) {
		String word = "test";
		
		StringBuffer sbWord = new StringBuffer(word);
		StringBuffer reverseSbWord = sbWord.reverse();
		String reverseWord = reverseSbWord.toString();
		
		String result = "";
		if(word.equals(reverseWord)) {
			result = "Palindrome";
		}else {
			result = "Not a Palindrome";
		}

		System.out.println("Result: " + result);
		
		String result1 = "Palindrome";
		char[] wordCharArray = word.toCharArray();
		
		for(int i=0, j=wordCharArray.length-1; i<wordCharArray.length && j>-1; i++,j-- ) {
			if(wordCharArray[i]!=wordCharArray[j]) {
				result1 = "Not a Palindrome";
				break;
			}
		}
		
		System.out.println("Result1: " + result1);
	}

}
