package com.touchsun.cake.controller;

import com.touchsun.cake.entity.CakeUser;
import com.touchsun.cake.service.CakeUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeUser)表控制层
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
@RestController
@RequestMapping("cakeUser")
public class CakeUserController {
    /**
     * 服务对象
     */
    @Resource
    private CakeUserService cakeUserService;

    /**
     * 分页查询
     *
     * @param cakeUser 筛选条件
     
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<CakeUser>> queryByPage(CakeUser cakeUser) {
        return ResponseEntity.ok(this.cakeUserService.queryByPage(cakeUser));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CakeUser> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.cakeUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param cakeUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CakeUser> add(CakeUser cakeUser) {
        return ResponseEntity.ok(this.cakeUserService.insert(cakeUser));
    }

    /**
     * 编辑数据
     *
     * @param cakeUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CakeUser> edit(CakeUser cakeUser) {
        return ResponseEntity.ok(this.cakeUserService.update(cakeUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.cakeUserService.deleteById(id));
    }

}

