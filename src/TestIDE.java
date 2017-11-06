import java.util.Scanner;

public class TestIDE {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double rand = Math.random();
        int random = (int) (rand * 100) + 1;
        int svar = 0;
        while(true) {
            System.out.println("Gissa ett nummer mellan 1 och 100");
            svar = scan.nextInt();
            if(svar>random){
                System.out.println("Talet är mindre.");
            }else if(svar == random){
                System.out.println("Du gissade rätt!");
                System.exit(0);
            }else if(svar<random){
                System.out.println("Talet är större.");
            }
        }


    }
}
