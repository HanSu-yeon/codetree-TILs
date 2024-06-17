import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //2월은 예외로 28일까지 존재
        if(n==2){
            System.out.println("28");
        }else if(n >7){
            //7월 기점으로 홀수달과 짝수달에 해당하는 일 수 달라짐
            if(n%2==0){
                System.out.println("31");
            }else{
                System.out.println("30");
            }
        }else{
            if(n%2==0){
                System.out.println("30");
            }else{
                System.out.println("31");
            }

        }
                    
    }
}