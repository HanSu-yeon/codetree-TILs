import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        //a가 b보다 같거나 큰지
        if(a >= b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        //a가 b보다 큰지
        if(a > b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        //b가 a보다 같거나 큰지
        if(a <= b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        //b가 a보다 큰지
        if(a < b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}