import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a_age, b_age;
        String a_sex, b_sex;

        a_age = sc.nextInt();
        a_sex = sc.next();
        b_age = sc.nextInt();
        b_sex = sc.next();
        
        if((a_age>=19 || b_age>=19) && ("M".equals(a_sex) || "M".equals(b_sex))){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}