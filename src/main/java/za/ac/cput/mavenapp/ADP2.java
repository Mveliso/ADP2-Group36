/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenapp;

/**
 *
 * @author Mveliso Roto, 214211983
 */
public class ADP2 {
    
    private String mark1,mark2;
    
    public ADP2(){
    
    }

    public String getMark1() {
        return mark1;
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2;
    }

    @Override
    public String toString() {
        return "ADP_marks{" + "term1=" + mark1 + ", term2=" + mark2 + '}';
    }
    
}
        
