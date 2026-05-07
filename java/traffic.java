import java.util.Scanner;
class traffic{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String red = scan.nextLine();
        String yellow = scan.nextLine();
        String green = scan.nextLine();
        if(red){
            System.out.println("stop");
        }
        else if(yellow){
            System.out.println("get ready");
        }
        else if (green){
            System.out.println("go");
        }
    }
}