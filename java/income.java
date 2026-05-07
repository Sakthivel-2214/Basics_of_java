import java.util.Scanner;
class income{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        if(income>7000)
        {
            System.out.println("scholorship is available");
        }
        else{
            System.out.println("not eligible for scholorship");
        }
    }
}