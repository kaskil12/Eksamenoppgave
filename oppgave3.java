import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbersList = {1, -2, 8, -5};
        int minNumber = Arrays.stream(numbersList).min().getAsInt();
        System.out.println(minNumber);
    }
}
