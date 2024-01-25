public class HelloWorld{

     public static void main(String []args){
        int arr[] = { 1, 2, 3, 4, 5};
        
        // start of index
        for(int loop = 0 ; loop < arr.length ; loop++){
            // end of index
            for (int en = loop ; en < arr.length ; en++){
                for (int k = loop ; k <= en ; k++){
                    System.out.print(arr[k] + " ");
                    System.out.println("");
                }
            }
        }
     }
}
