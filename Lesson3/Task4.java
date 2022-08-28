public class Task4 {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKI";
        String result = str.toLowerCase().replaceAll("[aeio]", "");
	    System.out.println(result);
}
}