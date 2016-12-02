package adproc.coursework;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author up790070
 */
public class Order {

    ArrayList<Box> boxes = new ArrayList();

    public Order() {
    }

    public void addToOrder(int grad, int col, int w, int h, int l, int quant, boolean bottom, boolean corner, boolean top) {
        if (grad <= 0 || grad > 5 || col < 0 || col > 2) { // check all parameters within acceptable ranges
            System.out.println("Parameters out of range");
        } else if (col == 0 && grad <= 3 && bottom == false && corner == false) {// check if it meets parameters for type I
            Box_1 box = new Box_1(w, h, l, grad, top, quant);
            boxes.add(box);
            System.out.println("-Box_1 added to order");
        } else if ((grad >= 2 && grad <= 4) && col == 1 && bottom == false && corner == false) { // check if it meets parameters for type II
            Box_2 box = new Box_2(w, h, l, grad, top, quant);
            boxes.add(box);
            System.out.println("-Box_2 added to order");
        } else if (grad >= 2 && col == 2 && bottom == false && corner == false) { // check if it meets parameters for type III
            Box_3 box = new Box_3(w, h, l, grad, top, quant);
            boxes.add(box);
            System.out.println("-Box_3 added to order");
        } else if (grad >= 2 && col == 2 && bottom == true && corner == false) { // check if it meets parameters for type IV
            Box_4 box = new Box_4(w, h, l, grad, top, quant);
            boxes.add(box);
            System.out.println("-Box_4 added to order");
        } else if (grad >= 2 && col == 2 && bottom == true && corner == true) { // check if it meets parameters for type V
            Box_5 box = new Box_5(w, h, l, grad, top, quant);
            boxes.add(box);
            System.out.println("-Box_5 added to order");
        } else {
            System.out.println("Failed to find box type");
            JOptionPane.showMessageDialog(null, "Unfortunately we cannot \nmake that box");
        }
    }

    public void displayOrder() {
        String output = "";
        output += ("\nNumber of different boxes: " + numBoxTypes());
        output += ("\nTotal number of boxes: " + numBoxes());
        output += "\n------------------";

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        int count = 1;
        for (Box box : boxes) {
            output += ("\nBox " + count + " dimensions (w/h/l): (" + box.getWidth() + "/" + box.getHeight() + "/" + box.getLength() + ")");
            output += ("\nAmount of Box " + count + ": " + box.getQuantity());
            output += ("\nThe cost of box " + count + " is: £" + df.format(box.calcCost()));
            output += "\n------------------";
            count ++;
        }
        output += ("\nThe total cost of this order is: £" + df.format(totalCost()));
        System.out.println("");
        
        JOptionPane.showMessageDialog(null, output);
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

    // outputs the number of items in the list of boxes ordered
    public int numBoxTypes() {
        return boxes.size();
    }

    // removes all box objects from the list
    public void clearOrder() {
        while (boxes.size() > 0) {
            boxes.remove(0);
        }
        System.out.println("Order has been cleared!");
    }
}
