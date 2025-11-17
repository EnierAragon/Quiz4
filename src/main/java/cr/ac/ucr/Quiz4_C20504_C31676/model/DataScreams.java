/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.Quiz4_C20504_C31676.model;

import java.util.ArrayList;

/**
 *
 * @author enier
 */
public class DataScreams {

    protected ArrayList<Scream> userScreams;
    protected Scream[] userPresets;
    protected Scream[][] presets;

    public DataScreams() {
        starPreset();
    }

    private void starPreset() {
        userPresets[5] = new Scream();
        presets[2][3] = new Scream();
    }

}
