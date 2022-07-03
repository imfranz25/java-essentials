/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.model;

/**
 *
 * @author franc
 */
public class UserData {
    
    private int id;
    private String userName;
    private String passWord;
    private String userType;
    
    public UserData(int id, String userName, String passWord, String userType) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getUserType() {
        return userType;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
}
