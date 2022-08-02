/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tutoriales;

import bitwise.Bitwise;

/**
 *
 * @author wilme
 */
public class Tutoriales {
    //Tema Bitwise
    static void bitwise(){
        /*==================================================
        **================ BLOQUE - BITWISE ================
        */
        //NOTA: byte = 8bits, short = 16bits, int = 32bits, long = 64bits.
        
        byte n1 = 10, n2 = 3;
        Bitwise opAnd = new Bitwise(n1, n2);

        System.out.println("RESULTADOS BITWISE");
        opAnd.operatorAND();
        /* 0000 1010 = 10
        ** 0000 0011 = 3
        ** 0000 0010 = 2 *
        */
        opAnd.operatorOR();
        /* 0000 1010 = 10
        ** 0000 0011 = 3
        ** 0000 1011 = 11 *
        */
        opAnd.operatorXOR();
        /* 0000 1010 = 10
        ** 0000 0011 = 3
        ** 0000 1001 = 9 *
        */
        opAnd.operatorU();
        /* 0000 1010 = 10
        ** 1111 0101 = -11 //Aplicamos el complenmento de a 1 = invertir todos los bits *
        ** 0000 1011 = 11 //Aplicar el complente de a 2 = los bits de la derecha del primer (1) se mantienen igual y lo bits de la izquierda se invierten
        ** 0 = (+), 1 = (-) //El bit más significativo representa el signo. (El bit más a la izquierda)
        **
        ** (~10 + 1)
        ** 0000 1010 = 10
        **  1111 0101 = -11 //Complemento a 1
        ** +0000 0001 = 1 //Se suma 1
        **  _______________
        **  1111 0110 = -10 *
        */
        opAnd.operatorNOT();
        /* 0000 1010 = 10
        ** 1111 0101 = -11 //Complemento a 1 de 10
        ** 0000 0011 = 3 //Hacer un AND con -11 y 3
        ** 0000 0001 = (1)
        **
        ** 0000 0011 = 3
        ** 1111 1100 = -4 //Complemento a 1 de 3
        ** 0000 1010 = 10 //Hacer un AND con -4 y 10
        ** 0000 1000 = (8)
        **
        ** 0000 0001 = (1)
        ** 0000 1000 = (8)
        ** 0000 1001 = 9 * //OR de 1 y 8
        */
        opAnd.operatorLeftShift();
        /* 0000 1010 = 10
        ** << = mover n2=3 posiciones a la izquierda
        ** 0101 0000 = 80 *
        ** n1*2^n2 = 10 * 2^3 = 10 * 8 = 80
        **
        ** EN NEGATIVO
        ** 1111 0110 = -10 //Complemento de a 2 del numero 10
        ** 1011 0000 = -80 *
        ** 0101 0000 = 80
        */
        opAnd.operatorRightShift();
        /* 0000 1010 = 10
        ** >> = mover n2=3 posiciones a la derecha
        ** 0000 0001 = 1 *
        ** n1/2^n2 = 10 * 2^3 = 10 / 8 = 1.25 => 1
        **
        ** EN NEGATIVO
        ** 1111 0110 = -10
        ** 1111 1110 = -2 *
        ** 0000 0010 = 2
        */
        opAnd.operatorZFRightShift();
        /* 0000 1010 = 10
        ** >>> = mover n2=3 posiciones a la derecha
        ** 0000 0001 = 1 * 
        **
        ** EN NEGATIVO
        ** (byte) a (int) = 8 BITS SE CONVIERTE A 32 BITS
        ** 1111 0110 = -10 (en 8 bits)
        ** 1111 1111 1111 1111 1111 1111 1111 0110 = -10 (en 32 bits)
        ** SE AGREGAN 3 CEROS A LA IZQUIERDA Y SE ELIMINAN LOS ULITMOS 3 BITS DE LA DERECHA
        ** 0001 1111 1111 1111 1111 1111 1111 1110 = 536870910 *
        */
    }

    public static void main(String[] args) {
        bitwise();
    }
}
