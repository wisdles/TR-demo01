package com.gas.tr.demo01.modules.ums.mapper;

import com.gas.tr.demo01.modules.ums.model.UmsAdminLoginLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台用户登录日志表 Mapper 接口
 * </p>
 *
 * @author gas
 * @since 2023-08-23
 */
@Mapper
public interface UmsAdminLoginLogMapper extends BaseMapper<UmsAdminLoginLog> {

}
