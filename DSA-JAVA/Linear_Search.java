
public class Linear_Search {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8, 2, 4, 9};
        int target = 10;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (found != true) {
            System.out.println("Element not in array");
        }

    }
}
