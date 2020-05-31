package Class;

interface Bicycle {
    void speedUp(int newSpeed);
    void changeWheel(int newWheel);
}

class ClassDemo implements Bicycle{
    int speed = 10;
    int wheel = 2;

    public void speedUp(int newSpeed) {
        speed = newSpeed;
    }

    public void changeWheel(int newWheel) {
        wheel = newWheel;
    }

    void printState() {
        System.out.print(speed);
        System.out.println(wheel);
    }
}