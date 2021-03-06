package com.demo.employee.company.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 公司信息 公司信息
 * </p>
 *
 * @author lixj
 * @since 2021-06-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("company")
@NoArgsConstructor
public class CompanyEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编	号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公司编码	公司编码
     */
    @TableField("CODE")
    private String code;

    /**
     * 公司名称	公司名称
     */
    private String name;

    /**
     * 上级公司id 上级公	司id
     */
    private Integer parentCommpanyId;

    /**
     * 类别 1-集团；2-	分公司；3-子公司
     */
    private Integer category;

    /**
     * 状态 1-未启用，2-已	启用，3-已停用
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 备注 备注
     */
    private String note;

    /**
     * 操作人id 当前用户	ID
     */
    private Integer operatorId;

    /**
     * 创建时间 创建时间
     */
    private Integer createTime;

    /**
     * 成立日期	成立日期
     */
    private String foundDate;

    /**
     * 版本号 版本号
     */
    @TableField("VERSION")
    private Integer version;

    /**
     * 最后更新时间 最后更	新时间
     */
    private Integer lastAccess;


}
