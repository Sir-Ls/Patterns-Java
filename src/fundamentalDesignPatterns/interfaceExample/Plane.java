/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentalDesignPatterns.interfaceExample;

import java.util.ArrayList;

/**
 * Provides service for Point
 * @author Andrew Searles
 */
public class Plane { 
             
    public class PlanePoint implements Point{
        private double x;
        private double y;

        public PlanePoint(double initX, double initY){
            this.x = initX;
            this.y = initY;
        }

        /**
         *
         * @param newX
         * @param newY
         */
        @Override
        public void setXY(double newX, double newY) {
            this.x = newX;
            this.y = newY;
        };
        public void setX(double newX) {
            this.x = newX;
        };
        public void setY(double newY) {
            this.y = newY;
        };
        public double getY() { return y; };
        public double getX() { return x; };
    }
    ArrayList<PlanePoint> points;
    public Plane(){
        points = new ArrayList<PlanePoint>();
        for (int i = 0; i < 100; i++){
            PlanePoint point = new PlanePoint(1000*Math.random(),1000*Math.random());
            points.add(point);
        }
        
    }
    
    
    public static void main(String[] args) {
        Plane plane = new Plane();
        for (int i = 0; i < 100; i++){
            System.out.println(plane.points.get(i));
        }
        
    }    
            
}