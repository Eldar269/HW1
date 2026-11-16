public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String str = args[i];

            if (str.length() > 0) {
                char c = str.charAt(0);

                if (c % 5 == 0) {
                    System.out.println(c);
                }
            }
        }
    }
}
