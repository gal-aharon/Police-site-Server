package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "report_id")
@Table(name="stabbing_report")
public class stabbingReport {

    @Column(name="weapon_type")
    @JsonProperty
    private String weapon_type;

    @Column(name="casualties_num")
    @JsonProperty
    private Integer casualties_num;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stabbing_report_id")
    @JsonProperty
    private Integer stabbingReport;

    @Column(name="report_id")
    @JsonProperty
    private Integer report;

    @Column(name="stabber_id")
    @JsonProperty
    private String stabber_id;

}
