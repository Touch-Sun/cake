package com.touchsun.cake.service;

import com.touchsun.cake.entity.CakeImg;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (CakeImg)表服务接口
 *
 * @author touchsun
 * @since 2022-07-18 15:46:29
 */
public interface CakeImgService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CakeImg queryById(Integer id);

    /**
     * 分页查询
     *
     * @param cakeImg 筛选条件
     
     * @return 查询结果
     */
    List<CakeImg> queryByPage(CakeImg cakeImg);

    /**
     * 新增数据
     *
     * @param cakeImg 实例对象
     * @return 实例对象
     */
    CakeImg insert(CakeImg cakeImg);

    /**
     * 修改数据
     *
     * @param cakeImg 实例对象
     * @return 实例对象
     */
    CakeImg update(CakeImg cakeImg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
