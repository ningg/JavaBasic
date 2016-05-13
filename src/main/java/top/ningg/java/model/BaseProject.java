package top.ningg.java.model;

import org.apache.commons.lang3.StringUtils;

public abstract class BaseProject extends CacheableEntity<Integer> {
    private static final long serialVersionUID = -8708733554118403294L;

    private static final int PROJECT_SHORT_NAME_LENGTH_LIMIT = 15;

    // 标题
    private String name;
    // 促销信息
    private String sellInfo;
    // 海报图URL
    private String posterUrl;
    // 最低价
    private Integer lowestPrice;
    // 最高价
    private Integer highestPrice;
    // 是否可以选座
    private boolean seatable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSellInfo() {
        return sellInfo;
    }

    public void setSellInfo(String sellInfo) {
        this.sellInfo = sellInfo;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public Integer getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Integer lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public Integer getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Integer highestPrice) {
        this.highestPrice = highestPrice;
    }

    public boolean isSeatable() {
        return seatable;
    }

    public void setSeatable(boolean seatable) {
        this.seatable = seatable;
    }

    public String getShortName() {
        if (StringUtils.isBlank(name)) {
            return StringUtils.EMPTY;
        }
        String shortName = name;
        if (PROJECT_SHORT_NAME_LENGTH_LIMIT < shortName.length()) {
            shortName = String.format("%s…", StringUtils.substring(shortName, 0, PROJECT_SHORT_NAME_LENGTH_LIMIT - 2));
        }
        return shortName;
    }
}
