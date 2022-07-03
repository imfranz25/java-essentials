/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials;

import com.mycompany.java.essentials.service.LoginService;
import com.mycompany.java.essentials.db.UserDataHolder;
import com.mycompany.java.essentials.model.UserData;
import java.util.List;
/**
 *
 * @author franc
 */
public class LoginServiceImpl implements LoginService{

    @Override
    public String checkCredential(String userName, String passWord) {
        UserDataHolder userHolder = new UserDataHolder();
        List<UserData> users = userHolder.getUserList();
        String userType = "Default";

        for (UserData user: users) {
            if (user.getUserName().equals(userName) && user.getPassWord().equals(passWord)) {
                userType =  user.getUserType();
                break;
            } else {
                userType = "\n INVALID USERNAME OR PASSWORD";
            }
        }
        return userType;
    }
    
}
