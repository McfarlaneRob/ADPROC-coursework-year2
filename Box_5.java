/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc.coursework;

/**
 *
 * @author up790070
 */
public class Box_5 extends Box {

    public Box_5(int w, int h, int l, int grade, Boolean top, int num) {
        width = w;
        height = h;
        length = l;
        cardGrade = grade;
        sealableTop = top;
        quantity = num;
        cornerReinforce = true;
        bottomReinforce = true;
        colours = 2;
        percentageExtra = 40;
    }
    
    public double calcCost() {
        if (sealableTop) {
            percentageExtra += 8;
        }
        double area = this.calcArea();
        double basicCost = area * 1.4;
        double extraCost = basicCost * (percentageExtra / 100);
        double cost = basicCost + extraCost;
        cost = cost * quantity;

        return cost;
    }

}
