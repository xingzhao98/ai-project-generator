package com.xing.aiprojectgenerator.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xing.aiprojectgenerator.model.dto.app.AppAddRequest;
import com.xing.aiprojectgenerator.model.dto.app.AppQueryRequest;
import com.xing.aiprojectgenerator.model.entity.App;
import com.xing.aiprojectgenerator.model.entity.User;
import com.xing.aiprojectgenerator.model.vo.AppVO;
import reactor.core.publisher.Flux;

import java.io.Serializable;
import java.util.List;

/**
 * 应用 服务层。
 *
 * @author xing
 */
public interface AppService extends IService<App> {

    AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    String deployApp(Long appId, User loginUser);

    void generateAppScreenshotAsync(Long appId, String appUrl);

    Long createApp(AppAddRequest appAddRequest, User loginUser);
}
