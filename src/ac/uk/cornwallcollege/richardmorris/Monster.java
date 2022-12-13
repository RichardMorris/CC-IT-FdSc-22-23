package ac.uk.cornwallcollege.richardmorris;

public class Monster {
    boolean isAlive = true;
    private final String type;

    public Monster(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void kill() {
        isAlive = false;
    }

    @Override
    public String toString() {
        return type +
                (isAlive ? " alive" : " dead");
    }
}
