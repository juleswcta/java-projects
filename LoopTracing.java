public class LoopTracing {
    public static void main(String[] args) {
        int row;
        int column = 0;
        int total = 0;
        for (row = 1; row <= 2; row++) {
            for (column = 1; column <= 3; column++) {
                total += row * column;
            }
        System.out.println("Total: " + total);
    }
}


}
