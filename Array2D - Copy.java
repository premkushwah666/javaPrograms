import java.util.Scanner;


class Array2D
{
    public static void printArray2D(int[][] arr)
    {
        for (int i=0; i<arr.length; i++) {
        	for (int j=0; j<arr[i].length; j++) {
        		System.out.printf("%d\t",arr[i][j]);
        	}
        	System.out.println();
        	System.out.println();
        }
    }

    public static int[][] intputArray2D(int r,int c)
    { 
    	int[][] arr = new int[r][c];
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter "+r*c+" elements");

        for(int i=0; i<r; i++)
        {
        	for (int j=0; j<c; j++) {
        		arr[i][j] = sc.nextInt();        		
        	}
        }
        return arr;
    }

    public static int[][] printspiralPattern(int n)
    {
    	int[][] matrix = new int[n][n];
    	int topRow = 0,bottomRow = n-1,leftCol = 0, rightCol = n-1;
    	
        int totalElements=1; 
    	while(totalElements <= n*n)
    	{
    		//topRow -> leftCol to rightCol
    		for (int j=leftCol; j<=rightCol; j++) {
    			matrix[topRow][j]=totalElements++;
    		}

    		topRow++;

    		//rightCol -> topRow to BottomRow
    		for (int i=topRow; i<=bottomRow; i++) {
    			matrix[i][rightCol]=totalElements++;
    		}
    		rightCol--;

    		//bottomRow -> rigthCol to leftCol
    		for (int j=rightCol; j>=leftCol; j--) {
    			matrix[bottomRow][j]=totalElements++;
    		}
    		bottomRow--;

    		//leftCol -> bottomRow to topRow
    		for (int i=bottomRow; i>=topRow; i--) {
    	    matrix[i][leftCol]=totalElements++;
    		}
    		leftCol++;

      }

    return matrix;
    }



   /* public static void printspiralArray(int[][] matrix,int r,int c)
    {
    	int topRow = 0,bottomRow = r-1,leftCol = 0, rightCol = c-1;
    	
        int totalElements=0; 
    	while(totalElements < r*c)
    	{
    		//topRow -> leftCol to rightCol
    		for (int j=leftCol; j<=rightCol; j++) {
    			System.out.println(matrix[topRow][j]+" ");
    			totalElements++;
    		}

    		topRow++;

    		//rightCol -> topRow to BottomRow
    		for (int i=topRow; i<=bottomRow; i++) {
    			System.out.println(matrix[i][rightCol]+" ");
    			totalElements++;
    		}
    		rightCol--;

    		//bottomRow -> rigthCol to leftCol
    		for (int j=rightCol; j>=leftCol; j--) {
    			System.out.println(matrix[bottomRow][j]+" ");
    			totalElements++;
    		}
    		bottomRow--;

    		//leftCol -> bottomRow to topRow
    		for (int i=bottomRow; i>=topRow; i--) {
    			System.out.println(matrix[i][leftCol]);
    			totalElements++;
    		}
    		leftCol++;

    	}
    }*/


	public static void main(String[] args) {
		/*int[][] arr = {
		                 {1,2,3},
		                 {4,5,6}, 
                         {7,8,9}
                        }; */
        Scanner sc = new Scanner(System.in);
      /*  System.out.println("enter no of rows");
        int r1 = sc.nextInt();
        System.out.println("enter no of columns");
        int c1 = sc.nextInt();

        int[][] arr1 = intputArray2D(r1,c1);
        printspiralArray(arr1,r1,c1);*/
        //printArray2D(arr1);


        //spiral array
        System.out.println("enter no of rows");
        int n = sc.nextInt();
        printArray2D(printspiralPattern(n));
        
        
	}
}