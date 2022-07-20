package com.touchsun.cake.controller;

import com.touchsun.cake.entity.CakeImg;
import com.touchsun.cake.service.CakeImgService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeImg)表控制层
 *
 * @author touchsun
 * @since 2022-07-18 15:46:17
 */
@RestController
@RequestMapping("cakeImg")
public class CakeImgController {
    /**
     * 服务对象
     */
    @Resource
    private CakeImgService cakeImgService;

    /**
     * 分页查询
     *
     * @param cakeImg 筛选条件
     
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<CakeImg>> queryByPage(CakeImg cakeImg) {
        return ResponseEntity.ok(this.cakeImgService.queryByPage(cakeImg));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CakeImg> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.cakeImgService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param cakeImg 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CakeImg> add(CakeImg cakeImg) {
        return ResponseEntity.ok(this.cakeImgService.insert(cakeImg));
    }

    /**
     * 编辑数据
     *
     * @param cakeImg 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CakeImg> edit(CakeImg cakeImg) {
        return ResponseEntity.ok(this.cakeImgService.update(cakeImg));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.cakeImgService.deleteById(id));
    }

}

