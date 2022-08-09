public class Task8 {
	public static void main(String[] args) {
		String str = "1234 5678 9012 3456";
		
		//way one
		char[] chars = str.toCharArray();
		for (int i =0; i < chars.length-4; i++) {
		if (chars[i] != ' ')
		chars[i] = '*';
		}
		for(int j=0; j < chars.length; j++)
		System.out.print(chars[j]);
	    
		
		//way two
		String strA = str.substring(0, str.length()-4).replaceAll( "[1234567890]", "*");
		String strB = str.substring(str.length()-4, str.length());
		System.out.println("\n");
		System.out.println(strA+strB);
	
	}
}