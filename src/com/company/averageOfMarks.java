package com.company;
import java.util.Scanner;
public class averageOfMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, markAverage;
        int sumOfMarks = 0;
        System.out.println("Enter the number of size of marks");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the individual marks");

        //For reading the element
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        //For print the array element
        for (int i : a) {
            System.out.print(i + " ,");

        }

        //Get sum of marks
        for (int num : a){
            sumOfMarks = sumOfMarks+num;

        }

        System.out.println("Sum of marks is: "+sumOfMarks);

        //Give out the average of the marks
        markAverage = sumOfMarks/size;
        System.out.println(markAverage);
    }
}
