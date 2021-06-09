package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="report")
public class report {

    @Column(name = "ev_type")
    @JsonProperty
    private String ev_type;

    @Column(name = "ev_time")
    @JsonProperty
    private Timestamp ev_time;

    @Column(name = "ev_report_time")
    @JsonProperty
    private Timestamp evreporttime;

    @Column(name = "reporter_id")
    @JsonProperty
    private String reporter_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    @JsonProperty
    private Integer report_id;

    @Column(name = "ev_loc_x")
    @JsonProperty
    private Double ev_locx;

    @Column(name = "ev_loc_y")
    @JsonProperty
    private Double ev_locy;

    @Column(name = "ev_area")
    @JsonProperty
    private String ev_area;

    public report() {
    }

    public Integer getReport_id() {
        return report_id;
    }
}
