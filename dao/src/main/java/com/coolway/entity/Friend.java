package com.coolway.entity;

import java.util.Date;

public class Friend {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend.id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend.user_id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend.friend_id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private String friendId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend.status
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend.create_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column friend.modify_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend.id
     *
     * @return the value of friend.id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend.id
     *
     * @param id the value for friend.id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend.user_id
     *
     * @return the value of friend.user_id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend.user_id
     *
     * @param userId the value for friend.user_id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend.friend_id
     *
     * @return the value of friend.friend_id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public String getFriendId() {
        return friendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend.friend_id
     *
     * @param friendId the value for friend.friend_id
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend.status
     *
     * @return the value of friend.status
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend.status
     *
     * @param status the value for friend.status
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend.create_time
     *
     * @return the value of friend.create_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend.create_time
     *
     * @param createTime the value for friend.create_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column friend.modify_time
     *
     * @return the value of friend.modify_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column friend.modify_time
     *
     * @param modifyTime the value for friend.modify_time
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}