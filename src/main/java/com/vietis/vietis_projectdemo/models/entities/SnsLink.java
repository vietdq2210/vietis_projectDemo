
import javax.persistence.*;

@Entity
@Table(name = "sns_link")
public class SnsLink {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "message")
    private String message;

    @Column(name = "line_works_id")
    private Integer lineWorksId;

    @Column(name = "status_id")
    private Integer statusId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getLineWorksId() {
        return this.lineWorksId;
    }

    public void setLineWorksId(Integer lineWorksId) {
        this.lineWorksId = lineWorksId;
    }

    public Integer getStatusId() {
        return this.statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}
