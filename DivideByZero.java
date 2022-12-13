/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dividebyzero;

/**
 *
 * @author Jebarson
 */
public class DivideByZero {
    public void division(){
        try{
            int numerator=10;
            int denominator=0;
            int divide=numerator/denominator;
            System.out.println("Final value is "+divide);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("End the pgm");
        }
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivideByZero div = new DivideByZero();
        div.division();
        // TODO code application logic here
    }
    
}
