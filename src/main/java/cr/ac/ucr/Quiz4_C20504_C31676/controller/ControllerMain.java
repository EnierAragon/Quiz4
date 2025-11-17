/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.Quiz4_C20504_C31676.controller;

import cr.ac.ucr.Quiz4_C20504_C31676.controller.ControllerVew.ControllerCalcScream;
import cr.ac.ucr.Quiz4_C20504_C31676.controller.ControllerVew.ControllerLogin;
import cr.ac.ucr.Quiz4_C20504_C31676.model.RegisterUsers;
import cr.ac.ucr.Quiz4_C20504_C31676.view.FrameCalc;
import cr.ac.ucr.Quiz4_C20504_C31676.view.FrameLogin;
import cr.ac.ucr.Quiz4_C20504_C31676.view.FramePresets;

/**
 *
 * @author enier
 */
public class ControllerMain {

    //vista
    FrameLogin fLogins;
    FrameCalc fCalcs;
    FramePresets fPresets;

    //model
    RegisterUsers users;

    //Controller
    ControllerLogin cLogin;
    ControllerCalcScream cCalc;
    ControllerModel cModel;

    public ControllerMain() {
    }

}
