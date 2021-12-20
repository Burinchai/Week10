package Week10;

public class IfStatement01 {
    public static void main(String[] args) {
        int time = 14;

        if(time <= 12){
            System.out.println("Good morning");
        }else if(time <= 17){
            System.out.println("Good afternoon");
        }else if(time <= 21){
            System.out.println("Good evening");
        }else{
            System.out.println("Good night");
        }
    }
}
