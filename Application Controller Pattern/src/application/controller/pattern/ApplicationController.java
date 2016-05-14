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
public class ApplicationController {
    
    AnotherClass anotherClass = new AnotherClass();
    
    public String PickClass(String item) {
        
        if (item == "new") {
            return anotherClass.findNew();
        }else {
            return anotherClass.findOld();
        }
        
    }
    
}


