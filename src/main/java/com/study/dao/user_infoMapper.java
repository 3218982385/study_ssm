package com.study.dao;

import com.study.bean.user_info;
import com.study.bean.user_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface user_infoMapper {
    long countByExample(user_infoExample example);

    int deleteByExample(user_infoExample example);

    int deleteByPrimaryKey(String id);

    int insert(user_info record);

    int insertSelective(user_info record);

    List<user_info> selectByExample(user_infoExample example);

    user_info selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") user_info record, @Param("example") user_infoExample example);

    int updateByExample(@Param("record") user_info record, @Param("example") user_infoExample example);

    int updateByPrimaryKeySelective(user_info record);

    int updateByPrimaryKey(user_info record);
}