package com.hb.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hb.common.utils.PageUtils;
import com.hb.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author hb
 * @email akaisola@icloud.com
 * @date 2020-08-26 13:45:10
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

