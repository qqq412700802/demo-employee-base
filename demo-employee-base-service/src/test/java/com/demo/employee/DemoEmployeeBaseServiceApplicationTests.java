package com.demo.employee;

import com.demo.employee.company.entity.CompanyEntity;
import com.demo.employee.company.enums.CompanyCategoryTypeEnum;
import com.demo.employee.company.service.CompanyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoEmployeeBaseServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private CompanyService companyService;

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
