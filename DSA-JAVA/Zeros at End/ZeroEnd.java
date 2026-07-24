
public class ZeroEnd {

    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 4, 6, 0};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
