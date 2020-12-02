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

    public void darken(int percentage) {

        percentage = percentage * -1;
        this.redValue = darkenLighten(percentage, this.redValue);
        this.greenValue = darkenLighten(percentage, this.greenValue);
        this.blueValue = darkenLighten(percentage, this.blueValue);

        adjustValues();

    }

    public void lighten(int percentage) { 

        this.redValue = darkenLighten(percentage, this.redValue);
        this.greenValue = darkenLighten(percentage, this.greenValue);
        this.blueValue = darkenLighten(percentage, this.blueValue);

        adjustValues();

    }

    private int darkenLighten(int percentage, int colorValue) { // Darken/lighten color values

        colorValue = colorValue + (colorValue * (percentage / 100));
        return colorValue;

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

}