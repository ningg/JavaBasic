package top.ningg.java.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import top.ningg.java.model.CacheableEntity;

public abstract class AbstractEntity<P> extends CacheableEntity<P> {
    private static final long serialVersionUID = -4201769689328080787L;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date modified;

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
