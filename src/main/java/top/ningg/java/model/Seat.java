package top.ningg.java.model;

import top.ningg.java.model.enums.SeatTypeEnum;

import java.io.Serializable;
import java.util.Objects;

public class Seat implements Comparable<Seat>, Serializable {

    private static final long serialVersionUID = -3528334885014139184L;

    // 座位的外部ID
    private String partnerId;
    // 座位行坐标
    private int row;
    // 座位列坐标
    private int col;
    // 座位名称
    private String name;
    // 座位所属票类ID (都为原始票类)
    private long ticketId;
    // 座位类型
    private SeatTypeEnum type;
    // 是否可以使用套票规则
    private boolean packaged;

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public SeatTypeEnum getType() {
        return type;
    }

    public void setType(SeatTypeEnum type) {
        this.type = type;
    }

    public boolean isPackaged() {
        return packaged;
    }

    public void setPackaged(boolean packaged) {
        this.packaged = packaged;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.row, this.col);
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && (this == obj || (this.getClass() == obj.getClass() && this.row == ((Seat) obj).row && this.col == ((Seat) obj).col));
    }

    @Override
    public int compareTo(Seat o) {
        // 先比行坐标，同一行的再比列坐标
        return this.row == o.getRow() ? (this.col - o.getCol()) : (this.row - o.getRow());
    }
}
