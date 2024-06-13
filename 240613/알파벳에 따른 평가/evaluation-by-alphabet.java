import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        
        if("S".equals(c)){
            System.out.println("Superior");
        }else if("A".equals(c)){
            System.out.println("Excellent");
        }else if("B".equals(c)){
            System.out.println("Good");
        }else if("C".equals(c)){
            System.out.println("Usually");
        }else if("D".equals(c)){
            System.out.println("Effort");
        }else{
            System.out.println("Failure");
        }
    }
}