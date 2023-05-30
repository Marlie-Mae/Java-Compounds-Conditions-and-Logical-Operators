import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if ( num % 3 == 0 && num % 4 == 0 ) {
            System.out.println("Divisible by 3 and 4");
        } else if ( num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if ( num % 4 == 0) {
            System.out.println("Divisible by 4");
        } else {
            System.out.println("It is not divisible by 3 and 4");
        }
        
    }
}