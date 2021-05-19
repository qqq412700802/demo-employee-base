package com.demo.employee.company.service;

import com.demo.employee.company.entity.CompanyEntity;
import com.demo.employee.company.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 公司信息 公司信息 服务实现类
 * </p>
 *
 * @author lixj
 * @since 2021-05-13
 */
@Service
@RestController
@RequestMapping("/demo-employee-base/company")
public class CompanyServiceImpl implements CompanyService<CompanyEntity> {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    @PostMapping("save")
    public int save(CompanyEntity entity) {
        System.out.println(entity);
        companyMapper.insert(entity);
        return entity.getId();
    }

    @Override
    @PostMapping("removeById")
    public int removeById(@RequestBody Serializable id) {
        return companyMapper.deleteById(id);
    }

    @Override
    @PostMapping("updateById")
    public int updateById(@RequestBody  CompanyEntity entity) {
        return companyMapper.updateById(entity);
    }

    @Override
    @GetMapping("getById")
    public CompanyEntity getById(@RequestParam Integer id) {
        return companyMapper.selectById(id);
    }

    @Override
    @GetMapping("getList")
    public List<CompanyEntity> getList() {
        return companyMapper.selectList(null);
    }
}
