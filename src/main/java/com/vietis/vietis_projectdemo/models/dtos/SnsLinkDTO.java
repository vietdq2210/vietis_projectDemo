
public class SnsLinkDTO {
    private Integer id;
    private String message;
    private Integer lineWorksId;
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
