import java.util.Scanner;
class sub{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  a = scan.nextInt();
        int  b = scan.nextInt();
        int  c = scan.nextInt();
        int  d = scan.nextInt();
        int  e = scan.nextInt();
        
        int totalmark = a+b+c+d+e;
        int average = totalmark/5;
        if(average<35){
            System.out.println("Additional class is required");
        }
        else{
            System.out.println("You are good to go");
        }
    }
}