package com.company;

import org.json.simple.JSONObject;

public class User {
    private int id;
    private String userName;
    private String userType;
    private double consistencyCheckProbability;
    private String password;

    public User(){}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String userName, String userPassowrd , String userType , double consistencyCheckProbability) {
        this.id = id;
        this.userName = userName;
        this.userType = userType;
        this.consistencyCheckProbability = consistencyCheckProbability;
        this.password = userPassowrd;
    }

    public double getConsistencyCheckProbability() {
        return consistencyCheckProbability;
    }

    public void setConsistencyCheckProbability(double consistencyCheckProbability) {
        this.consistencyCheckProbability = consistencyCheckProbability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userType='" + userType + '\'' +
                ", consistencyCheckProbability=" + consistencyCheckProbability +
                ", password='" + password + '\'' +
                '}';
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public JSONObject getJsonObject(){
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("user id", this.id);
        jsonObj.put("user name", this.userName);
        jsonObj.put("user type", this.userType);
        return jsonObj;
    }
}