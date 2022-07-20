package com.touchsun.cake.service;

import com.touchsun.cake.entity.CakeScoreLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (CakeScoreLog)表服务接口
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
public interface CakeScoreLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CakeScoreLog queryById(Integer id);

    /**
     * 分页查询
     *
     * @param cakeScoreLog 筛选条件
     
     * @return 查询结果
     */
    List<CakeScoreLog> queryByPage(CakeScoreLog cakeScoreLog);

    /**
     * 新增数据
     *
     * @param cakeScoreLog 实例对象
     * @return 实例对象
     */
    CakeScoreLog insert(CakeScoreLog cakeScoreLog);

    /**
     * 修改数据
     *
     * @param cakeScoreLog 实例对象
     * @return 实例对象
     */
    CakeScoreLog update(CakeScoreLog cakeScoreLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
