import java.util.Random;

public class ComparisonSorts {

    public static Random random = new Random();
    public static final int NUM_TESTS = 10000;
    public static final int TEST_DATA_SIZE = 10;
    public static final int RANDOM_RANGE = 100;

    public static void main(String[] args) {
        testSort("selection", NUM_TESTS);
        testSort("insertion", NUM_TESTS);
        testSort("bubble", NUM_TESTS);
    }

    public static void testSort(String method, int times) {
        for(int test = 0; test < times; test++) {
            int[] data = createTestData(TEST_DATA_SIZE);
            int[] orig = duplicate(data);

            sortUsing(data, method);

            if(!isSortAsc(data)) {
                printSortErrorMessage(method, data, orig);
                return;
            }
        }
        System.out.println("All tests sorted correctly for " + method + "\n");
    }

    public static void sortUsing(int[] data, String method) {
        // if(method.toLowerCase().equals("selection")) {
        //     selectionSort(data);
        // } else if(method.toLowerCase().equals("insertion")) {
        //     insertionSort(data);
        // } else {
            bubbleSort(data);
        // }
    }

    public static void printSortErrorMessage(String method, int[] data, int[] orig) {
        System.out.println("Error, during " + method);
        System.out.println("Original data:");
        print(orig);
        System.out.println("After sorting:");
        print(data);
        System.out.println();
    }

    public static int[] createTestData(int amount) {
        int[] data = new int[amount];
        for(int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(RANDOM_RANGE);
        }
        return data;
    }

    public static int[] duplicate(int[] data) {
        int[] dup = new int[data.length];
        for(int i = 0; i < data.length; i++) {
            dup[i] = data[i];
        }
        return dup;
    }

    public static void print(int[] data) {
        System.out.print("[");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if(i < data.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static boolean  isSortAsc(int[] data) {
        for(int i = 0; i < data.length - 1; i++) {
            if(data[i+1] < data[i]) {
                return false;
            }
        }

        return true;
    }

    public static void bubbleSort(int[] haystack) {

    int size = haystack.length;
    for(int i = 0; i < size; i++) {
        for(int j = i + 1; j < size; j++) {
            if(haystack[i] > haystack[j]) {
                int temporary = haystack[i];
                haystack[i] = haystack[j];
                haystack[j] = temporary;
            }
        }
    }

}

}
