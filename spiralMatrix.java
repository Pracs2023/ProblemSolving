import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        int i = 0 , j = 0 ;

        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n;j++)
                mat[i][j] = sc.nextInt();
        }

        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        System.out.println();

        int top = 0 , left = 0 ;
        int bottom = m-1 , right = n-1;

        while(left<=right && top<=bottom)
        {
            for( i = left ; i <= right ; i++)
                System.out.print(mat[top][i]+" ");
            top++;
            for(  i = top ; i <= bottom ; i++)
                System.out.print(mat[i][right]+" ");
            right--;
            if(top<=bottom)
            {
                for( i = right ; i >= left ; i--)
                    System.out.print(mat[bottom][i]+" ");
                bottom--;
            }
            if(left<=right)
            {
                for( i = bottom ; i >= top ; i--)
                    System.out.print(mat[i][left]+" ");
                left++;
            }
        }
    }
}
