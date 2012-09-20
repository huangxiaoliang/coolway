package com.coolway.dao;

import com.coolway.entity.TopicTag;
import com.coolway.entity.TopicTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int countByExample(TopicTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int deleteByExample(TopicTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int insert(TopicTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int insertSelective(TopicTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    List<TopicTag> selectByExample(TopicTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    TopicTag selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByExampleSelective(@Param("record") TopicTag record, @Param("example") TopicTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByExample(@Param("record") TopicTag record, @Param("example") TopicTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByPrimaryKeySelective(TopicTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_tag
     *
     * @mbggenerated Thu Sep 20 10:27:02 CST 2012
     */
    int updateByPrimaryKey(TopicTag record);
}