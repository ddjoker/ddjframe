package com.ddjokjer.ddjframe.biz;

import com.ddjokjer.ddjframe.model.User;
import javax.validation.constraints.NotNull;

/**
 * Created by dong on 2017/3/7.
 */

public interface UserService {
    User selectByPrimaryKey(@NotNull Long id);
}
