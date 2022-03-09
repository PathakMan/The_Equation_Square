package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) throws IOException {

        double a, b, c, Delta, X1, X2; char RootNum = 0;

        BufferedReader BuffRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates the roots of te equation ax^2+bx+c = 0.");
        System.out.println("Enter the value of a and press enter");

        a = Double.parseDouble(BuffRead.readLine());

        if (a == 0){
            System.out.println("Illegal value of the coefficient");
        }else {
            System.out.println("Enter the value of b and press enter");
            b = Double.parseDouble(BuffRead.readLine());

            System.out.println("Enter the value of c and press enter");
            c = Double.parseDouble(BuffRead.readLine());

            Delta =  pow(b,2)-4*a*c;

            if(Delta < 0) RootNum = 0;
            if(Delta == 0) RootNum = 1;
            if(Delta > 0) RootNum = 2;

            switch (RootNum){

                case 0:

                    System.out.println("There are no real Roots");break;

                case 1: {

                    X1 = -b / (2 * a);

                    System.out.printf("For a = " + "%4.2f,", a);

                    System.out.printf("    b = " + "%4.2f,", b);

                    System.out.printf("    c = " + "%4.2f,", c);

                    System.out.printf("The Trinomial has one double root = ");

                    System.out.printf("%4.2f.\n", X1);
                }break;

                case 2: {

                    X1 = (-b-sqrt(Delta))/(2*a);
                    X2 = (-b+sqrt(Delta))/(2*a);

                    System.out.printf("For a = " + "%4.2f,", a);

                    System.out.printf("    b = " + "%4.2f,", b);

                    System.out.printf("    c = " + "%4.2f. \n", c);

                    System.out.printf(" X1 = ");

                    System.out.printf("%4.2f. \n", X1);

                    System.out.printf(" X2 = ");

                    System.out.printf("%4.2f. \n", X2 );
                }break;








            }








        }









































    }
}
