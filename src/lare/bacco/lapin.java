package lare.bacco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JOCELYNE BACCO
 */
public class lapin {
   private String name;
   private int age;

    public lapin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void crier() {
        System.out.println("HAAAAAAAAAA !");
    }
     
   
            
    
}
