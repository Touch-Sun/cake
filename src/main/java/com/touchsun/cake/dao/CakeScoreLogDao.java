package com.touchsun.cake.dao;

import com.touchsun.cake.entity.CakeScoreLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (CakeScoreLog)表数据库访问层
 *
 * @author touchsun
 * @since 2022-07-18 15:46:33
 */
public interface CakeScoreLogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CakeScoreLog queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param cakeScoreLog 查询条件
     
     * @return 对象列表
     */
    List<CakeScoreLog> queryAllByLimit(CakeScoreLog cakeScoreLog);

    /**
     * 统计总行数
     *
     * @param cakeScoreLog 查询条件
     * @return 总行数
     */
    long count(CakeScoreLog cakeScoreLog);

    /**
     * 新增数据
     *
     * @param cakeScoreLog 实例对象
     * @return 影响行数
     */
    int insert(CakeScoreLog cakeScoreLog);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CakeScoreLog> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CakeScoreLog> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CakeScoreLog> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CakeScoreLog> entities);

    /**
     * 修改数据
     *
     * @param cakeScoreLog 实例对象
     * @return 影响行数
     */
    int update(CakeScoreLog cakeScoreLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

