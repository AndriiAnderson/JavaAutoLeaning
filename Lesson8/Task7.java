package Lesson8;

import java.util.*;

public class Task7 {
    public  static  void  main(String  args[]) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.size());
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}
