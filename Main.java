public class Main {
    public static void main(String[] args) {
        System.out.println("First level:");

        char num1 = 'G';
        int num2 = 89;
        byte num3 = 4;
        short num4 = 56;
        float num5 = 4.355453532f;
        long num6 = 12121;



        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

        System.out.println("Second level:");

        int num = 220;
        int e = num % 10;
        int d = num / 10 % 10;
        int s = num / 100;
        System.out.println(e);
        System.out.println(d);
        System.out.println(s);




    }
}