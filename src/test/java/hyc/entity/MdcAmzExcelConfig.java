package hyc.entity;
public class MdcAmzExcelConfig {
    /**
     * 主键
     */
    private Long id;

    /**
     * 报告枚举
     */
    private String reportType;

    /**
     * 报告title
     */
    private String title;

    /**
     * 对应属性
     */
    private String prop;

    /**
     * 抽查列(0(默认):不是 1:是
     */
    private Integer checkField;

    /**
     * mysql对应抽样列
     */
    private String mysqlColumn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public Integer getCheckField() {
        return checkField;
    }

    public void setCheckField(Integer checkField) {
        this.checkField = checkField;
    }

    public String getMysqlColumn() {
        return mysqlColumn;
    }

    public void setMysqlColumn(String mysqlColumn) {
        this.mysqlColumn = mysqlColumn;
    }
}
