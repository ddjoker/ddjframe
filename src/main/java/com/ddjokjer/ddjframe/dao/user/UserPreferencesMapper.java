package com.ddjokjer.ddjframe.dao.user;

import com.ddjokjer.ddjframe.model.user.UserPreferences;
import com.ddjokjer.ddjframe.model.user.UserPreferencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPreferencesMapper {
    long countByExample(UserPreferencesExample example);

    int deleteByExample(UserPreferencesExample example);

    int deleteByPrimaryKey(String usrGuid);

    int insert(UserPreferences record);

    int insertSelective(UserPreferences record);

    List<UserPreferences> selectByExample(UserPreferencesExample example);

    UserPreferences selectByPrimaryKey(String usrGuid);

    int updateByExampleSelective(@Param("record") UserPreferences record, @Param("example") UserPreferencesExample example);

    int updateByExample(@Param("record") UserPreferences record, @Param("example") UserPreferencesExample example);

    int updateByPrimaryKeySelective(UserPreferences record);

    int updateByPrimaryKey(UserPreferences record);
}