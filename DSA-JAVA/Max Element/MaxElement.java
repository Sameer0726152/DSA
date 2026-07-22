
public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {35, 64, 91, 87};
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
