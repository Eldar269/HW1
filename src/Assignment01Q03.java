

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);        
        System.out.println("The first " + x + " Fibonacci numbers are:");


        int a = 0;
        int b = 1;
        int numOdd = 1;
        for (int i = 1; i <= x; i++) {
            if (i == 1) {
                System.out.print(1);
                continue;
            }

            int c = a + b;
            if (c % 2 == 1) {
                numOdd = numOdd + 1;
            }
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }

}

