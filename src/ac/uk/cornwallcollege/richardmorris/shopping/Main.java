package ac.uk.cornwallcollege.richardmorris.shopping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        ShoppingRecorder sr = new ShoppingRecorder();
        //int lineno =1;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in)))  {
            String line;
            while((line = br.readLine() ) != null) {
                String parts[] = line.split(" ");

                if(parts.length==2) {
                    if(parts[0].equals("add")) {
                        sr.addWantedItem(parts[1],1);
                    }

                    if(parts[0].equals("show") && parts[1].equals("shoppinglist")) {
                        String[] keys = sr.inventory();
                        for(String item : keys) { // loop through the items
                            double q = sr.quantityNeeded(item);
                            System.out.println(item + " " + q);
                        }
                    }
                }
                if(parts.length==3) {
                    int quantity = Integer.parseInt(parts[2]);
                    System.out.println("Action "+parts[0]+" item "+ parts[1]
                            +" quantity "+quantity);
                    if(parts[0].equals("add")) {
                        sr.addWantedItem(parts[1],quantity);
                    }
                }
//                ++lineno;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
