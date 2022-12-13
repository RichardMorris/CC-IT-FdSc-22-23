package ac.uk.cornwallcollege.richardmorris;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    List<String> equipment = new ArrayList<>();
    public Player(String name) {
        this.name = name;
    }

    // methods correspond to actions
    public void jump() {
        System.out.println(name + " Jumps");
    }

    public void attack(Monster m) {
        System.out.println(name + " attacks " + m.getType());
        if(equipment.contains("sword")) {
            m.kill();
        }
    }

    public void addItem(String name) {
        equipment.add(name);
    }

    public void attack(Wizzard w) {
        System.out.println(name + " attacks " + w);
        if(equipment.contains("sword")) {
            w.kill();
        }
    }
}
