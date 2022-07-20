package com.touchsun.cake.controller;

import com.touchsun.cake.entity.CakeProduct;
import com.touchsun.cake.service.CakeProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeProduct)表控制层
 *
 * @author touchsun
 * @since 2022-07-18 15:46:33
 */
@RestController
@RequestMapping("cakeProduct")
public class CakeProductController {
    /**
     * 服务对象
     */
    @Resource
    private CakeProductService cakeProductService;

    /**
     * 分页查询
     *
     * @param cakeProduct 筛选条件
     
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<CakeProduct>> queryByPage(CakeProduct cakeProduct) {
        return ResponseEntity.ok(this.cakeProductService.queryByPage(cakeProduct));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CakeProduct> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.cakeProductService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param cakeProduct 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CakeProduct> add(CakeProduct cakeProduct) {
        return ResponseEntity.ok(this.cakeProductService.insert(cakeProduct));
    }

    /**
     * 编辑数据
     *
     * @param cakeProduct 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CakeProduct> edit(CakeProduct cakeProduct) {
        return ResponseEntity.ok(this.cakeProductService.update(cakeProduct));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.cakeProductService.deleteById(id));
    }

}

