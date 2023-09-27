/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ads.jogorpg.User;

/**
 *
 * @author João Marcelo
 */
public class User {
    private int ID;
    private String UserName, NickName, Email, PassWord;
    private String Sex;
    
    public User(){}

    public User(int ID, String UserName, String NickName, String Email, String PassWord, String Sex) {
        this.ID = ID;
        this.UserName = UserName;
        this.NickName = NickName;
        this.Email = Email;
        this.PassWord = PassWord;
        this.Sex = Sex;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }
    
}
