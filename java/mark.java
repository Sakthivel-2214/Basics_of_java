import java.util.Scanner;
class mark{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>35)
        {
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}