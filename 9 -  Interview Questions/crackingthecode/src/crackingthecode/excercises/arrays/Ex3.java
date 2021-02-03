package crackingthecode.excercises.arrays;

public class Ex3 {
	
	public String[] urlify(String string, int len) {
		
		String[] sArray = string.split("");
		
		for(int i = 0; i < len; i++) {
			if(sArray[i].equals(" ")) {
				sArray[i] = "%20";
			}
		}
//        
//		for(int i = 0; i < len; i++) {
//			System.out.println(sArray[i]);
//		}

		return sArray;
	}
	
//	Un bonito O(n)

}
