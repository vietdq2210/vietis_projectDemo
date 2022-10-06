
import javax.persistence.*;

@Entity
@Table(name = "antenna")
public class Antenna {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "port_no")
    private Integer portNo;

    @Column(name = "stage_number")
    private Integer stageNumber;

    @Column(name = "warehouse_id")
    private Integer warehouseId;

    @Column(name = "status_id")
    private Integer statusId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPortNo() {
        return this.portNo;
    }

    public void setPortNo(Integer portNo) {
        this.portNo = portNo;
    }

    public Integer getStageNumber() {
        return this.stageNumber;
    }

    public void setStageNumber(Integer stageNumber) {
        this.stageNumber = stageNumber;
    }

    public Integer getWarehouseId() {
        return this.warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getStatusId() {
        return this.statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}
