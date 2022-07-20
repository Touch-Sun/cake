package com.touchsun.cake.service;

import com.touchsun.cake.entity.CakeTask;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (CakeTask)表服务接口
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
public interface CakeTaskService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CakeTask queryById(Integer id);

    /**
     * 分页查询
     *
     * @param cakeTask 筛选条件
     
     * @return 查询结果
     */
    List<CakeTask> queryByPage(CakeTask cakeTask);

    /**
     * 新增数据
     *
     * @param cakeTask 实例对象
     * @return 实例对象
     */
    CakeTask insert(CakeTask cakeTask);

    /**
     * 修改数据
     *
     * @param cakeTask 实例对象
     * @return 实例对象
     */
    CakeTask update(CakeTask cakeTask);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
