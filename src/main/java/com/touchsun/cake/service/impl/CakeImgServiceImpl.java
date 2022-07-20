package com.touchsun.cake.service.impl;

import com.touchsun.cake.entity.CakeImg;
import com.touchsun.cake.dao.CakeImgDao;
import com.touchsun.cake.service.CakeImgService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeImg)表服务实现类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:31
 */
@Service("cakeImgService")
public class CakeImgServiceImpl implements CakeImgService {
    @Resource
    private CakeImgDao cakeImgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CakeImg queryById(Integer id) {
        return this.cakeImgDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param cakeImg 筛选条件
     
     * @return 查询结果
     */
    @Override
    public List<CakeImg> queryByPage(CakeImg cakeImg) {
        return this.cakeImgDao.queryAllByLimit(cakeImg);
    }

    /**
     * 新增数据
     *
     * @param cakeImg 实例对象
     * @return 实例对象
     */
    @Override
    public CakeImg insert(CakeImg cakeImg) {
        this.cakeImgDao.insert(cakeImg);
        return cakeImg;
    }

    /**
     * 修改数据
     *
     * @param cakeImg 实例对象
     * @return 实例对象
     */
    @Override
    public CakeImg update(CakeImg cakeImg) {
        this.cakeImgDao.update(cakeImg);
        return this.queryById(cakeImg.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cakeImgDao.deleteById(id) > 0;
    }
}
