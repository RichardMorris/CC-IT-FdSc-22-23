package ac.uk.cornwallcollege.richardmorris;

public class Enemy {

    boolean isAlive = true;
    public void kill() {
        isAlive = false;
    }
    public void resurrect() { isAlive = true; }

}
