package app;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        for (int i = 1; i <= 6; i++) {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
            totalSum = sum;
        }

        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + totalSum);
    }
}