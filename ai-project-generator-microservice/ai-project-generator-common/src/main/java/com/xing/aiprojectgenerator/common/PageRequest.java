package com.xing.aiprojectgenerator.common;

import lombok.Data;


/**
 * 分页请求类
 * 用于封装分页查询所需的参数，包括页号、页面大小、排序字段和排序顺序
 * 使用了Lombok的@Data注解，自动生成getter、setter、toString等方法
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     * 默认值为1，表示从第一页开始
     */
    private int pageNum = 1;

    /**
     * 页面大小
     * 默认值为10，表示每页显示10条记录
     */
    private int pageSize = 10;

    /**
     * 排序字段
     * 用于指定按照哪个字段进行排序，可以为空
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}
