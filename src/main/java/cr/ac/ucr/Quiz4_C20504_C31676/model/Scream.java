/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.Quiz4_C20504_C31676.model;

import java.awt.Dimension;

/**
 *
 * @author enier
 */
public class Scream {

    protected int iD;
    protected double upScale;
    protected Dimension resOrigin;
    protected Dimension resNew;

    public Scream() {
        this.iD = 89;
        this.upScale = 0;
        this.resOrigin = new Dimension(1280, 720);
        this.resNew = new Dimension(0, 0);
    }

    public Scream(int iD, Dimension resOrigin) {
        this.iD = iD;
        this.resOrigin = resOrigin;
    }

    public Scream(int iD, double upScale, Dimension resOrigin) {
        this.iD = iD;
        this.upScale = upScale;
        this.resOrigin = resOrigin;
    }

    public int getDiference() {
        
        return 0;
    }

    public Dimension getRescaledDimension() {
        resNew = new Dimension((int) (upScale * resOrigin.getWidth()), (int) (upScale * resOrigin.getHeight()));
        return resNew;
    }

    public Dimension getOriginDimension() {
        return this.resOrigin;
    }

}
