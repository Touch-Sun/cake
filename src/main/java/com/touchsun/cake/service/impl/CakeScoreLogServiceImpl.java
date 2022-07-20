package com.touchsun.cake.service.impl;

import com.touchsun.cake.entity.CakeScoreLog;
import com.touchsun.cake.dao.CakeScoreLogDao;
import com.touchsun.cake.service.CakeScoreLogService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeScoreLog)表服务实现类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
@Service("cakeScoreLogService")
public class CakeScoreLogServiceImpl implements CakeScoreLogService {
    @Resource
    private CakeScoreLogDao cakeScoreLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CakeScoreLog queryById(Integer id) {
        return this.cakeScoreLogDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param cakeScoreLog 筛选条件
     
     * @return 查询结果
     */
    @Override
    public List<CakeScoreLog> queryByPage(CakeScoreLog cakeScoreLog) {
        return this.cakeScoreLogDao.queryAllByLimit(cakeScoreLog);
    }

    /**
     * 新增数据
     *
     * @param cakeScoreLog 实例对象
     * @return 实例对象
     */
    @Override
    public CakeScoreLog insert(CakeScoreLog cakeScoreLog) {
        this.cakeScoreLogDao.insert(cakeScoreLog);
        return cakeScoreLog;
    }

    /**
     * 修改数据
     *
     * @param cakeScoreLog 实例对象
     * @return 实例对象
     */
    @Override
    public CakeScoreLog update(CakeScoreLog cakeScoreLog) {
        this.cakeScoreLogDao.update(cakeScoreLog);
        return this.queryById(cakeScoreLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cakeScoreLogDao.deleteById(id) > 0;
    }
}
