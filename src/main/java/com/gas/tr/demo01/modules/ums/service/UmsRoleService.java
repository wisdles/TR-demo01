package com.gas.tr.demo01.modules.ums.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gas.tr.demo01.modules.ums.model.UmsMenu;
import com.gas.tr.demo01.modules.ums.model.UmsResource;
import com.gas.tr.demo01.modules.ums.model.UmsRole;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 服务类
 * </p>
 *
 * @author gas
 * @since 2023-08-23
 */
public interface UmsRoleService extends IService<UmsRole> {

    /**
     * 添加角色
     */
    boolean create(UmsRole role);

    /**
     * 批量删除角色
     */
    boolean delete(List<Long> ids);

    /**
     * 分页获取角色列表
     */
    Page<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 根据管理员ID获取对应菜单
     */
    List<UmsMenu> getMenuList(Long adminId);

    /**
     * 获取角色相关菜单
     */
    List<UmsMenu> listMenu(Long roleId);

    /**
     * 获取角色相关资源
     */
    List<UmsResource> listResource(Long roleId);

    /**
     * 给角色分配菜单
     */
    @Transactional
    int allocMenu(Long roleId, List<Long> menuIds);

    /**
     * 给角色分配资源
     */
    @Transactional
    int allocResource(Long roleId, List<Long> resourceIds);
}
