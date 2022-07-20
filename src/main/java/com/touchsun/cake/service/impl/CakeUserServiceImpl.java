package com.touchsun.cake.service.impl;

import com.touchsun.cake.entity.CakeUser;
import com.touchsun.cake.dao.CakeUserDao;
import com.touchsun.cake.service.CakeUserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeUser)表服务实现类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
@Service("cakeUserService")
public class CakeUserServiceImpl implements CakeUserService {
    @Resource
    private CakeUserDao cakeUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CakeUser queryById(Integer id) {
        return this.cakeUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param cakeUser 筛选条件
     
     * @return 查询结果
     */
    @Override
    public List<CakeUser> queryByPage(CakeUser cakeUser) {
        return this.cakeUserDao.queryAllByLimit(cakeUser);
    }

    /**
     * 新增数据
     *
     * @param cakeUser 实例对象
     * @return 实例对象
     */
    @Override
    public CakeUser insert(CakeUser cakeUser) {
        this.cakeUserDao.insert(cakeUser);
        return cakeUser;
    }

    /**
     * 修改数据
     *
     * @param cakeUser 实例对象
     * @return 实例对象
     */
    @Override
    public CakeUser update(CakeUser cakeUser) {
        this.cakeUserDao.update(cakeUser);
        return this.queryById(cakeUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cakeUserDao.deleteById(id) > 0;
    }
}
