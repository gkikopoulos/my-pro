package gr.aueb.cf;

public class AddApp {

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.printf("%4d", add(7, 2));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
