package List;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,4);
        arrayList.add(4,5);
        int sum=0;
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum+=arrayList.get(i);
            counter++;
            System.out.println(arrayList.get(i));
        }
        }
    }

