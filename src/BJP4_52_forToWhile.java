public class BJP4_52_forToWhile {

    public static void main(String[] args) {

        forLoopA();
        System.out.println();
        whileLoopA();
        System.out.println();
        forLoopB();
        System.out.println();
        whileLoopB();
        System.out.println();
        forLoopC();
        System.out.println();
        whileLoopC();
        System.out.println();
        forLoopD();
        System.out.println();
        whileLoopD();
    }

    public static void forLoopA() {

        System.out.println("A. in the for loop");

        int max = 5;
        for (int n = 1; n <= max; n++) {
            System.out.println(n);
        }

    }

    public static void whileLoopA() {

        System.out.println("A. in the while loop");

        int max = 1;
        while (max <= 5) {
            System.out.println(max);
            max++;
        }
    }

    public static void forLoopB() {

        System.out.println("B. in the for loop");

        int total = 25;
        for (int number = 1; number <= (total / 2); number++) {
            total = total - number;
            System.out.println(total + " " + number);
        }

    }

    public static void whileLoopB() {

        System.out.println("B. in the while loop");

        int number = 1;
        int total = 25;
        while (number <= (total / 2)) {
            total = total - number;
            System.out.println(total + " " + number);
            number++;
        }
    }

    public static void forLoopC() {

        System.out.println("In the for loop");

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("*");
                }
                System.out.print("!");
            }
            System.out.println();
        }

    }

    public static void whileLoopC() {

        System.out.println("In the while loop");

        int i = 1;
        while (i <= 2) {
            int j = 1;
            while (j <= 3) {
                int k = 1;
                while (k <= 4) {
                    System.out.print("*");
                    k++;
                }
                System.out.print("!");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void forLoopD() {

        System.out.println("D. in the for loop");

        int number = 4;
        for (int count = 1; count <= number; count++) {
            System.out.println(number);
            number = number / 2;
        }

    }

    public static void whileLoopD() {

        System.out.println("D. in the while loop");

        int number = 4;
        int count = 1;
        while (count <= number) {
            System.out.println(number);
            number = number / 2;
            count++;
        }

    }
}