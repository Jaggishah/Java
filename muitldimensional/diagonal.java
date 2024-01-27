class diagonal{
    public static void main(String[] args){
        int matrix[][] = 
            {
            {1,2,3},
            {4,5,6},
            {7,8,9}
            };
        int N = matrix.length ; 

        // print whole matix
        for (int i = 0 ; i <= matrix.length - 1 ; i++){
            for (int j = 0 ; j <= matrix.length - 1 ; j++){
                System.out.print(matrix[i][j] + " ");
            }   
            System.out.println();
        }
        System.out.println();

        // diagonal print
        for (int i = 0 , j = N-1 ; i < N ; i++,j--){
            System.out.println(matrix[i][i] + " " + matrix[i][j]);
        }
        System.out.println();

        // diagonal swap
         for (int i = 0 , j = N-1 ; i < N ; i++,j--){
            int temp = matrix[i][i] ;
            matrix[i][i] = matrix[i][j] ;
            matrix[i][j] = temp ; 
            System.out.println(matrix[i][i] + " " + matrix[i][j]);
        }

}
}