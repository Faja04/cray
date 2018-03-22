package com.cray.entity;

import java.util.Date;
import java.util.Objects;

public abstract class EntityBase {
    private Date created;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityBase that = (EntityBase) o;
        return Objects.equals(created, that.created);
    }

    @Override
    public int hashCode() {

        return Objects.hash(created);
    }

    @Override
    public String toString() {
        return "EntityBase{" +
                "created=" + created +
                '}';
    }
}
