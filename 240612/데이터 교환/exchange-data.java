public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b= 6;
        int c = 7;

        //데이터 교환
        int tmp = a;
        a = c;
        c = b;
        b = tmp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}