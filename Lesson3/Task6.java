public class Task6 {
	public static void main(String[] args) {
		String lapki = "\"";
		String eMail = "john_smith@example.com";
		
		String login = eMail.substring(0, eMail.indexOf("@"));
		String domain = eMail.substring(eMail.indexOf("@")+1, eMail.length());
		System.out.println(lapki + domain + lapki);
		
		String loginA = login.substring(0, login.indexOf("_"));
		String loginAresult = loginA.substring(0,1).toUpperCase() + loginA.substring(1);
		
		String loginB = login.substring(login.indexOf("_")+1, login.length());
		String loginBresult = loginB.substring(0,1).toUpperCase() + loginB.substring(1);
		System.out.println( lapki+ loginAresult + " " + loginBresult + lapki);
	}
}