/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.controller.pattern;

/**
 *
 * @author nathanlarson
 */
public class ApplicationControllerPattern {

    ApplicationController app = new ApplicationController();
    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO code application logic here
        
        
        this.optionOne();
        
    }
    
    public void optionOne() {
        String a = app.PickClass("new");
        String b = app.PickClass("old");
    }
    
}
