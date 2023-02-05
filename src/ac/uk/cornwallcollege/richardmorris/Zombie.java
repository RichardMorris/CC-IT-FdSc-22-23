 package ac.uk.cornwallcollege.richardmorris;

public class Zombie extends  Monster {
    public Zombie() {
        super("Zombie"); // calling the super class constructor
    }
    @Override
    public void kill() {
        System.out.println("Can't kill a zombie");
    }
}
