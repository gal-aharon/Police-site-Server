package PoliceStationServer.repositories;


import PoliceStationServer.models.kidnapReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface kidnapReportRepository extends JpaRepository<kidnapReport, String> {
    List<kidnapReport> findByReport(String ReportId);
}
