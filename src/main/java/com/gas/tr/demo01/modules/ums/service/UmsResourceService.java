package com.gas.tr.demo01.modules.ums.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gas.tr.demo01.modules.ums.model.UmsResource;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台资源表 服务类
 * </p>
 *
 * @author gas
 * @since 2023-08-23
 */
public interface UmsResourceService extends IService<UmsResource> {

    /**
     * 添加资源
     */
    boolean create(UmsResource umsResource);

    /**
     * 修改资源
     */
    boolean update(Long id, UmsResource umsResource);

    /**
     * 删除资源
     */
    boolean delete(Long id);

    /**
     * 分页查询资源
     */
    Page<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);

}
