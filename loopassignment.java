Q1. Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
    
package loops;
import java.util.*;
public class sumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n=");
        int n= sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum= sum+i;
        }
        System.out.println("sum is:" +sum);
    }
}

Q2. Write a Java program to print a multiplication table for a given number 'n'.
    
package loops;

import java.sql.SQLOutput;
import java.util.*;
public class MultiplecationOfn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n=");
        int n= sc.nextInt();
        for(int i=0; i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
Q3. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
    
package loops;

import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a=");
        int a= sc.nextInt();
        System.out.print("Enter b=");
        int b= sc.nextInt();
        int g=0;
        for( int i=1; i<=a;i++){
            if(a%i==0&&b%i==0){
                g=i;
            }
        }
        System.out.println("gcd="+g);


    }
}
Q4. Write a Java program to check if a given string is a palindrome or not using a loop.

    
package loops;

public class panindrom {
    public static void main(String[] args) {
        String string = "Avinash";
        boolean flag = true;
        string = string.toLowerCase();
        for(int i = 0; i < string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                flag = false;
                break;
               }
            }
        if(flag) System.out.println("String is palindrome");
        else System.out.println(" string is not a palindrome");
    }

}




Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.


package loops;

import java.sql.SQLOutput;
import java.util.Scanner;
public class febonacchiseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.print(n1+ " "+n2);
        int n3;
        for(int i =2;i<n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
