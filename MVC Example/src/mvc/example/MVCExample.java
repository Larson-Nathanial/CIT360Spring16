/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.example;

/**
 *
 * @author nathanlarson
 */
public class MVCExample {

    Controller c = new Controller();
    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO code application logic here
        
        // User interaction to Controller
        
        this.userTouched();
    }
    
    public void userTouched() {
        c.loadAString();
    }
    
    public void displayAString() {
        // Displays to view from Model
    }
    
}
