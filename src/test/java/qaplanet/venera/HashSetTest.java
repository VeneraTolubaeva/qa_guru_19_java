package qaplanet.venera;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        System.out.println("Начальный список: " + hashSet);

        for (int i = 4; i < 10; i++) {
            do {
                hashSet.add(i++);
            } while (i - 4 < 10);
            System.out.println("Итоговый результат: " + hashSet);
        }
    }

}
