package Lab9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.get(0));

    }
}
