public class TableWhile {
    public static void main(String[] args) {
        int row = 1;
        while (row < 11) {
            for (int column = 1; column < 11; column++) {
                System.out.printf("%4d", row * column);
            }
            System.out.println();
        }
        }
}
