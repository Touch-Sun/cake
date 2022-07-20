package com.touchsun.cake.service;

import com.touchsun.cake.entity.CakeProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (CakeProduct)表服务接口
 *
 * @author touchsun
 * @since 2022-07-18 15:46:33
 */
public interface CakeProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CakeProduct queryById(Integer id);

    /**
     * 分页查询
     *
     * @param cakeProduct 筛选条件
     
     * @return 查询结果
     */
    List<CakeProduct> queryByPage(CakeProduct cakeProduct);

    /**
     * 新增数据
     *
     * @param cakeProduct 实例对象
     * @return 实例对象
     */
    CakeProduct insert(CakeProduct cakeProduct);

    /**
     * 修改数据
     *
     * @param cakeProduct 实例对象
     * @return 实例对象
     */
    CakeProduct update(CakeProduct cakeProduct);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
