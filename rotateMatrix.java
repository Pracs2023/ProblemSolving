import java.util.Scanner;

public class rotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        int i = 0 , j = 0 ;

        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m;j++)
                mat[i][j] = sc.nextInt();
        }

        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        System.out.println();
         j = 0;
        for(int  k = 0 ; k < m ; k++)
        {
            i = m-1;
            while(i>=0)
            {
                System.out.print(mat[i][j]+" ");
                i--;
            }
            System.out.println();
            j++;
        }
    }
}
