import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int amath, aeng, bmath, beng;

        amath = sc.nextInt();
        aeng = sc.nextInt();
        bmath = sc.nextInt();
        beng = sc.nextInt();
        
        if(amath == bmath){
            if(aeng > beng){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }else if(amath > bmath){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}