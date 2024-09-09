/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.appmvn01.lib;

import com.ulabs.appmvn01.application.Login2;

/**
 *
 * @author manuelguarniz
 */
public class Startup {
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login2 login = new Login2();
                login.setVisible(true);
                login.setLocationRelativeTo(null);
            }
        });
    }
}
