
import javax.persistence.*;

@Entity
@Table(name = "reader_writer")
public class ReaderWriter {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "address")
    private String address;

    @Column(name = "warehouse_id")
    private Integer warehouseId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getWarehouseId() {
        return this.warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }
}
