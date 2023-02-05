package ac.uk.cornwallcollege.richardmorris;

public class Monster extends Enemy{
    private final String type;

    public Monster(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type +
                (isAlive ? " alive" : " dead");
    }
}
