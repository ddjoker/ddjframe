package com.ddjokjer.ddjframe.biz;

import com.ddjokjer.ddjframe.model.user.User;
import javax.validation.constraints.NotNull;

/**
 * Created by dong on 2017/3/7.
 */
public interface UserService {

    /**
     * Select by primary key user.
     *
     * @param id the id
     * @return the user
     */
    User selectByPrimaryKey(@NotNull String id);
}
