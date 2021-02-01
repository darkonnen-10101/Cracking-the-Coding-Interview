package crackingthecode.excercises.arrays;

public class Ex1 {

//		Is Unique: Implement an algorithm to determine if a string has all unique characters. 
//		What if you cannot use additional data structures? 

	// THE UGLY AND "QUICK" SOLUTION
	public boolean evalString(String myString) {

		for (int i = 0; i < myString.length(); i++) {
			for (int j = i + 1; j < myString.length(); j++) {

				if (Character.toString(myString.charAt(i)) == Character.toString(myString.charAt(j))) {
					return false;
				}

				System.out.println(String.format("Comparando %s con %s", Character.toString(myString.charAt(i)),
						Character.toString(myString.charAt(j))));

			}

		}

		return true;

	}
	
	// QUIERO MORIRME, un bonito O(n^2)

}
