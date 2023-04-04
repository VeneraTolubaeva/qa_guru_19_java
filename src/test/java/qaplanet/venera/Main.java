package qaplanet.venera;

public class Main {
    public static void main(String[] args) {

        int a = 22;
        int b = 12;

        System.out.println("Математические операции");

        System.out.println("result a + b = " + (a + b));
        System.out.println("result a - b = " + (a - b));
        System.out.println("result a * b = " + (a * b));
        System.out.println("result a / b = " + (a / b));
        System.out.println("result a % b = " + (a % b));

        System.out.println("**********************************");

        System.out.println("Логические операции");

        System.out.println(a > (b +5));
        System.out.println(a > (b * 2));
        System.out.println(a >= (b +10));
        System.out.println(a >= (b + 15));
        System.out.println(a < (b + 5));
        System.out.println(a < (b + 15));
        System.out.println(a <= (b + 2));
        System.out.println(a <= (b + 15));

        System.out.println("**********************************");

        System.out.println("Переполнение");

        System.out.println("2147483647 + 1 = " + (2147483647 + 1));
        System.out.println("2147483647 + 2 = " + (2147483647 + 2));
        System.out.println("-2147483648 + (-1) = " + (-2147483648 + (-1)));
        System.out.println("-2147483648 + (-2) = " + (-2147483648 + (-2)));

        System.out.println("**********************************");

        System.out.println("Комбинирование типов данных");

        int c = 15;
        double d = 2.5;
        System.out.println(c + d);

    }
}
