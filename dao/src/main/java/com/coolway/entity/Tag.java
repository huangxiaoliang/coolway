package com.coolway.entity;

import java.util.Date;

public class Tag {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.name
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.create_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.modify_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.id
     *
     * @return the value of tag.id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.id
     *
     * @param id the value for tag.id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.name
     *
     * @return the value of tag.name
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.name
     *
     * @param name the value for tag.name
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.create_time
     *
     * @return the value of tag.create_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.create_time
     *
     * @param createTime the value for tag.create_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.modify_time
     *
     * @return the value of tag.modify_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.modify_time
     *
     * @param modifyTime the value for tag.modify_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}