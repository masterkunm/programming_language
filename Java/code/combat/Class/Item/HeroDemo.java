package Class.Item;

public class HeroDemo {
    // fields
    String name;
    float hp;

    public static void main(String[] args) {
        HeroDemo garen = new HeroDemo();
        garen.name = "盖伦";
        garen.hp = 100.0F;
        garen.legendary();
        garen.getHp();
        garen.recovery(200.0F);
        garen.printState();
    }

    // methods
    void legendary() {
        System.out.println("You have been legendary!");
    }

    float getHp() {
        return hp;
    }

    void recovery(float blood) {
        hp += blood;
    }

    void printState() {
        System.out.println(name + ' ' + hp);
    }
}