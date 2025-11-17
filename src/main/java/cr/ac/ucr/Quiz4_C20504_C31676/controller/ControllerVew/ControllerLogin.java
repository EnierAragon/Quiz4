/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.Quiz4_C20504_C31676.controller.ControllerVew;

import cr.ac.ucr.Quiz4_C20504_C31676.model.RegisterUsers;
import cr.ac.ucr.Quiz4_C20504_C31676.view.FrameLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hjcar
 */
public class ControllerLogin implements ActionListener{

    FrameLogin fLogin;
    RegisterUsers mUser;

    public ControllerLogin() {
    }

    public ControllerLogin(FrameLogin fLogin, RegisterUsers mUser) {
        this.fLogin = fLogin;
        this.mUser = mUser;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "btnLogin":
                
                break;
                
            case "btnRegister":
                
                break;
                
            default:
                throw new AssertionError();
        }
    }
    
}
