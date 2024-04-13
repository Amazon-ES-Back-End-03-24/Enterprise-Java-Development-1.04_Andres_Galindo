import java.util.Arrays;

public class SmalletsElements {
    public static void elempeque(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("El array debe tener al menos dos elementos");
        }

        Arrays.sort(arr);

        System.out.println("El elemento más peque es: " + arr[0]);
        System.out.println("El segundo elemento más pequeño es: " + arr[1]);
    }

    public static void main(String[] args) {
        int[] array = {4, 9, 2, 6, 5};
        elempeque(array);
    }
}

