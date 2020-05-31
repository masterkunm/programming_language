package Class.Item;

public class Item {
    // fields
    String name;
    int price;
    public static void main(String[] args) {
        Item potion = new Item();
        potion.name = "血瓶";
        potion.price = 50;
        printState(potion);

        Item shoes = new Item();
        shoes.name = "鞋子";
        shoes.price = 300;
        printState(shoes);

        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;
        printState(sword);
    }

    public static void printState(Item item) {
        System.out.println(item.name + ' ' + item.price);
    }
}