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
public class Box_2 extends Box {

    public Box_2(int w, int h, int l, int grade, Boolean top, int num) {
        width = w;
        height = h;
        length = l;
        cardGrade = grade;
        sealableTop = top;
        quantity = num;
        cornerReinforce = false;
        bottomReinforce = false;
        colours = 1;
        percentageExtra = 13;
        costPerMetre = 0.6;
    }
    


}
