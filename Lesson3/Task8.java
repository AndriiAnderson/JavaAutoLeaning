public class Task8 {
	public static void main(String[] args) {
		String str = "1234 5678 9012 3456";
		
		//string to char array
		char[] chars = str.toCharArray();
		for (int i =0; i < chars.length-4; i++) {
		if (chars[i] != ' ')
		chars[i] = '*';
		}
		for(int j=1; j < chars.length; j++)
		System.out.print(chars[j]);
	}
}