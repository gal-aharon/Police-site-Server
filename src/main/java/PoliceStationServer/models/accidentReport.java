package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "report_id")
@Table(name="accident_report")
public class accidentReport {

    @Column(name="hitter_id")
    @JsonProperty
    private String hitter_id;

    @Column(name="hit_id")
    @JsonProperty
    private String hit_id;

    @Column(name="casualties_num")
    @JsonProperty
    private Integer casualties_num;

    @Id
    @Column(name="accident_report_id")
    @JsonProperty
    private String accidentId;

    @Column(name="report_id")
    @JsonProperty
    private String report;
}
