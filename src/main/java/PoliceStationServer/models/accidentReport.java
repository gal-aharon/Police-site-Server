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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="accident_report_id")
    @JsonProperty
    private Integer accidentId;

    @Column(name="report_id")
    @JsonProperty
    private Integer report;

    public void setReport(Integer report) {
        this.report = report;
    }
}
