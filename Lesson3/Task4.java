public class Task4 {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKI";
		String strLow = str.toLowerCase();
        String strNew = strLow.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "");
	    System.out.println(strNew);
}
}