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
public class Farm {
    Field field;
    Crop potato;
    public Farm() {
        field = new Field();
        potato = new Crop("potato");
    }
    
    //This is what delegation is
    public void plantCrop(Field field, Crop crop) {
        field.plantCrop(crop);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Farm farm = new Farm();
        farm.plantCrop(farm.field, farm.potato);
        System.out.println(farm);
    }
}
