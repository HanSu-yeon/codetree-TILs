import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        //a가 b보다 같거나 큰가?
        if(a >= b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        //a가 b보다 큰가?
        if(a > b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        //b가 a보다 같거나 큰가?
        if(a <= b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        //b가 a보다 큰가?
        if(a < b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        //a와 b가 같은가?
        if(a == b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        //a와 b가 다른가?
        if(a != b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}