import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        //3~5월이 봄, 6~8월이 여름, 9~11월이 가을, 12~2월이 겨울
        if(m>=12 || m<=2){
            System.out.println("Winter");
        }else if(m<=5){
            System.out.println("Spring");
        }else if(m<=8){
            System.out.println("Summer");
        }else if(m<=11){
            System.out.println("Fall");
        }
    }
}