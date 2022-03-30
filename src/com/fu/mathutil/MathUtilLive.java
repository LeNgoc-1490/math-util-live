/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Admin
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result=MathUtil.getFactorial(5);
        System.out.println("5! = 120; " + result );
        System.out.println("5! = 120; " + MathUtil.getFactorial(5) );
        //Phần thêm code sau khi up lên Git-hub
        //Thời gian: 31/03/2022
        System.out.println("2! = 2; " + MathUtil.getFactorial(2) );
        System.out.println("3! = 6; " + MathUtil.getFactorial(3) );
    }
    
}
