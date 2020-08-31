package com.lp.yihan.common.result;

/**
 * @author lp
 * @create 2020/5/30 16:57
 * 分页参数
 */
public class Page {

    /**
     * 起始面默认从第一页
     */
    private Integer page = 1;

    /**
     * 每页数
     */
    private Integer limit = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
