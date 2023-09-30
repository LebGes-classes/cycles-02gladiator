import java.lang.Math;

public class cycle1 {
    public static void main(String[] args) {
        int x = -9;
        double y;
        while (x >= -9 && x <= 9) {
            if (x >= -9 && x <= -6) {
                y = Math.sqrt(9 - Math.pow((x + 6), 2));
                System.out.println(y);
            }
            if (x > -6 && x <= -3) {
                y = x + 3;
                System.out.println(y);
            }
            if (x > -3 && x <= 0) {
                y = Math.sqrt(9 - Math.pow((x), 2));
                System.out.println(y);
            }
            if (x > 0 && x <= 3) {
                y = -x + 3;
                System.out.println(y);
            } else {
                y = x * 0.5 - 3 * 0.5;
                System.out.println(y);
            }
            x++;
        }
    }

}
