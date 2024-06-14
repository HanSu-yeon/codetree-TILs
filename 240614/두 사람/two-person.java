import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a_age, b_age;
        String a_s, b_s;
        a_age = sc.nextInt();
        a_s = sc.next();
        b_age = sc.nextInt();
        b_s = sc.next();

        if((a_age>=19 || b_age>=19 ) || ("M".equals(a_s) || "M".equals(b_s))){
            System.out.println("1");
        }else{
            System.out.println("0");

        }
    }
}