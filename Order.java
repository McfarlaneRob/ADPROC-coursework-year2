package adproc.coursework;

import java.util.ArrayList;

/**
 *
 * @author up790070
 */
public class Order {

    ArrayList<Box> boxes = new ArrayList();

    // adds valid boxes to end of list, otherwise rejects wth message
    public void addBox(Box toAdd) {
        if (toAdd.checkBox()) {
            boxes.add(toAdd);
        } else {
            System.out.println("Invalid box: Box not added to Order!");
        }
    }

    // outputs the total cost of all boxes in the order
    public double totalCost() {
        double cost = 0;
        for (int i = 0; i < boxes.size(); i++) {
            cost += boxes.get(i).calcCost();
        }
        return cost;
    }

    // ouutputs number of boxes in the current order
    public int numBoxes() {
        int amount = 0;
        for (int i = 0; i < boxes.size(); i++) {
            amount += boxes.get(i).quantity;
        }
        return amount;
    }

    // outputs the number of items in the list
    public int numBoxTypes() {
        return boxes.size();
    }

    // removes all box objects from the list
    public void clearOrder() {
        while(boxes.size() > 0){
            boxes.remove(0);
        }
        System.out.println("Order has been cleared!");
    }
}
