package com.litway.entity;

/**
 * 员工
 *
 * @author DELL_
 * @date 2022/02/24
 */
public class Employee {

    /**
     * id
     */
    private Integer id;
    /**
     * 姓
     */
    private String lastName;

    /**
     * 电子邮件
     */
    private String email;
    /**
     * 性别
     *///1 male, 0 female
    private Integer gender;

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
     * 得到姓
     *
     * @return {@link String}
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置姓
     *
     * @param lastName 姓
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * 有性别
     *
     * @return {@link Integer}
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 员工
     *
     * @param id       id
     * @param lastName 姓
     * @param email    电子邮件
     * @param gender   性别
     */
    public Employee(Integer id, String lastName, String email, Integer gender) {
        super();
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    /**
     * 员工
     */
    public Employee() {
    }
}
