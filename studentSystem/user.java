package studentSystem;

public class user {
    private String username;
    private String pw;
    private String idNum;
    private String phone;

    public user(){}

    public user(String username, String pw, String idNum, String phone){
        this.username = username;
        this.pw = pw;
        this.idNum = idNum;
        this.phone = phone;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }

    public void setPw(String pw){
        this.pw = pw;
    }
    public String getPw(){
        return pw;
    }
    public void setIdNum(String idNum){
        this.idNum = idNum;
    }
    public String getIdNum(){
        return idNum;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }

}
