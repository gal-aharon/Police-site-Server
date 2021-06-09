package PoliceStationServer.repositories;


import PoliceStationServer.models.accidentReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface accidentReportRepository extends JpaRepository<accidentReport, String> {
    List<accidentReport> findByReport(Integer ReportId);
}

