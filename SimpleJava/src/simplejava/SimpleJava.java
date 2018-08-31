/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejava;

/**
 *
 * @author DELL
 */
public class SimpleJava {

    /**
     * @param args the command line arguments
     */
    
    private String name;
    
    public static void showString(SimpleJava obj) {
        System.out.println("name: "+obj.name);
    }
    public SimpleJava(String name) {
        this.name= name;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleJava obj = new SimpleJava("Majid");
        SimpleJava.showString(obj);
    }
    
}
