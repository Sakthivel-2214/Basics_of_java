import java.util.Scanner;
class and{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%3 == 0 && num%5 == 0)
        {
            System.out.println("the number is divisible");
        }
        else{
            System.out.println("the number is not divisible");
        }
    }
}