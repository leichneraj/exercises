import java.util.Random;

public class Haystack {
    
    public static void main(String[] args) {
        Random random = new Random();

        int size = random.nextInt(20) + 10;
        int[] haystack = new int[size];

        int i = 0;
        while(size != 0) {
            haystack[i] = random.nextInt(100);
            i++;
            size--;
        }

        System.out.println("Before sorting:\n");
        for(int hay : haystack) {
            System.out.println(hay);
        }
        System.out.println("\n\n----------\n\n");

        sort(haystack);

        System.out.println("After sorting:\n");
        for(int hay : haystack) {
            System.out.println(hay);
        }
        System.out.println("\n\n----------\n\n");

        int needle = random.nextInt(100);
        System.out.println(search(haystack, needle) + " is the location of " + needle + " (-1 = none)");

    }

    public static void sort(int[] haystack) { // A quadratic function. Although not the most efficient or fastes way to complete this it's the only way I've thought of how to complete the sort task.

        int i;
        int j;
        int size = haystack.length;
        for(i = 0; i < size; i++) {
            for(j = i + 1; j < size; j++) {
                if(haystack[i] > haystack[j]) {
                    int temporary = haystack[i];
                    haystack[i] = haystack[j];
                    haystack[j] = temporary;
                }
            }
        }

    }

    public static int search(int[] haystack, int needle) { // A linear function, more efficient than the sort function yet still not as efficient as I could think of how to make it, but it would take research to do so.

        int i;
        int location = -1;
        int size = haystack.length;
        for(i = 0; i < size; i++) {
            if(haystack[i] == needle) {
                location = i;
                i = haystack.length;
            } else if(i >= size) {
                location = -1;
            }
        }
        return location;

    }

}