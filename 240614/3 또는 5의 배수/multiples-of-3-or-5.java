import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        //3의 배수 검사
        if(a%3 == 0 ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        //5의 배수 검사
        if(a%5 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}