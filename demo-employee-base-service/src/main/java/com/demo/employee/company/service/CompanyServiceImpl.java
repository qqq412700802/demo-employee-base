package com.demo.employee.company.service;

import com.demo.employee.company.entity.CompanyEntity;
import com.demo.employee.company.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

/**
 * <p>
 * 公司信息 公司信息 服务实现类
 * </p>
 *
 * @author lixj
 * @since 2021-05-13
 */
@Service
@RequestMapping("/demo-employee-base/company")
public class CompanyServiceImpl implements CompanyService<CompanyEntity> {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public int save(CompanyEntity entity) {
        companyMapper.insert(entity);
        return entity.getId();
    }

    @Override
    public int removeById(Serializable id) {
        return companyMapper.deleteById(id);
    }

    @Override
    public int updateById(CompanyEntity entity) {
        return companyMapper.updateById(entity);
    }

    @Override
    @GetMapping("getById")
    public CompanyEntity getById(@RequestParam Integer id) {
        System.out.println(id);
        id = 1;
        System.out.println(companyMapper.selectList(null));
        return companyMapper.selectById(id);
    }
}
