package Lesson8;

import java.io.*;

public class Task6 {
    public static void readData() throws IOException {
        String str;
        int number;
        System.out.println("Type number:");
        BufferedReader br  = new  BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("test.txt", true);
        str = br.readLine();
        number = Integer.parseInt(str);
        fw.write(str);
        fw.flush();
        fw.close();
    }
    public  static  void  main(String  args[]) {
        try {
            readData();
        }
        catch (NumberFormatException exc) {
            System.out.println("Try type number!");
            try {
                String  s;
                BufferedReader br = new BufferedReader(new FileReader("test.txt"));
                while((s = br.readLine()) != null) {
                    for(char x:s.toCharArray()) {
                    System.out.println(x);
                    }
                }
            }
            catch(IOException exc2){
                System.out.println("Exception' caught!");
            }
        }
        catch(IOException exc) {
            System.out.println("Exception' caught!");
        }
    }
}
