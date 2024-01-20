class findElement{
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5};

        for (int x : arr){
            if(x == 4){
                System.out.print("Matched");
                break;
            }
        }

    }
}