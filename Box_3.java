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
public class Box_3 extends Box {

    public Box_3(int w, int h, int l, int grade, Boolean top, int num) {
        width = w;
        height = h;
        length = l;
        cardGrade = grade;
        sealableTop = top;
        quantity = num;
        cornerReinforce = false;
        bottomReinforce = false;
        colours = 2;
        percentageExtra = 16;
    }
    
    public double calcCost() {
        if (sealableTop) {
            percentageExtra += 8;
        }
        double area = this.calcArea();
        double basicCost = area * 0.72;
        double extraCost = basicCost * (percentageExtra / 100);
        double cost = basicCost + extraCost;
        cost = cost * quantity;

        return cost;
    }

}
