public class ColorTester {

    public static void main(String[] args) {

        Color c = new Color(255, 255, 255); // Sets to white
        System.out.println(c.getColor()); // Prints white

        c.randomize(); // Randomizes all color values
        System.out.println(c.getColor());

        System.out.println(c.darkenLighten()); // Prints description
        System.out.println(c.getColor()); // Prints color change

        c.blend(22, 89, 142); // Blends the color with [22,89,142]
        System.out.println("\nBlend: \n" + c.getColor()); // Prints the blend

    }

}
