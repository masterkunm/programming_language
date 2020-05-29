/**
 * test for field
 * @ 西行修真的伍师弟
 * @ 28/05/2020
 */
public class Bicycle {
    // fields
    public static int gear = 2;
    public int wheels;
    public int speed;

    // constructor
    public Bicycle() {
        wheels = 2;
        speed = 40;
    }

    public static void main(String[] args) {
        // static field -- class variable
        System.out.println(Bicycle.gear);

        /** 
         * invalid implementation
         * it is illegal to printout instance variable without instantiation
         * System.out.println(Bicycle.speed);
         */ 

        // object
        Bicycle b0 = new Bicycle();
        // non-static field -- instance variable
        System.out.println(b0.wheels);
        
        // this is not a good way to access static field
        // System.out.println(b0.gear);
    }
}