/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actor;

/**
 *
 * @author Jebarson
 */
public class Actor {
    String name,bornname,dob,birthplace,othernames,occupation,spouse,children,awards;
    int age, activeyear,marriedyear;
    public Actor(String name,String bornname,String dob,String birthplace,String othernames,String occupation,String spouse,String children,String awards,int age, int activeyear,int marriedyear){
    this.name=name;
    this.bornname=bornname;
    this.dob=dob;
    this.birthplace=birthplace;
    this.othernames=othernames;
    this.occupation=occupation;
    this.spouse=spouse;
    this.children=children;
    this.awards=awards;
    this.age=age;
    this.activeyear=activeyear;
    this.marriedyear=marriedyear;
}
    void displayDetails(){
        System.out.println(name+" is a Indian Actor. His born name is "+bornname+". He was born on "+dob+" at "+birthplace);
        System.out.println("His other names are "+othernames+". He married with "+spouse+" in "+marriedyear );
        System.out.println("His children's names are "+children+". He got "+awards);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Actor rajini = new Actor("Rajinikanth","Sivaji Rao Gaikwad","12 Dec 1950","Bangalore","Rajini, Superstar, Thalaivar","Actor, producer,Screenwriter","Latha Rajinikanth","Aishwarya, Soundarya","Dadasaheb phalke award in 2021, Padma vibushan in 2016, NTR National award in 2016,Padma Bhushan in 2000",73,1975,1981);
        rajini.displayDetails();
    // TODO code application logic here
    }
    
}
