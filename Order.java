package adproc.coursework;

import java.util.ArrayList;

/**
 *
 * @author up790070
 */
public class Order {

    ArrayList<Box> boxes = new ArrayList();

    public void addBox(Box toAdd) {
        if (toAdd.checkBox()) {
            boxes.add(toAdd);
        } else {
            System.out.println("Invalid box: Box not added to Order!");
        }
    }

    public double totalCost() {
        double cost = 0;
        for (int i = 0; i < boxes.size(); i++) {
            cost += boxes.get(i).calcCost();
        }
        return cost;
    }

    public int numBoxes() {
        int amount = 0;
        for (int i = 0; i < boxes.size(); i++) {
            amount += boxes.get(i).quantity;
        }
        return amount;
    }

    public int numBoxTypes() {
        return boxes.size();
    }

    public void clearOrder() {
        while(boxes.size() > 0){
            boxes.remove(0);
        }
        System.out.println("Order has been cleared!");
    }
}
