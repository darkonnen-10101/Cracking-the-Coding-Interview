package crackingthecode.excercises.leetcode;

public class DefangingAnIPAddress {
	
	public static void main(String[] args) {
		
		DefangingAnIPAddress ex = new DefangingAnIPAddress();
		
		System.out.println(ex.defangIPaddr("1.1.1.1"));
		
	}

	
    public String defangIPaddr(String address) {
        
		String[] myString = address.split("");

		for (int i = 0; i < myString.length; i++) {
			if (myString[i].equals(".")) {
				myString[i] = "[.]";
			}
		}

//		address.replace(".", "[.]");
		return String.join("", myString);
        
    }

}
