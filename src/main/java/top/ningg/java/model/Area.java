package top.ningg.java.model;

import java.util.Collections;
import java.util.Map;

public class Area extends AbstractEntity<Long> {

    private static final long serialVersionUID = -5088406062635544802L;

    // 场次ID
    private long showId;
    // 场区的外部ID
    private String partnerId;
    // 场区名称
    private String name;
    // SVG的path属性
    private String svgPath;
    // 座区宽度
    private int width;
    // 座区高度
    private int height;
    // 座位列表，rowIndex:columnIndex -> Seat
    private Map<String, Seat> seats = Collections.emptyMap();
    // 是否是删除状态
    private boolean deleted;

    public long getShowId() {
        return showId;
    }

    public void setShowId(long showId) {
        this.showId = showId;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSvgPath() {
        return svgPath;
    }

    public void setSvgPath(String svgPath) {
        this.svgPath = svgPath;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Map<String, Seat> getSeats() {
        return seats;
    }

    public void setSeats(Map<String, Seat> seats) {
        this.seats = seats;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
