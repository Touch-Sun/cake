package com.touchsun.cake.controller;

import com.touchsun.cake.entity.CakeScoreLog;
import com.touchsun.cake.service.CakeScoreLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CakeScoreLog)表控制层
 *
 * @author touchsun
 * @since 2022-07-18 15:46:33
 */
@RestController
@RequestMapping("cakeScoreLog")
public class CakeScoreLogController {
    /**
     * 服务对象
     */
    @Resource
    private CakeScoreLogService cakeScoreLogService;

    /**
     * 分页查询
     *
     * @param cakeScoreLog 筛选条件
     
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<CakeScoreLog>> queryByPage(CakeScoreLog cakeScoreLog) {
        return ResponseEntity.ok(this.cakeScoreLogService.queryByPage(cakeScoreLog));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CakeScoreLog> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.cakeScoreLogService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param cakeScoreLog 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CakeScoreLog> add(CakeScoreLog cakeScoreLog) {
        return ResponseEntity.ok(this.cakeScoreLogService.insert(cakeScoreLog));
    }

    /**
     * 编辑数据
     *
     * @param cakeScoreLog 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CakeScoreLog> edit(CakeScoreLog cakeScoreLog) {
        return ResponseEntity.ok(this.cakeScoreLogService.update(cakeScoreLog));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.cakeScoreLogService.deleteById(id));
    }

}

