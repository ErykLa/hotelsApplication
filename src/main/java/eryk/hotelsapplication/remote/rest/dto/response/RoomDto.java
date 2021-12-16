package eryk.hotelsapplication.remote.rest.dto.response;

import java.math.BigDecimal;

public class RoomDto {
    private Integer id;
    private Integer beds;
    private BigDecimal cena;

    public RoomDto() {
    }

    public RoomDto(Integer id, Integer beds, BigDecimal cena) {
        this.id = id;
        this.beds = beds;
        this.cena = cena;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }
}
