package class13_labs;

import java.util.ArrayList;
import java.util.List;

public class Lab1 {

    public static void main(String[] args) {
        List hobbyList = new ArrayList();
        hobbyList.add("Reading");
        hobbyList.add("Crocheting");
        hobbyList.add("Gardening");

        for (int i = 0; i < hobbyList.size(); i++) {
            String s = (String) hobbyList.get(i);
            System.out.println(s);
        }
    }
}
