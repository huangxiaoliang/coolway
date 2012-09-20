package com.coolway.dao;

import com.coolway.entity.TopicReply;
import com.coolway.entity.TopicReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicReplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int countByExample(TopicReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int deleteByExample(TopicReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int insert(TopicReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int insertSelective(TopicReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    List<TopicReply> selectByExampleWithBLOBs(TopicReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    List<TopicReply> selectByExample(TopicReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    TopicReply selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByExampleSelective(@Param("record") TopicReply record, @Param("example") TopicReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByExampleWithBLOBs(@Param("record") TopicReply record, @Param("example") TopicReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByExample(@Param("record") TopicReply record, @Param("example") TopicReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByPrimaryKeySelective(TopicReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByPrimaryKeyWithBLOBs(TopicReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_reply
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByPrimaryKey(TopicReply record);
}