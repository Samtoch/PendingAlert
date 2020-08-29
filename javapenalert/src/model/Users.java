/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author samuel
 */
public class Users {
    private String username;
    private String password;
    private String passkey;
    private String phoneNo;
    private String name;
    private String branch;
    private String userStatus;
    private String reset;
    private int loginCount;
    private String role;
    private String lastLogin;
    private String userCreated;
    private String dateCreated;    

    public Users(String username, String password, String passkey, String phoneNo, String name, String branch, String userStatus, String reset, int loginCount, String role, String lastLogin, String userCreated, String dateCreated) {
        this.username = username;
        this.password = password;
        this.passkey = passkey;
        this.phoneNo = phoneNo;
        this.name = name;
        this.branch = branch;
        this.userStatus = userStatus;
        this.reset = reset;
        this.loginCount = loginCount;
        this.role = role;
        this.lastLogin = lastLogin;
        this.userCreated = userCreated;
        this.dateCreated = dateCreated;
    }

    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasskey() {
        return passkey;
    }

    public void setPasskey(String passkey) {
        this.passkey = passkey;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getReset() {
        return reset;
    }

    public void setReset(String reset) {
        this.reset = reset;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    
}
