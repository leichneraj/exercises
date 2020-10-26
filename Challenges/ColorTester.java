public class ColorTester {

    public static void main(String[] args) {
        boolean stop = false;
        Color c = new Color();

        c.humanInput();
        c.darkenLighten();
        c.blend();

        while(!stop) {

            String again = c.again();
            if(again.contains("y")) {
                Color cRedo = new Color();
                cRedo.darkenLighten();
                cRedo.blend();
            } else {
                stop = true;
            }

        }
    }
}