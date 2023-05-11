package Javaprograms;

import java.util.Scanner;

public class Primenumber
{
        public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            int i,j,n,f;
            System.out.println("n=");
            n=obj.nextInt();
            for(i=1;i<=n;i++)
            {
                f=0;
                for(j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        f++;
                        break;
                    }
                }
                if (f==0)
                {
                    System.out.println( i);
                }
            }

        }

}
