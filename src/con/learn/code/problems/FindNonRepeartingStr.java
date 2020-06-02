package con.learn.code.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeartingStr {
	
	public static void main(String args[]) {
		
		String str = "sillyspider";
		
		Map<Character,Integer> storeMap = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			
			Character currentChar = str.charAt(i);
			if(storeMap.get(currentChar) == null) {
				storeMap.put(currentChar, 1);
			}
			else {
				int characterFreq = storeMap.get(currentChar);
				characterFreq+= 1;
				storeMap.put(currentChar, characterFreq);
			}
		}
		
		for(int i=0;i<str.length();i++) {
			
			Character currentChar = str.charAt(i);
			int characterFreq = storeMap.get(currentChar);
			System.out.println(" Current Charachter "+currentChar + " >> and Freq "+characterFreq);
		}
		
		
	}

}
