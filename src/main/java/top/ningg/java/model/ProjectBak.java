package top.ningg.java.model;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import top.ningg.java.model.enums.PartnerSourceEnum;
import top.ningg.java.model.enums.ProjectTicketStatusEnum;
import top.ningg.java.model.enums.PromotionStatusEnum;

public class ProjectBak extends BaseProject {
    private static final long serialVersionUID = 3182173323412784317L;

    public static final String SYSTEM_OPERATOR = "system";
    public static final String SYSTEM_OFF_REASON_OFF = "第三方系统已停售";
    public static final String SYSTEM_OFF_REASON_PAST = "过期";
    public static final String SYSTEM_OFF_REASON_NOT_EXIST = "第三方系统不存在";
    public static final int STATUS_OFF = 0;
    public static final int STATUS_ON = 1;
    public static final int STATUS_HIDDEN = 2;

    // 分站ID
    private int stationId;
    // 场馆ID
    private int venueId;
    // 收款方ID
    private int beneficiaryId;
    // 来源
    private PartnerSourceEnum source;
    // 第三方ID
    private String partnerId;
    // 第三方地址
    private String partnerUrl;
    // 原始标题
    private String originalName;
    // 摘要
    private String summary;
    // 演员名称
    private String performer;
    // 座位图URL
    private String seatUrl;
    // 海报大图url
    private String originPosterUrl;
    // 原始详情（HTML）
    private String originalDetail;
    // 详情（HTML）
    private String detail;
    // 排序值，越大的越靠前
    private int sort;
    // 推荐排序值, 智能数据组同步而来, 越大越靠前
    private int recoSort;
    // 发票配置ID
    private int invoiceConfigId;
    // 条目开始时间
    private Date startDate;
    // 条目结束时间
    private Date endDate;
    // 0下架，1上架，2隐藏
    private int status;
    // 票品状态: 预售(0), 出票中(1), 即将开售(2)
    private ProjectTicketStatusEnum ticketStatus;
    // 是否已经审核过
    private boolean audited;
    // 上架操作人
    private String onOperator;
    // 上架时间
    private Date onTime;
    // 下架操作人
    private String offOperator;
    // 下架原因
    private String offReason;
    // 下架时间
    private Date offTime;
    // 总销量
    private int sales;
    // 前一天销量
    private int latestSales;
    // 条目所属分类ID列表
    // 促销折扣状态
    private PromotionStatusEnum promotionStatus = PromotionStatusEnum.NORMAL;
    private Date created;
    private Date modified;

    // 条目设置的促销标签 Id
    private List<Integer> promotionIds = Collections.emptyList();
    private List<Integer> categoryIds = Collections.emptyList();

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(int beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public PartnerSourceEnum getSource() {
        return source;
    }

    public void setSource(PartnerSourceEnum source) {
        this.source = source;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerUrl() {
        return partnerUrl;
    }

    public void setPartnerUrl(String partnerUrl) {
        this.partnerUrl = partnerUrl;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getSeatUrl() {
        return seatUrl;
    }

    public void setSeatUrl(String seatUrl) {
        this.seatUrl = seatUrl;
    }

    public String getOriginPosterUrl() {
        return originPosterUrl;
    }

    public void setOriginPosterUrl(String originPosterUrl) {
        this.originPosterUrl = originPosterUrl;
    }

    public String getOriginalDetail() {
        return originalDetail;
    }

    public void setOriginalDetail(String originalDetail) {
        this.originalDetail = originalDetail;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getRecoSort() {
        return recoSort;
    }

    public void setRecoSort(int recoSort) {
        this.recoSort = recoSort;
    }

    public int getInvoiceConfigId() {
        return invoiceConfigId;
    }

    public void setInvoiceConfigId(int invoiceConfigId) {
        this.invoiceConfigId = invoiceConfigId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ProjectTicketStatusEnum getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(ProjectTicketStatusEnum ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public boolean isAudited() {
        return audited;
    }

    public void setAudited(boolean audited) {
        this.audited = audited;
    }

    public String getOnOperator() {
        return onOperator;
    }

    public void setOnOperator(String onOperator) {
        this.onOperator = onOperator;
    }

    public Date getOnTime() {
        return onTime;
    }

    public void setOnTime(Date onTime) {
        this.onTime = onTime;
    }

    public String getOffOperator() {
        return offOperator;
    }

    public void setOffOperator(String offOperator) {
        this.offOperator = offOperator;
    }

    public String getOffReason() {
        return offReason;
    }

    public void setOffReason(String offReason) {
        this.offReason = offReason;
    }

    public Date getOffTime() {
        return offTime;
    }

    public void setOffTime(Date offTime) {
        this.offTime = offTime;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getLatestSales() {
        return latestSales;
    }

    public void setLatestSales(int latestSales) {
        this.latestSales = latestSales;
    }

    public PromotionStatusEnum getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(PromotionStatusEnum promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public List<Integer> getPromotionIds() {
        return promotionIds;
    }

    public void setPromotionIds(List<Integer> promotionIds) {
        this.promotionIds = promotionIds;
    }

    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
