package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "report_id")
@Table(name="kidnap_report")
public class kidnapReport {

    @Column(name = "kidnapper_id")
    @JsonProperty
    private String kidnapper_id;

    @Column(name = "last_place_known")
    @JsonProperty
    private String last_place_known;

    @Column(name = "report_id")
    @JsonProperty
    private Integer report;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kidnap_report_id")
    @JsonProperty
    private Integer kidnapId;

    @Column(name = "kidnapped_id")
    @JsonProperty
    private String kidnapped_id;

    public kidnapReport() {
        super();
    }
}