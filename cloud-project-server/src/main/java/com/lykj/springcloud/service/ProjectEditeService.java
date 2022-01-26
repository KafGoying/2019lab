package com.lykj.springcloud.service;


import com.lykj.springcloud.data.result.Result;

/**
 * 项目查询服务
 * @author: kaf
 * @since: 2022/01/26
 */

public interface ProjectEditeService {

    /**
     * 创建新项目
     * @param PRO_CODE
     * @return
     */
    Result createNewProject(String PRO_CODE);

    /**
     * 修改项目信息：研发端项目经理
     * @param newPM
     * @return
     */
    Result updateRDPM(String newPM);
    /**
     * 修改项目信息：采购端项目经理purchase
     * @param newPM
     * @return
     */
    Result updatePUPM(String newPM);
    /**
     * 修改项目信息：业务端项目经理
     * @param newPM
     * @return
     */
    Result updateBUPM(String newPM);
    /**
     * 修改项目信息：市场端项目经理
     * @param newPM
     * @return
     */
    Result updateMKPM(String newPM);
    /**
     * 修改项目信息：项目状态
     * @param state
     * @return
     */
    Result updateState(String state);
    /**
     * 修改项目信息：项目阶段
     * @param stage
     * @return
     */
    Result updateStage(String stage);
    /**
     * 修改项目信息：项目环节
     * @param link
     * @return
     */
    Result updateLink(String link);
    /**
     * 修改项目信息：结构负责人
     * @param str
     * @return
     */
    Result updateStrOwner(String str);
    /**
     * 修改项目信息：
     * @param
     * @return
     */
    Result update(String );
    /**
     * 修改项目信息：
     * @param
     * @return
     */
    Result update(String );
    /**
     * 修改项目信息：
     * @param
     * @return
     */
    Result update(String );
    /**
     * 修改项目信息：
     * @param
     * @return
     */
    Result update(String );
    /**
     * 修改项目信息：
     * @param
     * @return
     */
    Result update(String );
    /**
     * 修改项目信息：
     * @param
     * @return
     */
    Result update(String );


}
