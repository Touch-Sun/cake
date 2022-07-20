package com.touchsun.cake.dao;

import com.touchsun.cake.entity.CakeImg;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (CakeImg)表数据库访问层
 *
 * @author touchsun
 * @since 2022-07-18 15:46:19
 */
public interface CakeImgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CakeImg queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param cakeImg 查询条件
     
     * @return 对象列表
     */
    List<CakeImg> queryAllByLimit(CakeImg cakeImg);

    /**
     * 统计总行数
     *
     * @param cakeImg 查询条件
     * @return 总行数
     */
    long count(CakeImg cakeImg);

    /**
     * 新增数据
     *
     * @param cakeImg 实例对象
     * @return 影响行数
     */
    int insert(CakeImg cakeImg);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CakeImg> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CakeImg> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CakeImg> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CakeImg> entities);

    /**
     * 修改数据
     *
     * @param cakeImg 实例对象
     * @return 影响行数
     */
    int update(CakeImg cakeImg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

