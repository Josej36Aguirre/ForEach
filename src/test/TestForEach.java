
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        
        int edades[] = {5,6,8,9};
        for(int edad:edades){
            System.out.println("Edad = "+edad);
        }
        
        Persona persona[] = {new Persona("Jose"),new Persona("Diana"), new Persona("Karla")};
        
        for (Persona persona1 : persona) {
            System.out.println("Persona = "+persona1);
        }
    }
}
