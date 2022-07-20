package com.touchsun.cake.service.impl;

import com.touchsun.cake.entity.CakeProduct;
import com.touchsun.cake.dao.CakeProductDao;
import com.touchsun.cake.service.CakeProductService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeProduct)表服务实现类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:33
 */
@Service("cakeProductService")
public class CakeProductServiceImpl implements CakeProductService {
    @Resource
    private CakeProductDao cakeProductDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CakeProduct queryById(Integer id) {
        return this.cakeProductDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param cakeProduct 筛选条件
     
     * @return 查询结果
     */
    @Override
    public List<CakeProduct> queryByPage(CakeProduct cakeProduct) {
        return this.cakeProductDao.queryAllByLimit(cakeProduct);
    }

    /**
     * 新增数据
     *
     * @param cakeProduct 实例对象
     * @return 实例对象
     */
    @Override
    public CakeProduct insert(CakeProduct cakeProduct) {
        this.cakeProductDao.insert(cakeProduct);
        return cakeProduct;
    }

    /**
     * 修改数据
     *
     * @param cakeProduct 实例对象
     * @return 实例对象
     */
    @Override
    public CakeProduct update(CakeProduct cakeProduct) {
        this.cakeProductDao.update(cakeProduct);
        return this.queryById(cakeProduct.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cakeProductDao.deleteById(id) > 0;
    }
}
