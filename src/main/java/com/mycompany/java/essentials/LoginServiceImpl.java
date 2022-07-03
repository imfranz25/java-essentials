/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials;

import com.mycompany.java.essentials.service.LoginService;

/**
 *
 * @author franc
 */
public class LoginServiceImpl implements LoginService{

    @Override
    public String checkCredential(String userName, String passWord) {
        System.out.print(userName);
        return userName;
    }
    
}
