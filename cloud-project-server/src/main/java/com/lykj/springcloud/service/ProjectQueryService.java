package com.lykj.springcloud.service;


import com.lykj.springcloud.data.result.Result;

/**
 * 项目查询服务
 * @author: kaf
 * @since: 2022/01/26
 */

public interface ProjectQueryService {

    /**
     * 获取单项目全部信息
     * @param PRO_CODE
     * @return
     */
    Result getProjectAllInformation(String PRO_CODE);



}
