package qaplanet.venera;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    private static Faker faker = new Faker();

    public static void main(String[] args) {

        Map<String, String > hashMap = new HashMap();
        hashMap.put("1", "Alex");
        hashMap.put("2", "Didi");
        hashMap.put("3", "Hurry");

        System.out.println("Начальный список: " + hashMap);

        for (int i = 4; i < 10; i++) {
            if (hashMap.size() < 10) {
                hashMap.put(String.valueOf(i), faker.name().firstName());
            } else {
                break;
            }
        }
        System.out.println("Конечный список: " + hashMap);
    }
}
