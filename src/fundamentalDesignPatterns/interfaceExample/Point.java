/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentalDesignPatterns.interfaceExample;

/**
 *
 * @author Andrew Searles
 */
public interface Point {
    public void setXY(double newX, double newY);
    public void setX(double newX);
    public void setY(double newY);
    public double getY();
    public double getX();
}
