package Week10;

public class IfElse_Compare2Num {
    public static void main(String[] arg) {
        int num1 = 10, num2 = 8;
        String result = "";

        if (num1 > num2) {
            result = num1 + " more than " + num2;
        } else if (num1 < num2) {
            result = num1 + " less than " + num2;
        } else {
            result = num1 + " equal to " + num2;
        }
        System.out.println(result);
    }
}
