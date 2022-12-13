package ac.uk.cornwallcollege.richardmorris;

public class Main {

    public static void main(String[] args) {
        Player p1 = new Player("John");
        p1.jump();

        Monster m1 = new Monster("Dragon");
        System.out.println(m1);

        p1.attack(m1);
        System.out.println(m1);
        p1.addItem("sword");
        p1.attack(m1);
        System.out.println(m1);

    }
}
