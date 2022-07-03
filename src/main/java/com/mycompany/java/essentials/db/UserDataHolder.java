/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.db;

import com.mycompany.java.essentials.model.UserData;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author franc
 */
public class UserDataHolder {
    private static List<UserData> userList = new ArrayList<>();

    public List<UserData> getUserList() {
        return this.userList;
    }

    public void setUserList(UserData user) {
        this.userList.add(user);
    }
    
}
