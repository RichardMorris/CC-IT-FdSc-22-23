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

        Wizzard w1 = new Wizzard("Bee");
        w1.revive(m1);
        System.out.println(m1);

        p1.attack(w1);

        Zombie z1 = new Zombie();
        System.out.println(z1);
        z1.kill();
        System.out.println(z1);

    }
}
