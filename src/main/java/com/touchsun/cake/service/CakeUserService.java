package com.touchsun.cake.service;

import com.touchsun.cake.entity.CakeUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (CakeUser)表服务接口
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
public interface CakeUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CakeUser queryById(Integer id);

    /**
     * 分页查询
     *
     * @param cakeUser 筛选条件
     
     * @return 查询结果
     */
    List<CakeUser> queryByPage(CakeUser cakeUser);

    /**
     * 新增数据
     *
     * @param cakeUser 实例对象
     * @return 实例对象
     */
    CakeUser insert(CakeUser cakeUser);

    /**
     * 修改数据
     *
     * @param cakeUser 实例对象
     * @return 实例对象
     */
    CakeUser update(CakeUser cakeUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
