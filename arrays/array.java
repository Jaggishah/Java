import java.util.Arrays;
class array{
    public static void main(String[] args){
        int arr[];
        arr = new int[10];
        System.out.println(arr);

        int arr2[] = {1,2,5};

        Arrays.fill(arr2,1);

        System.out.println(arr2);
        for (int x : arr2){
            System.out.println(x);
        }

        int first_array[] = { 1,2,3 };
        int second_array[] = { 1,2,3 };
        System.out.println(first_array == second_array);
        System.out.println(Arrays.equals(first_array,second_array));
        // int copy_array = Arrays.Copy(first_array,first_array.length);
        // System.out.println(copy_array);

    }
}