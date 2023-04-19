package qaplanet.venera;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> numArrList = new ArrayList<>();
        numArrList.add(1);
        numArrList.add(2);
        numArrList.add(3);
        numArrList.add(4);
        numArrList.add(3);
        numArrList.add(5);

        System.out.println("Начальный список: " + numArrList.toString());

        //while (numArrList.remove(Integer.valueOf(3)));
        while (numArrList.contains(3)) {
            numArrList.remove(Integer.valueOf(3));
        }
        System.out.println("Итоговый результат: " + numArrList.toString());
    }
}
