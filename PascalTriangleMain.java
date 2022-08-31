import java.util.list;
import java.util.Arrays;
public class PascalTriangleMain {

    public static void main (string[] args) {
        System.out.print(sumRow(2));
    }

    public static List<Integer> sumRow(int n) {

        Integer[] arr = new Integer[n + 1];

        Arrays.fill(arr, 0);
        arr[0] = 1;

        for (int row = 1; row <= 30; row++ )
            for (int j = row; j > 0; j--)
                arr[j] = arr[j] + arr[j - 1 ];
                
        return Arrays.asList(arr);

    }
}