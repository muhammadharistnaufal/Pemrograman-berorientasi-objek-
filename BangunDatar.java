/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionFive;

/**
 *
 * @author marse
 */

public class BangunDatar {
    
    private int p,l,s;
    
// Konstruktor untuk bangun datar
    BangunDatar(int s){
        this.s=s;
    }
    // konstruktor untuk persegi panjang
    
    BangunDatar(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    // Setter
    void setPL(int p, int l){
        this.p=p;
        this.l=l;        
    }
    void setSisi(int s){
        this.s=s;
    }
    
    // Getter
    int getP(){
        return p;
    }
    int getL(){
        return l;        
    }
    int getS(){
        return s;
    }
}
