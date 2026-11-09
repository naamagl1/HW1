public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.valueOf(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        long a = 1, b = 1;
        int numOdd = 0;
        for (int i = 0 ; i < x; i++) {
            System.out.print(a);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            if (a % 2 != 0) {
                numOdd++;
            }
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); 
        System.out.println("The number of odd numbers is: " + numOdd);
        
    }
}
