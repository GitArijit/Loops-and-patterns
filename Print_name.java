public class Print_name {
    public static void main(String []args)
    {
        //Print     ARIJIT

        int n=9;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==2 && j>2 && j<6)
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
                if(i==0 && j<(n-1)/2 || j==0 && i<=(n-1)/2 || i==2 && j<(n-1)/2 || i==1 && j>=(n-1)/2 && j<5 || i==3 && j>0 && j<2 || i==4 && j>2 && j<4)
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
                if(i==0 && j<=(n-1)/2 || j==2 && i<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2)
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
                if(j==(n-1)/2 && i<=3 || i==(n-1)/2 && j<4)
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
                if(i==0 && j<=(n-1)/2 || j==2 && i<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2)
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
                if(i==0 && j<=(n-1)/2 || j==2 && i<=(n-1)/2)
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
