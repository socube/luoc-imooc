package com.imooc.reflect.ch05;

/**
 * @author luoc
 * @version V0.0.1
 * @package com.imooc.reflect.ch05
 * @description: 标准的JavaBean类有私有属性都对应有get/set方法，有无参数的构造方法
 * @date 2017/11/11 16:04
 */
public class User {
    private String username;
    private String userpass;
    private int age;

    public User() {
    }

    public User(String username, String userpass, int age) {
        this.username = username;
        this.userpass = userpass;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
