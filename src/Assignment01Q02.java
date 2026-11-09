public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int counter = 1;
        int num = Integer.valueOf(args[0]);
        double sum = 0;
        for (int i = 0 ; i < num; i++) {
            if (i % 2 == 0) {
                sum += 1 / (double) counter;
            } else {
                sum -= 1 / (double) counter;
            }
            counter += 2;
        approxPi = 4 * sum;
        }


        System.out.println(approxPi + " " + actualPi);
    }
}
