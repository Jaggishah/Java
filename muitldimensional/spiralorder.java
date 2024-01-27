class diagonal{
    public static void main(String[] args){
        int matrix[][] = 
            {
            {1,2,3,4},
            {4,5,6,5},
            {7,8,9,10},
            {17,18,69,10},
            };
        int R = matrix.length ; 
        int C = matrix[0].length ; 

        System.out.print( R + " " + C);
        int top = 0 , left = 0 , bottom = R - 1 , right = C - 1;

        while( top <= bottom && left <= right){
            System.out.println("");
            for (int i = left ; i <= right ; i ++){
                System.out.print(matrix[top][i] + " ");
            }

            System.out.println("");
            for (int i = top + 1 ; i <= bottom ; i ++){
                System.out.print(matrix[i][right] + " ");
            }

            System.out.println("");
            for (int i = right  ; i >= left ; i--){
                System.out.print(matrix[bottom][i] + " ");
            }

            System.out.println("");
            for (int i = right-1 ; i >= left ; i--){
                System.out.print(matrix[bottom][i] + " ");
            }

            System.out.println("");
            for (int i = bottom - 1 ; i >= top ; i--){
                System.out.print(matrix[i][left] + " ");
            }

        top++; left++;

        bottom--; right--;
        }

    }
}