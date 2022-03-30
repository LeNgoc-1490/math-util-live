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
//Viết Class để cung cấp tiện ích cho nơi khác xài
//Khi ta cung cấp tiện ích cho nơi khác xài khi đó ta ko cần nhớ cho riêng ta
//Đó là lúc hàm Static giúp ta làm điều này
public class MathUtil {
    public static long getFactorial(int n){
      if (n<0 || n>20)
          throw new IllegalArgumentException("not must be 20");
      if(n==0||n==1)
          return 1;
      long product = 1;
      for(int i=2;i<=n;i++)
          product *=i;
      return product;
      
    }   
}
