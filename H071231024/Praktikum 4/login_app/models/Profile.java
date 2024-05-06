package TugasPraktikum4.login_app.models;

public class Profile {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String fullName;
    private int age;
    private String hobby;
    private String nickname;

    public Profile() {
    }

    public Profile(String fullName, int age, String hobby) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNickName() {
        return nickname;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    

}