
/**
 * Write a description of class firstClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Profile
{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //This is a single-line comment
        /** This
         * is a
         * multi-line comment
         */
        String carName = "Bob";
        int maxSpeed = 120;
        int x = 5, y = 6,z = 50;
        System.out.println(carName.length());
        
        String name = "Alex";
        int gradYear = 2028;
        String town = "Holden";
        boolean csMajor = false;
        boolean econMajor = true;
        System.out.println("Hello there! My name is " + name + ".");
        System.out.println("I am Wellesley class of " + gradYear + ".");
        System.out.println("I am a computer science major: " + csMajor);
        System.out.println("And, I live in "+ town);

    }
    
    public int sumNum(int x, int y) {
        return x+y;
    }
    
    public double doStuff (int x, int y) {
        double z = (double) x + (double) y;
        z *= 5;
        z /= Math.random();
        ++z;
        return z;
    }
    
}