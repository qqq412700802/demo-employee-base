package com.demo.employee.company.service;

import com.demo.employee.company.entity.CompanyEntity;
import com.demo.employee.company.mapper.CompanyMapper;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private CompanyMapper companyMapper;

    @Override
    public int save(CompanyEntity entity) {
        companyMapper.insert(entity);
        return entity.getId();
    }

    @Override
    public int removeById(@RequestBody Serializable id) {
        return companyMapper.deleteById(id);
    }

    @Override
    public int updateById(@RequestBody  CompanyEntity entity) {
        return companyMapper.updateById(entity);
    }

    @Override
    public CompanyEntity getById(@RequestParam Integer id) {
        return companyMapper.selectById(id);
    }

    @Override
    public List<CompanyEntity> getList() {
        return companyMapper.selectList(null);
    }
}
