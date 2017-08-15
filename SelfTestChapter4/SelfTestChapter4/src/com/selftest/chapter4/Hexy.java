/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selftest.chapter4;

/**
 *
 * @author harsh
 */
public class Hexy {
    public static void main(String[] args) {
        int i = 42;
        String s = (i<40) ? "life" : (i>50) ? "universe" : "everything";
        System.out.println(s);
    }
}
