package Java;

public class ex_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
