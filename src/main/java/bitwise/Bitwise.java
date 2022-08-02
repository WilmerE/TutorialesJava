/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitwise;

/**
 *
 * @author wilme
 */
public class Bitwise {
    
    private byte n1, n2;
    
    public Bitwise(byte n1, byte n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public void operatorAND(){
        byte a = n1; //O (a = n1 & n2)
        a &= n2;
        System.out.println("Operador AND : " + a);
        System.out.println("Operador AND : " + (n1 & n2));
    }
    
    public void operatorOR(){
        // (|=)
        System.out.println("\nOperador OR  : " + (n1 | n2));
    }
    
    public void operatorXOR(){
        // (^=)
        System.out.println("Operador XOR : " + (n1 ^ n2));
    }
    
    public void operatorU(){
        System.out.println("\nOperador ~   : " + ~n1);
        System.out.println("Operador ~n+1 : " + (~n1 + 1));
    }
    
    public void operatorNOT(){
        System.out.println("\nOperador NOT : " + ((~n1 & n2)|(n1 & ~n2)));
    }
    
    public void operatorLeftShift(){
        // (<<=)
        int neg = ~n1+1;
        System.out.println("\nOperador << (+"+n1+"): " + (n1<<n2));
        System.out.println("Operador << ("+neg+"): " + (neg<<n2));
    }
    public void operatorRightShift(){
        // (>>=)
        int neg = ~n1+1;
        System.out.println("\nOperador >> (+"+n1+"): " + (n1>>n2));
        System.out.println("Operador >> ("+neg+"): " + (neg>>n2));
    }
    
    public void operatorZFRightShift(){
        int neg = ~n1+1;
        System.out.println("\nOperador >>> (+"+n1+"): " + (n1>>>n2));
        System.out.println("Operador >>> ("+neg+"): " + (neg>>>n2));
    }
}
