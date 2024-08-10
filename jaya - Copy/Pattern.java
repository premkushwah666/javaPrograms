import java.util.Scanner;

class Alphha{
	public static void main(String[] args) {
        System.out.print("ENTER A NUMBER : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PatternW(n);
        //Pyramid(n);
        //Matrix(n);
    }


    public static void Matrix(int n) {
    for(int i=0;i<n;i++)
      {
           for(int j=0;j<n;j++)
            System.out.print(i+""+j+" ");
           System.out.println(" ");
      }
      System.out.println();
  }

    
    public static void Pyramid(int n) {
    for(int i=1;i<=n;i++)
       {
        for(int j=n;j>i;j--)
           System.out.print(" ");

          for(int j=1;j<i*2;j++)
         {
            System.out.print("*");
         }
           System.out.println( );
       }
    }


    public static void PatternA(int n)
    {
		for(int i=0;i<n*2;i++)
	    {
           for(int j=0;j<n;j++)
           {
           	//if(i==0 || j==0 || j==n-1 || i==n/2*2)
            if((i == 0 && j > 0 && j < n - 1) || j == 0 && i != 0 && i != n*2- 1 || j == n - 1 && i != 0 && i != n*2 - 1  || i==n/2*2)
           		System.out.print(" *");
           	else
           		System.out.print("  ");
           }
           System.out.println();
        }
    }   


     public static void PatternB(int n)
    {
		for(int i=0;i<n*2;i++)
	    {
           for(int j=0;j<n;j++)
           {
           	//if(i==0 || j==0 || j==n-1 && i!=j || i==n/2*2 || i==n*2-1)  
               if ((i==0 && j>0 && j<n-1) || j==0 && i!=0 && i!=n*2-1 || j==n-1 && i!=0 && i!=n*2-1 || i==n*2-1 && 
                j!=0 && j!=n-1 || i==n/2*2)         	
           		System.out.print(" *");
           	else
           		System.out.print("  ");
           }
           System.out.println();
        }
    }    


    public static void PatternC(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if ((i == 0) || j == 0 || i == n*2-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void PatternD(int n) {
        for (int i = 0; i<n*2; i++) {
            for (int j = 0; j < n; j++) {
                if ((i==0 && j<n-1) || j==0 && i!=0  || j==n-1 && i!=0 && i!=n*2-1 || i==n*2-1 && j!=n-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void PatternE(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (i == 0 || j == 0 || i == n*2-1 || i==n/2*2)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    


    public static void PatternF(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (i == 0 || j == 0 || i==n/2*2)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


     public static void PatternG(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (i == 0 || j == 0 || i == n*2-1  || j==n-1 && i>=n || i==n && j>=n-4)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


     public static void PatternH(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (j == 0 || i==n/2*2 || j==n-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


     public static void PatternI(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (i==0 ||i==n*2-1 || j==n/2)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }



     public static void PatternJ(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (i==0 || j==n/2 || i==n*2-1 && j<n-3 )
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


     public static void PatternK(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (j == 0 || i+j==n || i-j==n-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


     public static void PatternL(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (j==0 ||  i==n*2-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void PatternM(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (j==0 || i==j && i<n || i+j==n)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


     public static void PatternN(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (j==0 || i==j*2 || j==n-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void PatternO(int n) {
        int m = n * 2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) || j == 0 && i != 0 && i != m - 1 || j == n - 1 && i != 0 && i != m - 1 || i == m - 1 && j != 0 && j != n - 1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


      public static void PatternP(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (j==0 || i==0 || j==n-1 && i<n || i==n/2*2 )
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


     public static void PatternQ(int n) {
        int m = n * 2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) || j == 0 && i != 0 && i != m - 1 || j == n - 1 && i != 0 && i != m - 1 || i == m - 1 && j != 0 && j != n - 1 || i-j==n-3)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void PatternR(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (j==0 || i==0 || j==n-1 && i<n || i==n/2*2 || i-j==n)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    
     public static void PatternS(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (j==0 && i<n || i==0 || j==n-1 && i>n || i==n/2*2 || i==n*2-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }



      public static void PatternT(int n) {
        for (int i = 0; i < n*2; i++) {
            for (int j =0; j<n; j++) {
                if (i==0 || j==n/2)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


 
     public static void PatternU(int n) {
        int m = n * 2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i != 0 && i != m - 1 || j == n - 1 && i != 0 && i != m - 1 || i == m - 1 && j != 0 && j != n - 1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }



    public static void PatternW(int n) {
        for (int i = 0; i < n; i++) {
            for (int j =0; j<n; j++) {
                if ( j==0 || j==n-1 || i==j && j<n -4  )
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }




}

                     




