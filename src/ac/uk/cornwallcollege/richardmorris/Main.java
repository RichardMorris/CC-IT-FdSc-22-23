package ac.uk.cornwallcollege.richardmorris;

public class Main {

    record Rectangle(int x, int y, int w, int h) {}

    static int area(Object o) {
        if (o instanceof Rectangle(int x, int y, int w, int h)) {
            return w * h;
        }
        return 0;
    }

    static int area2(Object o) {
        int a = switch(o) {
        case Rectangle(int x, int y, int w, int h) ->
            w * h;
            default -> 0;
        };
        return a;
    }

    public static void main(String[] args) {
        var rect = new Rectangle(0,0,5,10);
        int a = area2(rect);
        System.out.println(rect.toString() + a);

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
