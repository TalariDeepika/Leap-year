import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String result = (year%400==0)?"Yes":
                        (year%100==0)?"No":
                        (year%4==0)?"Yes":"No";
        System.out.println(result);
        scanner.close();
    }
}