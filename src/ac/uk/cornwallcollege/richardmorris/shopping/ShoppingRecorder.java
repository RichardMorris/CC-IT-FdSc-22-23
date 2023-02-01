package ac.uk.cornwallcollege.richardmorris.shopping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingRecorder {

    // A HashMap IS_A type of Map
    // A Map describes what maps should do:
    //          put: a key-value pair,
    //          get: the values associated with a key,
    //          containsKey : finds out if a key is set
    // Map does not have an implementation, its an Interface
    //
    // HashMap is an implementation of a Map
    // it defines how it works

    Map<String,Double> wantedItems = new HashMap<String,Double>();
    Map<String,Double> heldItems = new HashMap<>();

    public void addWantedItem(String name, double quantity) {
        if(wantedItems.containsKey(name)) {
            double currentQuantity = wantedItems.get(name);
            double newQuantity = currentQuantity + quantity;
            wantedItems.put(name,newQuantity);
        } else {
            wantedItems.put(name,quantity);
        }
    }

    /**
     * Takes quantity from heldItems corresponding to the key name.
     * @param name
     * @param quantity
     */
    public void consume(String name, double quantity) {
        if(heldItems.containsKey(name)) { // do I recognise the name
            double currentQuantity = heldItems.get(name); // find out how much we currently have
            if(currentQuantity < quantity) {
                throw new IllegalStateException("We don't have enough of type "+name);
            }
            double newQuantity = currentQuantity - quantity;
            heldItems.put(name, newQuantity);   // update new quantity
        }
        else {
            throw new IllegalStateException("We dont have any items of type "+name);
        }
    }

    public void buyItem(String name, double quantity) {
        if(wantedItems.containsKey(name)) {
            double currentQuantity = heldItems.get(name);
            double newQuantity = currentQuantity + quantity;
            heldItems.put(name,newQuantity);
        } else {
            double currentQuantity = 0;
            if(heldItems.containsKey(name)) {
                currentQuantity = heldItems.get(name);
            }
            double newQuantity = currentQuantity + quantity;
            heldItems.put(name,newQuantity);
        }
    }

    /**
     * How many of this item do we have in stock?
     * @param name name of the item
     * @return number of items, or 0 if item is not in held list
     */
    public double stockOf(String name) {
        if(heldItems.containsKey(name)) {
            return heldItems.get(name);
        }
        else {
            return 0;
        }
    }

    /**
     * How many of this item are on the wanted list?
     * @param name name of the item
     * @return number of items, or 0 if item is not in wanted list
     */
    public double quantityNeeded(String name) {
        if(wantedItems.containsKey(name)) {
            return wantedItems.get(name);
        }
        else {
            return 0;
        }

    }

    public String[] inventory() {
        Set<String> A =  wantedItems.keySet(); // first find the set of keys

        String[] array = A.toArray(new String[0]); // then convert them into and array

        //String[] array = wantedItems.keySet().toArray(new String[0]);

        Arrays.sort(array); // sorts in alphabetical order

        return array;
    }
}
