/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentalDesignPatterns.delegationExample;

/**
 *
 * @author GOD
 */
public class Crop {
    private String type;
    public Crop (String initType){
        this.type = initType;
    }
    
    public void setType(String newType){
        this.type = newType;
    }
    
    public String getType(){
        return this.type;
    }
    
    public boolean isType(String newType){
        return (this.type == null ? newType == null : this.type.equals(newType));
    }
}
