package adproc.coursework;

/**
 * @author up790070
 */
public class Box {
    int cardGrade, colours, quantity;
    double width, height, length;
    Boolean bottomReinforce, cornerReinforce, sealableTop;
    
    public Box(int w, int h, int l, int grade, int col, Boolean bottom, Boolean corners, Boolean top, int num) {
        width = w; // cm
        height = h; // cm
        length = l; // cm
        cardGrade = grade;
        colours = col; // 0 - 2
        bottomReinforce = bottom;
        cornerReinforce = corners;
        sealableTop = top;
        quantity = num;
    }
    
    public double getArea() {
        double area = (2 * (length * width)) + (2 * (width * height)) + (2 * (length * height));
        return area;
    }

    public double calcCost() {
        double costs[] = {0.5, 0.6, 0.72, 0.9, 1.4};
        double areaMeters = this.getArea() / 10000;
        double basicCost = areaMeters * costs[cardGrade - 1];
        double extraCost = basicCost * (extraCostsPercentage() / 100);
        double cost = basicCost + extraCost;
        cost = cost * quantity;
        return cost;
    }
    
    public boolean checkBox() {
        Boolean validity = false;
        if (cardGrade <= 0 || cardGrade > 5 || colours < 0 || colours > 2) { // check all parameters within acceptable ranges
            validity = false;
        } else if (colours == 0 && cardGrade <= 3 && bottomReinforce == false && cornerReinforce == false) {// check if it meets parameters for type I
            validity = true;
        } else if ((cardGrade >= 2 && cardGrade <= 4) && colours == 1 && bottomReinforce == false && cornerReinforce == false) { // check if it meets parameters for type II
            validity = true;
        } else if (cardGrade >= 2 && colours == 2 && bottomReinforce == false && cornerReinforce == false) { // check if it meets parameters for type III
            validity = true;
        } else if (cardGrade >= 2 && colours == 2 && bottomReinforce == true && cornerReinforce == false) { // check if it meets parameters for type IV
            validity = true;
        } else if (cardGrade >= 2 && colours == 2 && bottomReinforce == true && cornerReinforce == true) { // check if it meets parameters for type V
            validity = true;
        }
        return validity;
    }

    public double extraCostsPercentage() {
        double extra = 0;
        if (colours == 1) {
            extra += 13;
        } else if (colours == 2) {
            extra += 16;
        }
        if (bottomReinforce) {
            extra += 14;
        }
        if (cornerReinforce) {
            extra += 10;
        }
        if (sealableTop) {
            extra += 8;
        }
        return extra;
    }
}
