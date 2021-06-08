package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "report_id")
@Table(name="shooting_report")
public class shootingReport {

    @Column(name="weapon_type")
    @JsonProperty
    private String weaponType;

    @Column(name="casualties_num")
    @JsonProperty
    private Integer casualtiesNum;

    @Id
    @Column(name="shooting_report_id")
    @JsonProperty
    private String shootingReport;

    @Column(name="report_id")
    @JsonProperty
    private String report;

    @Column(name="shooter_id")
    @JsonProperty
    private String shooterId;
    
}
