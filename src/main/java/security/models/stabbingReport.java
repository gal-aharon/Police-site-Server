package security.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "report_id")
@Table(name="stabbing_report")
public class stabbingReport {

    @Column(name="weapon_type")
    @JsonProperty
    private String weaponType;

    @Column(name="casualties_num")
    @JsonProperty
    private Integer casualtiesNum;

    @Id
    @Column(name="stabbing_report_id")
    @JsonProperty
    private String stabbingReport;

    @Column(name="report_id")
    @JsonProperty
    private String report;

    @Column(name="stabber_id")
    @JsonProperty
    private String stabberId;

}
