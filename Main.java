import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        doSomething(array);
    }

    public static void doSomething(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
    }
}
