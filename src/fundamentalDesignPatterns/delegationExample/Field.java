/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentalDesignPatterns.delegationExample;

import java.util.ArrayList;

/**
 *
 * @author GOD
 */
public class Field {
    private ArrayList crops;
    
    public Field() {
        this.crops = new ArrayList();
    }
    
    public void plantCrop(Crop crop){
        crops.add(crop);
    }
            
    public void checkCrops(){
            System.out.println(crops);
    }
    
    public ArrayList getCrops(){
        return crops;
    }
    
}
