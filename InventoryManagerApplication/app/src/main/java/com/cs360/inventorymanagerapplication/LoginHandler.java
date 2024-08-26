package com.cs360.inventorymanagerapplication;

public class LoginHandler {

    private Boolean loginTrueorFalse = false;

    private String userName = "";

    private String passWord = "";

    public LoginHandler(){

    }
    public void checkLoginCredentials(String userName, String passWord){
        //pull data from sql lite database using username
        String checkedPassword = "";
        //check password
        if (checkedPassword.equals(passWord)){
            setLoginTrueorFalse(true);
        }
    }
    public Boolean getLoginTrueorFalse() {
        return loginTrueorFalse;
    }
    public void setLoginTrueorFalse(Boolean loginTrueorFalse) {
        this.loginTrueorFalse = loginTrueorFalse;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
