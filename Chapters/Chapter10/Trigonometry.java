public class Trigonometry {
    
    public static void main (String[] args) {
        double x = 0.5236;
        double sinx = (Math.sin( 0.5236 )) * Math.PI/180;
        double cosx = (Math.cos( 0.5236 )) * Math.PI/180;
        double sum = ((sinx * sinx) + (cosx * cosx));


        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
    }
}