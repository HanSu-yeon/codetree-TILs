import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        //95이상 10만원
        //90이상 5만원
        //나머지 x
        if(a<90 ){
            System.out.println("0");
        }else if(b>=95){
            System.out.println("100000");
        }else if(b>=90){
            System.out.println("50000");
        }

    }
}