package com.example.droolsdemo.pojo;

/**
 * user实体类
 */
public class User {
    private String name;//姓名
    private Integer age;//年龄
    private String sex; //性别

    /**
     * 构造方法
     * @param name
     * @param age
     * @param sex
     */
    public User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public User() {
    }

    /**
     * setter and getter
     * @return
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
     public void setAge(Integer age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * toString方法
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
