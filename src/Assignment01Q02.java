public class Assignment01Q02 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        double actualPi = Math.PI;
        double approxPi = 0;

        double sum = 0;
        int d = 1;
        for (int i = 0; i < number; i++) {
            boolean minus = (i % 2 == 1);
            if (minus) {
                sum = sum + 4.0 /d * (-1);
            }
            else {sum = sum + (4.0/d);}

            d = d + 2;
        }
        
        approxPi = sum;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
