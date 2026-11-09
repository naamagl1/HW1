public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String i : args) { 
            char x = i.charAt(0);
            if (x % 5 == 0) {
                System.out.println(x);
            }

        }
    }
}
