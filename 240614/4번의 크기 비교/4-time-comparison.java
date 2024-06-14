import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        //a가 b보다 큰지
        if(a>b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        //a가 c보다 큰지
        if(a>c){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        //a가 d보다 큰지
        if(a>d){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        //a가 e보다 큰지
        if(a>e){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}