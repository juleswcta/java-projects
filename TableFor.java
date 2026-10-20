public class TableFor {
    public static void main(String[] args) {
        for (int row = 1; row < 11; row++) {
            for (int column = 1; column < 11; column++) {
                System.out.printf("%4d", row * column);
            }
            System.out.println();
        }
        }
    }
