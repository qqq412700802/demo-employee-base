package com.demo.employee.company.service;

import com.demo.employee.company.entity.CompanyEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 公司信息 公司信息 服务类
 * </p>
 *
 * @author lixj
 * @since 2021-05-13
 */
@RequestMapping("/company")
@FeignClient("demo-employee-base-service")
public interface CompanyService {
    @PostMapping("save")
    int save(CompanyEntity entity);

    @PostMapping("removeById")
    int removeById(@RequestBody Serializable id);

    @PostMapping("updateById")
    int updateById(CompanyEntity entity);

    @GetMapping("getById")
    CompanyEntity getById(Integer id);

    @GetMapping("getList")
    List<CompanyEntity> getList();
}
