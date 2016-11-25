package adproc.coursework;

/**
 * @author up790070
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box box = new Box(100, 100, 100, 4, 2, true, false, false, 1);
        Boolean check = box.checkBox();
        System.out.println("Validity: " + check);
        System.out.println("Box cost: " + box.calcCost());

        Box box2 = new Box(100, 100, 100, 4, 2, true, false, false, 10);
        Order order = new Order();
        order.addBox(box);
        order.addBox(box2);
        System.out.println("Total cost: " + order.totalCost());
        System.out.println("Amount of boxes: " + order.numBoxes());
        System.out.println("Number of box types: " + order.numBoxTypes());
    }
    
}
