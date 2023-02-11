public class Assignment_Pattern_Alphabets {
    public static void main(String []args)
    {
        //print A
        int n = 9;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==2 && j>=3 && j<=5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                if(i==0 && j<(n-1)/2 || j==0 && i<=(n-1)/2 || i==1 && j>3 && j<5 || i==2 && j<=3 || i==3 && j>3 && j<5 || i==4 && j<=3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            for(int j=0; j<n; j++)
            {
                if(i==0 && j>2 && j<7 || i==1 && j>0 && j<2 || i==2 && j<1 || i==3 && j>0 && j<2 || i==4 && j>2 && j<7)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            for(int j=0; j<n; j++)
            {
                if(j==0 && i<=(n-1)/2 || i==0 && j<4 || i==1 && j>3 && j<5 || i==2 && j>3 && j<5 || i==3 && j>3 && j<5 || i==4 && j<4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            for(int j=0; j<n; j++)
            {
                if(j==0 && i<=(n-1)/2 ||i==0 && j<5 || i==2 && j<4 || i==4 && j<5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            for(int j=0; j<n; j++)
            {
                if(j==0 && i<=(n-1)/2 ||i==0 && j<5 || i==2 && j<4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            for(int j=0; j<n; j++)
            {
                if(i==0 && j>1 && j<8 || j==0 && i>0 && i<=3 || i==4 && j>1 && j<5 || i==3 && j>3 && j<7 || j==7 && i>=4 && i<5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            for(int j=0; j<n; j++)
            {
                if(j==0 && i<=(n-1)/2 || j==(n-1)/2 && i<=(n-1)/2 || i==2 && j<(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
