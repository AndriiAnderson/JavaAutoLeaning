public class Task6 {
	public static void main(String[] args) {
		String lapki = "\"";
		String eMail = "john_smith@example.com";
		String login = eMail.substring(0, eMail.indexOf("@"));
		String domain = eMail.substring(eMail.indexOf("@"), eMail.length());
		//System.out.println(login);
		System.out.println(lapki + domain + lapki);
		String loginA = login.substring(0, login.indexOf("_")).toUpperCase();
		String loginB = login.substring(login.indexOf("_")+1, login.length()).toUpperCase();
		System.out.println( lapki+ loginA + " " + loginB + lapki);
	}
}