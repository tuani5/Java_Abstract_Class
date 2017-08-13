/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

abstract class Bike
{  
    abstract void run();  
}  
class Honda4 extends Bike
{  
    void run()
    {
        System.out.println("running safely..");

    }
}  
public class Test {
   

    public static void main(String[] args) 
    {

        Bike my=new Honda4();
        my.run();
    }
}
