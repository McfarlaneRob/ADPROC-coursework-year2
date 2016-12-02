package adproc.coursework;

/**
 *
 * @author up790070
 */
public abstract class Box {

    int cardGrade, colours, quantity, width, height, length, percentageExtra;
    Boolean bottomReinforce, cornerReinforce, sealableTop;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getGrade() {
        return cardGrade;
    }

    public int getColour() {
        return colours;
    }

    public Boolean getBottomReinforce() {
        return bottomReinforce;
    }

    public Boolean getCornerReinforce() {
        return cornerReinforce;
    }

    public Boolean getSealableTop() {
        return sealableTop;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calcArea() {
        double lengthMetres = (double) length / 100;
        double widthMetres = (double) width / 100;
        double heightMetres = (double) height / 100;
        double area = (2 * (lengthMetres * widthMetres)) + (2 * (widthMetres * heightMetres)) + (2 * (lengthMetres * heightMetres));
        
        return area;
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

}
