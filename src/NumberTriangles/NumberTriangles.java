package NumberTriangles;

public class NumberTriangles {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        //Pascal's triangle
        int rows = 10, number = 1;

        for (int i = 0; i < rows; i++) {
            for (int space = 1; space < rows - i; ++space) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    number = 1;
                } else {
                    number = number * (i - j + 1) / j;
                }

                //prints it with 4 digits per each number
                System.out.printf("%4d", number);
            }

            System.out.println();
        }

    }

}
