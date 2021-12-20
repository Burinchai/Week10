package Week10;

import java.util.Scanner;

public class IfElse_Grade {
    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int score = kb.nextInt();
        String result = "";
        if ((score < 0) || (score > 100)) {
            result = "Error!!";
        } else if (score >= 80) {
            result = "A";
        } else if (score >= 70) {
            result = "B";
        } else if (score >= 60) {
            result = "C";
        } else if (score >= 50) {
            result = "D";
        } else {
            result = "E";
        }
        if (result == "Error!!") {
            System.out.println(result + " please enter new score");
        } else {
            System.out.println("You got : " + result);
            kb.close();
        }
    }
}
