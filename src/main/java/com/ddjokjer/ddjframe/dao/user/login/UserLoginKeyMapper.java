package com.ddjokjer.ddjframe.dao.user.login;

import com.ddjokjer.ddjframe.model.user.login.UserLoginKey;
import com.ddjokjer.ddjframe.model.user.login.UserLoginKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginKeyMapper {
    long countByExample(UserLoginKeyExample example);

    int deleteByExample(UserLoginKeyExample example);

    int deleteByPrimaryKey(String usrGuid);

    int insert(UserLoginKey record);

    int insertSelective(UserLoginKey record);

    List<UserLoginKey> selectByExample(UserLoginKeyExample example);

    UserLoginKey selectByPrimaryKey(String usrGuid);

    int updateByExampleSelective(@Param("record") UserLoginKey record, @Param("example") UserLoginKeyExample example);

    int updateByExample(@Param("record") UserLoginKey record, @Param("example") UserLoginKeyExample example);

    int updateByPrimaryKeySelective(UserLoginKey record);

    int updateByPrimaryKey(UserLoginKey record);
}