/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.Quiz4_C20504_C31676.model;

/**
 *
 * @author enier
 */
public class RegisterUsers {

    protected User[] users;

    public RegisterUsers() {
        users[5] = new User("");
    }

    public void setUser(String name, int pos) {
        users[pos] = new User(name);
    }
    
    public void Resgister(String name) {
          
    }
    

}
