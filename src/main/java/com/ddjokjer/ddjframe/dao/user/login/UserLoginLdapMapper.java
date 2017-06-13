package com.ddjokjer.ddjframe.dao.user.login;

import com.ddjokjer.ddjframe.model.user.login.UserLoginLdap;
import com.ddjokjer.ddjframe.model.user.login.UserLoginLdapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginLdapMapper {
    long countByExample(UserLoginLdapExample example);

    int deleteByExample(UserLoginLdapExample example);

    int deleteByPrimaryKey(String usrGuid);

    int insert(UserLoginLdap record);

    int insertSelective(UserLoginLdap record);

    List<UserLoginLdap> selectByExample(UserLoginLdapExample example);

    UserLoginLdap selectByPrimaryKey(String usrGuid);

    int updateByExampleSelective(@Param("record") UserLoginLdap record, @Param("example") UserLoginLdapExample example);

    int updateByExample(@Param("record") UserLoginLdap record, @Param("example") UserLoginLdapExample example);

    int updateByPrimaryKeySelective(UserLoginLdap record);

    int updateByPrimaryKey(UserLoginLdap record);
}