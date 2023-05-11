package Javaprograms;

import java.util.Scanner;

public class Revers
{
        public static void main(String[] args)
        {
                int n,r,rev=0;
                Scanner obj = new Scanner(System.in);
                System.out.println("n=");
                n = obj.nextInt();
                while(n>0)
                {
                        r=n%10;
                        n=n/10;
                        rev=(rev*10)+r;

                }
                System.out.println("rev="+rev);
        }
}
