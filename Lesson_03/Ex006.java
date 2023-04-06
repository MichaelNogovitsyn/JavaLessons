package Lesson_03;

import java.util.List;

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        //list1.add("value"); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);
        String[] str = {"asd","asdsd"};
        System.out.println(str[0]);
        List<String> list3=List.of(str);
        System.out.println(list3);
        
    }
}
