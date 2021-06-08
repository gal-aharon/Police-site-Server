package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "report_id")
@Table(name="kidnap_report")
public class kidnapReport {

    @Column(name = "kidnapper_id")
    @JsonProperty
    private String kidnapperID;

    @Column(name = "last_place_known")
    @JsonProperty
    private String lastPlace;

    @Column(name = "report_id")
    @JsonProperty
    private String report;

    @Id
    @Column(name = "kidnap_report_id")
    @JsonProperty
    private String kidnapId;

    @Column(name = "kidnapped_id")
    @JsonProperty
    private String kidnappedId;

    public kidnapReport() {
        super();
    }
}