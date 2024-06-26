package com.acorn.racket.login.domain;

public class UserLoginDTO {
    private String userId;
    private String userNickname;
    private String password;
    private String userName;
    private String birthDay; // 필드명 변경
    private String userEmail;
    private String sex;
    private String exercise;
    private int userLevel;
    private String userImageUrl;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthDay() { // 메소드명 변경
        return birthDay;
    }

    public void setBirthDay(String birthDay) { // 메소드명 변경
        this.birthDay = birthDay;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    @Override
    public String toString() {
        return "UserLoginDTO [userId=" + userId + ", userNickname=" + userNickname + ", password=" + password
                + ", userName=" + userName + ", birthDay=" + birthDay + ", userEmail=" + userEmail + ", sex=" + sex
                + ", exercise=" + exercise + ", userLevel=" + userLevel + ", userImageUrl=" + userImageUrl + "]";
    }

    public UserLoginDTO(String userId, String userNickname, String password, String userName, String birthDay, // 생성자 인자 변경
                        String userEmail, String sex, String exercise, int userLevel, String userImageUrl) {
        super();
        this.userId = userId;
        this.userNickname = userNickname;
        this.password = password;
        this.userName = userName;
        this.birthDay = birthDay; // 생성자 필드 변경
        this.userEmail = userEmail;
        this.sex = sex;
        this.exercise = exercise;
        this.userLevel = userLevel;
        this.userImageUrl = userImageUrl;
    }
    
    public UserLoginDTO() {
        // 기본 생성자의 본문은 비워두거나 필요한 초기화를 수행할 수 있습니다.
    }
}