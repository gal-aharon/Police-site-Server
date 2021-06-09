package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "report_id")
@Table(name="shooting_report")
public class shootingReport {

    @Column(name="weapon_type")
    @JsonProperty
    private String weapon_type;

    @Column(name="casualties_num")
    @JsonProperty
    private Integer casualties_num;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="shooting_report_id")
    @JsonProperty
    private Integer shootingReport;

    @Column(name="report_id")
    @JsonProperty
    private Integer report;

    @Column(name="shooter_id")
    @JsonProperty
    private String shooter_id;
    
}
