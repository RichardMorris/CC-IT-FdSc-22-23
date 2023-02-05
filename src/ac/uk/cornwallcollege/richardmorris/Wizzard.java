package ac.uk.cornwallcollege.richardmorris;

public class Wizzard extends Enemy {
    String name;

    public Wizzard(String name) {
        this.name = name;
    }
    public void revive(Monster m) {
        System.out.println(name + " revives " + m.getType());
        m.resurrect();
    }
    @Override
    public String toString() {
        return name +
                (isAlive ? " alive" : " dead");
    }

}
