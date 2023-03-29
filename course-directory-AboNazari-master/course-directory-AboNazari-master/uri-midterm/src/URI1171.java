import java.util.Scanner;

public class URI1171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        int temporary = 0;

        // Sort the array 'arr' elements in ascending order
        // using nested for loops
        for (int i = 0; i <arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }

        int z = 0;
        for (int j = 0; j < num; j++) {
            for (int k = 0; k < num; k++) {
                if (arr[j] == arr[k]) {
                    z++;
                }
            }
            if(j == arr.length-1){
                System.out.println(arr[j] + " aparece " + z + " vez(es)");
            } else if(arr[j] != arr[j+1] && j+1 < arr.length){
                System.out.println(arr[j] + " aparece " + z + " vez(es)");
            }
            z = 0;
        }
    }
}
