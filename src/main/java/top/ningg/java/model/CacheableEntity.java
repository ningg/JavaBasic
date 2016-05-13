package top.ningg.java.model;

import java.io.Serializable;

public abstract class CacheableEntity<P> implements Serializable {
    private static final long serialVersionUID = -8844551974545004775L;

    protected P id;

    public P getId() {
        return id;
    }

    public void setId(P id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (null == other) {
            return false;
        }

        if (this == other) {
            return true;
        }

        return getClass() == other.getClass() && this.getId().equals(((CacheableEntity<?>) other).getId());
    }

}
