import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt();
        //200 -> false

        if(y%4==0 ){
            //윤년
            if(y%100==0 && y%400!=0){
                System.out.println("false");
                
            }else{
                System.out.println("true");
            }
        }else{
            //평년
            System.out.println("false");
        }
    }
}