package crackingthecode.excercises.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Ex2 {
	
	public boolean evalStrings(String s1, String s2) {
		
        ArrayList<Character> characterList1 
        = (ArrayList<Character>) s1.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		
        ArrayList<Character> characterList2 
        = (ArrayList<Character>) s2.chars().mapToObj(c -> (char)c).collect(Collectors.toList());

		Collections.sort(characterList1);
		Collections.sort(characterList2);
        
		System.out.println(characterList1);
		System.out.println(characterList2);
		
		return  Arrays.equals(characterList1.toArray(), characterList2.toArray());	
	}

}
