public class Task4 {
	public static void main(String[] args) {
		
		
		int arr[];
		arr = new int[10];
		for (int i=0; i < arr.length; i++) {
			arr[i] =(int) (Math.random()*1000);
			}
		int arrCopy[];
		arrCopy = new int[10];
		for (int j=0; j < arr.length; j++){
			arrCopy[j] =(int)Math.sqrt(arr[j]);
		
		System.out.println(arrCopy[j]);
	    }
	}
}