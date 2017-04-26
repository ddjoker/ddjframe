package com.ddjokjer.ddjframe.dao.user;

import com.ddjokjer.ddjframe.model.user.UserSettings;
import com.ddjokjer.ddjframe.model.user.UserSettingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSettingsMapper {
    long countByExample(UserSettingsExample example);

    int deleteByExample(UserSettingsExample example);

    int deleteByPrimaryKey(String usrGuid);

    int insert(UserSettings record);

    int insertSelective(UserSettings record);

    List<UserSettings> selectByExample(UserSettingsExample example);

    UserSettings selectByPrimaryKey(String usrGuid);

    int updateByExampleSelective(@Param("record") UserSettings record, @Param("example") UserSettingsExample example);

    int updateByExample(@Param("record") UserSettings record, @Param("example") UserSettingsExample example);

    int updateByPrimaryKeySelective(UserSettings record);

    int updateByPrimaryKey(UserSettings record);
}