package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by DmitryL on 01.08.2017.
 */
@Entity
@Table(name = "theme")
public class Theme extends AbstractDomain {

    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 255)
    private String name;

    @Column(name = "status", nullable = false, insertable = true, updatable = true, length = 255)
    private int status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
