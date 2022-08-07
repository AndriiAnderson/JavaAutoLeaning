public class Task2 {
	public static void main(String[] args) {
		String openingTag = "<p>";
		String closingTag = "</p>";
		String str = "Welcome to Java World!";
		String html = String.join("", openingTag, str, closingTag);
		//String html = openingTag.concat(str.concat(closingTag));
		System.out.println(html);
	}
}