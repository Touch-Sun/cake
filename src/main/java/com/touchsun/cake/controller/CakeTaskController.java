package com.touchsun.cake.controller;

import com.touchsun.cake.entity.CakeTask;
import com.touchsun.cake.service.CakeTaskService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeTask)表控制层
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
@RestController
@RequestMapping("cakeTask")
public class CakeTaskController {
    /**
     * 服务对象
     */
    @Resource
    private CakeTaskService cakeTaskService;

    /**
     * 分页查询
     *
     * @param cakeTask 筛选条件
     
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<CakeTask>> queryByPage(CakeTask cakeTask) {
        return ResponseEntity.ok(this.cakeTaskService.queryByPage(cakeTask));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CakeTask> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.cakeTaskService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param cakeTask 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CakeTask> add(CakeTask cakeTask) {
        return ResponseEntity.ok(this.cakeTaskService.insert(cakeTask));
    }

    /**
     * 编辑数据
     *
     * @param cakeTask 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CakeTask> edit(CakeTask cakeTask) {
        return ResponseEntity.ok(this.cakeTaskService.update(cakeTask));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.cakeTaskService.deleteById(id));
    }

}

