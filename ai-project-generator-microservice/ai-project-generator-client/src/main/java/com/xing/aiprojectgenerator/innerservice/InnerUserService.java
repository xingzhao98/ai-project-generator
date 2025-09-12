package com.xing.aiprojectgenerator.innerservice;

import com.xing.aiprojectgenerator.exception.BusinessException;
import com.xing.aiprojectgenerator.exception.ErrorCode;
import com.xing.aiprojectgenerator.model.entity.User;
import com.xing.aiprojectgenerator.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import static com.xing.aiprojectgenerator.constant.UserConstant.USER_LOGIN_STATE;

public interface InnerUserService {

    List<User> listByIds(Collection<? extends Serializable> ids);

    User getById(Serializable id);

    UserVO getUserVO(User user);

    // 静态方法，避免跨服务调用
    static User getLoginUser(HttpServletRequest request) {
        Object userObj = request.getSession().getAttribute(USER_LOGIN_STATE);
        User currentUser = (User) userObj;
        if (currentUser == null || currentUser.getId() == null) {
            throw new BusinessException(ErrorCode.NOT_LOGIN_ERROR);
        }
        return currentUser;
    }
}

