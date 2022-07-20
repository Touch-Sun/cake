package com.touchsun.cake.service.impl;

import com.touchsun.cake.entity.CakeTask;
import com.touchsun.cake.dao.CakeTaskDao;
import com.touchsun.cake.service.CakeTaskService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeTask)表服务实现类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
@Service("cakeTaskService")
public class CakeTaskServiceImpl implements CakeTaskService {
    @Resource
    private CakeTaskDao cakeTaskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CakeTask queryById(Integer id) {
        return this.cakeTaskDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param cakeTask 筛选条件
     
     * @return 查询结果
     */
    @Override
    public List<CakeTask> queryByPage(CakeTask cakeTask) {
        return this.cakeTaskDao.queryAllByLimit(cakeTask);
    }

    /**
     * 新增数据
     *
     * @param cakeTask 实例对象
     * @return 实例对象
     */
    @Override
    public CakeTask insert(CakeTask cakeTask) {
        this.cakeTaskDao.insert(cakeTask);
        return cakeTask;
    }

    /**
     * 修改数据
     *
     * @param cakeTask 实例对象
     * @return 实例对象
     */
    @Override
    public CakeTask update(CakeTask cakeTask) {
        this.cakeTaskDao.update(cakeTask);
        return this.queryById(cakeTask.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cakeTaskDao.deleteById(id) > 0;
    }
}
