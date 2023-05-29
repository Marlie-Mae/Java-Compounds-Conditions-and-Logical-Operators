import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        
        if(a > b) {
            a = a ^ b;
            b = b ^ a;
            a = a ^ b;
        }
        
        if(b > c) {
            b = b ^ c;
            c = c ^ b;
            b = b ^ c;
            
        } else if (c > b) {
            c = c ^ a;
            a = a ^ c;
            c = c ^ a;
        }
        
        if(a > b) {
            a = a ^ b;
            b = b ^ a;
            a = a ^ b;
        }
        
        System.out.println(a + " " + b + " " + c);
    }
}