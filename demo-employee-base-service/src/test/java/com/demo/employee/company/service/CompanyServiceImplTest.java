package com.demo.employee.company.service;

import com.demo.employee.company.entity.CompanyEntity;
import com.demo.employee.company.enums.CompanyCategoryTypeEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CompanyServiceImplTest {
    @Autowired
    private CompanyService<CompanyEntity> companyService;

    @Test
    void save() {
//        CompanyEntity companyEntity = CompanyEntity.builder().code("sitir").name("四特酒")
//                .category(CompanyCategoryTypeEnum.GROUP.getValue()).build();
//        companyService.save(companyEntity);
    }

    @Test
    void removeById() {
    }

    @Test
    void updateById() {
    }

    @Test
    void getById() {
    }
}