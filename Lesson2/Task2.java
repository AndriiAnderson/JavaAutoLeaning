public class Task2 {
	public static void main(String[] args) {
		
		// Площа трикутника
		double base = 20.7;
		double height = 100.1;
		double squareRec = (base* height)/2;
		System.out.println("Площа трикутника: " + squareRec);
		
		
		//Площа круга
		double radius = 5.8;
		double squareCir = Math.PI * Math.pow(radius, 2);
		
		
		System.out.println("Площа круга: " + squareCir);
	}
}