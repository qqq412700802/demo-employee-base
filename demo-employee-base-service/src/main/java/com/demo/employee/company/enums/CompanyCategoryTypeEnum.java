package com.demo.employee.company.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum CompanyCategoryTypeEnum {
    /**
     * 集团
     */
    GROUP("集团", 1),
    /**
     * 分公司
     */
    BRANCH("分公司", 2),
    /**
     * 子公司
     */
    SUBSIDIARY("子公司", 3);

    /** 描述*/
    private String desc;
    /** 枚举值*/
    private int value;

    private CompanyCategoryTypeEnum(String desc, int value)
    {
        this.desc = desc;
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public static CompanyCategoryTypeEnum getEnum(int value)
    {
        CompanyCategoryTypeEnum resultEnum = null;
        CompanyCategoryTypeEnum[] enumAry = CompanyCategoryTypeEnum.values();

        for (int i = 0; i < enumAry.length; i++)
        {
            if (enumAry[i].getValue() == value)
            {
                resultEnum = enumAry[i];
                break;
            }
        }

        return resultEnum;
    }

    public static Map<String, Map<String, Object>> toMap()
    {
        CompanyCategoryTypeEnum[] ary = CompanyCategoryTypeEnum.values();
        Map<String, Map<String, Object>> enumMap = new HashMap<String, Map<String, Object>>();

        for (int num = 0; num < ary.length; num++)
        {
            Map<String, Object> map = new HashMap<String, Object>();
            String key = String.valueOf(getEnum(ary[num].getValue()));
            map.put("desc", ary[num].getDesc());
            map.put("value", ary[num].getValue());

            enumMap.put(key, map);
        }

        return enumMap;
    }

    public static List<Map<String, Object>> toList()
    {
        CompanyCategoryTypeEnum[] ary = CompanyCategoryTypeEnum.values();
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < ary.length; i++)
        {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("desc", ary[i].getDesc());
            map.put("value", ary[i].getValue());

            list.add(map);
        }

        return list;
    }
}
