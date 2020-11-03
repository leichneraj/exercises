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

    public void randomize() { // Randomizes color

        this.redValue = random.nextInt(255);
        this.greenValue = random.nextInt(255);
        this.blueValue = random.nextInt(255);

    }

    public void darkenLighten() { // Starts darken/lighten commands

        boolean darken = random.nextBoolean();
        int percentage = random.nextInt(100);
        System.out.println((darken ? "\nDarkened by " : "\nLightened by ") + percentage + "%:");

        darkenLightenRed(percentage, darken);
        darkenLightenGreen(percentage, darken);
        darkenLightenBlue(percentage, darken);

    }

    public void blend(int redValue, int greenValue, int blueValue) {

        this.redValue = (this.redValue + redValue) / 2;
        this.greenValue = (this.greenValue + greenValue) / 2;
        this.blueValue = (this.blueValue + blueValue) / 2;

    }

    public String getColor() {

        return "[" + this.redValue + "," + this.blueValue + "," + this.greenValue + "]"; // Returns color string

    }

    private void adjustValues() {

        redAdjust();
        greenAdjust();
        blueAdjust();

    }

    private void redAdjust() { // Adjust green to its minimum or maximum

        if(this.redValue > 255) {
            this.redValue = 255;
        } else if(this.redValue < 0) {
            this.redValue = 0;
        }


    }

    private void greenAdjust() { // Adjust green to its minimum or maximum

        if(this.greenValue > 255) {
            this.greenValue = 255;
        } else if(this.greenValue < 0) {
            this.greenValue = 0;
        }

    }

    private void blueAdjust() { // Adjust blue to its minimum or maximum

        if(this.blueValue > 255) {
            this.blueValue = 255;
        } else if(blueValue < 0) {
            this.blueValue = 0;
        }

    }

    private void darkenLightenRed(int percentage, boolean darken) { // Darken/lighten red

        if(darken) {
            this.redValue = this.redValue - ((this.redValue / 100) * percentage);
        } else {
            this.redValue = this.redValue + ((this.redValue / 100) * percentage);
        }

        adjustValues();

    }

    private void darkenLightenGreen(int percentage, boolean darken) { // Darken/lighten green

        if(darken) {
            this.greenValue = this.greenValue - ((this.greenValue / 100) * percentage);
        } else {
            this.greenValue = this.greenValue + ((this.greenValue / 100) * percentage);
        }

        adjustValues();

    }

    private void darkenLightenBlue(int percentage, boolean darken) { // Darken/lighten blue

        if(darken) {
            this.blueValue = this.blueValue - ((this.blueValue / 100) * percentage);
        } else {
            this.blueValue = this.blueValue + ((this.blueValue / 100) * percentage);
        }

        adjustValues();

    }

}
