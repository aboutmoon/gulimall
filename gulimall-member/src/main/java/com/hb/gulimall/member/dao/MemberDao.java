package com.hb.gulimall.member.dao;

import com.hb.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hb
 * @email akaisola@icloud.com
 * @date 2020-08-26 13:45:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
