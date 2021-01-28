import java.util.ArrayList;

public class ArrayList {
    
    public static void main(String[] args) {
        String[] fruit =  {"apple","bannana","melon","dragon fruit","avacado","orange","lemon","strawberry","pear"};
        String[] vegetable = {"broccoli","carrot","corn","asperagus","potato","zucchini","beet","yam","eggplant","kale"};

        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<String> vegetables = new ArrayList<String>();

        fruits.add("banana");
        // fruits.addAll(Arrays.asList(fruit));
        // vegetables.addAll(Arrays.asList(vegetable));

        // System.out.print(combineSort(fruits, vegetables));
    }

    // public static List combineSort(List fruits, List vegetables) {
    //     List<String> combined = new ArrayList<>();
    //     for(int i = 0; i < fruits.size(); i++) {
    //         String fruit = fruits.get(i);
    //         combined.add(fruit);
    //     }
    //     for(int i = 0; i < vegetables.size(); i++) {
    //         String vegetable = vegetables.get(i);
    //         combined.add(vegetable);
    //     }
    //     combined = sort(combined, false);
    //     return combined;
    // }

    // public static List sort(List needSorted, boolean reverse) {
    //     //              Source for sorting code: https://howtodoinjava.com/java/sort/sort-arraylist-strings-integers/ 
    //     if(reverse) {
    //         names.sort(Comparator.comparing(String::toString).reversed());     
    //     } else {
    //         names.sort( Comparator.comparing(String::toString)); 
    //     }
    //     return needSorted;
    // }
}
