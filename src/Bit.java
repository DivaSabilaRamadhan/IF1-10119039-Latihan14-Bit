/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA  : Diva Sabila Ramadhan
 * KELAS : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program Bit 
 */
public class Bit {

    
    public static void main(String[] args) {
        int a = 60;/* 60 = 001 1100 */
        int b = 13;/* 13 = 000 1101 */
        int c = 0;
        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);
        c = a | b;
        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);
        c = a ^ b;
        /* 49 = 0011 0001 */
        System.out.println("a = " + c);
        c = ~a;
        /* -61 = 1100 0011 */
        System.out.println("~a = " + c);
        c = a << 2;
        /* 240 = 1111 0000 */
        System.out.println("a << 2 - " + c);
        c = a >> 2;
        /* 15 = 0000 1111 */
        System.out.println("a >> 2 = " + c);
        
    }
    
}
