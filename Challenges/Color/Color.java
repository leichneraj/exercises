import java.util.Random;

public class Color {
    Random random = new Random();

    private int redValue, greenValue, blueValue;
    
    public Color(int redValue, int greenValue, int blueValue) {

        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;

        adjustValues();

    }

    public String getColor() {

        return "[" + this.redValue + "," + this.blueValue + "," + this.greenValue + "]"; // Returns color string

    }

    public void randomize() { // Randomizes color

        this.redValue = random.nextInt(255);
        this.greenValue = random.nextInt(255);
        this.blueValue = random.nextInt(255);

    }

    public String darkenLighten() { // Starts darken/lighten commands

        boolean darken = random.nextBoolean();
        int percentage = random.nextInt(100);

        this.redValue = darkenLighten(percentage, darken, this.redValue);
        this.greenValue = darkenLighten(percentage, darken, this.greenValue);
        this.blueValue = darkenLighten(percentage, darken, this.blueValue);

        adjustValues();
        return (darken ? "\nDarkened by " : "\nLightened by ") + percentage + "%:";

    }

    public void blend(int redValue, int greenValue, int blueValue) {

        this.redValue = (this.redValue + redValue) / 2;
        this.greenValue = (this.greenValue + greenValue) / 2;
        this.blueValue = (this.blueValue + blueValue) / 2;

    }

    private void adjustValues() {

        this.redValue = adjust(this.redValue);
        this.greenValue = adjust(this.greenValue);
        this.blueValue = adjust(this.blueValue);

    }

    private int adjust(int value) { // Adjust a color to its minimum or maximum

        if(value > 255) {
            value = 255;
        } else if(value < 0) {
            value = 0;
        }

        return value;

    }

    private int darkenLighten(int percentage, boolean darken, int colorValue) { // Darken/lighten color values

        if(darken) {
            colorValue = colorValue - ((colorValue / 100) * percentage);
        } else {
            colorValue = colorValue + ((colorValue / 100) * percentage);
        }

        return colorValue;

    }

}