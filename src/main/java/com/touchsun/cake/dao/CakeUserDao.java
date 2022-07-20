package com.touchsun.cake.dao;

import com.touchsun.cake.entity.CakeUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (CakeUser)表数据库访问层
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
@Mapper
public interface CakeUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CakeUser queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param cakeUser 查询条件
     
     * @return 对象列表
     */
    List<CakeUser> queryAllByLimit(CakeUser cakeUser);

    /**
     * 统计总行数
     *
     * @param cakeUser 查询条件
     * @return 总行数
     */
    long count(CakeUser cakeUser);

    /**
     * 新增数据
     *
     * @param cakeUser 实例对象
     * @return 影响行数
     */
    int insert(CakeUser cakeUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CakeUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CakeUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CakeUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CakeUser> entities);

    /**
     * 修改数据
     *
     * @param cakeUser 实例对象
     * @return 影响行数
     */
    int update(CakeUser cakeUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

