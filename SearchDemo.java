public class SearchDemo {
    public static void main(String[] args) {
        int result = linearSearch(new int[]{8,2,5}, 2);
        System.out.println(result);
        int result2 = linearSearch(new int[]{4,9}, 7);
        System.out.println(result2);
        int result3 = linearSearch(new int[]{3,3,7}, 3);
        System.out.println(result3);
    }

    static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}