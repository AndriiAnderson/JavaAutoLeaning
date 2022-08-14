public class Task7 {
	public static void main(String[] args) {
		String a = "Den, John, Will, Kate, Adam, Robin";
		//String b = String.join( "\n",  "Den", "John", "Will", "Kate", "Adam", "Robin");
		String[] result = a.split(", ");
		for(String i: result){
			System.out.println(i);
		}
	}
}