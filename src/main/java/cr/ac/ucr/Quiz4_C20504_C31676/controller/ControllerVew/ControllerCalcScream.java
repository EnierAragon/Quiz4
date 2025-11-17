/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.Quiz4_C20504_C31676.controller.ControllerVew;

import cr.ac.ucr.Quiz4_C20504_C31676.controller.ControllerModel;
import cr.ac.ucr.Quiz4_C20504_C31676.view.FrameCalc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author enier
 */
public class ControllerCalcScream implements ActionListener {

    FrameCalc screamCalc;
    ControllerModel cModel;

    public ControllerCalcScream(FrameCalc fCacl, ControllerModel cCalc) {
        initComponets(fCacl, cCalc);
        screamCalc.listen(this);
    }

    private void initComponets(FrameCalc fCalc, ControllerModel cCalc) {
        screamCalc = fCalc;
        cModel = cCalc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "btnOrigin":

                break;

            case "btnScale":

                break;

            case "btnSave":

                break;

            case "btnDelete":

                break;

            case "btnSearch":

                break;

            case "btnPresets":

                break;

            case "btnDiference":

                break;

            default:
                throw new AssertionError();
        }
    }

}
