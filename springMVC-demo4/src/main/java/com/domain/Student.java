package com.domain;

/**
 * 学生
 *
 * @author DELL_
 * @date 2022/03/07
 */
public class Student {

    /**
     * id
     */
    private Integer id;
    /**
     * 名字
     */
    private String name;
    /**
     * 电子邮件
     */
    private String email;

    /**
     * 学生
     */
    public Student() {
    }

    /**
     * 学生
     *
     * @param id    id
     * @param name  名字
     * @param email 电子邮件
     */
    public Student(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * 得到id
     *
     * @return {@link Integer}
     */
    public Integer getId() {
        return id;
    }

    /**
     * 组id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 得到名字
     *
     * @return {@link String}
     */
    public String getName() {
        return name;
    }

    /**
     * 集名称
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得电子邮件
     *
     * @return {@link String}
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件
     *
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 字符串
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
