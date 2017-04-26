package com.ddjokjer.ddjframe.dao.user.login;

import com.ddjokjer.ddjframe.model.user.login.UserLoginDefault;
import com.ddjokjer.ddjframe.model.user.login.UserLoginDefaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginDefaultMapper {
    long countByExample(UserLoginDefaultExample example);

    int deleteByExample(UserLoginDefaultExample example);

    int deleteByPrimaryKey(String usrGuid);

    int insert(UserLoginDefault record);

    int insertSelective(UserLoginDefault record);

    List<UserLoginDefault> selectByExample(UserLoginDefaultExample example);

    UserLoginDefault selectByPrimaryKey(String usrGuid);

    int updateByExampleSelective(@Param("record") UserLoginDefault record, @Param("example") UserLoginDefaultExample example);

    int updateByExample(@Param("record") UserLoginDefault record, @Param("example") UserLoginDefaultExample example);

    int updateByPrimaryKeySelective(UserLoginDefault record);

    int updateByPrimaryKey(UserLoginDefault record);
}