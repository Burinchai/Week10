package Week10;

public class PositiveNumber {
    public static void main(String[] args) {
        int number = 0;
        String result = "";

        if (number > 0) { // จำนวนเต็มบวก
            result = "เป็นจำนวนเต็มบวก";
        } else if (number < 0) { // จำนวนเต็มลบ
            result = "เป็นจำนวนเต็มลบ";
        } else {// จำนวนเต็มศูนย์
            result = "เป็นจำนวนเต็มศูนย์";
        }
        System.out.println(number+" "+result);
    }
}
