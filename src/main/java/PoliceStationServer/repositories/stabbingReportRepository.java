package PoliceStationServer.repositories;

import PoliceStationServer.models.stabbingReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface stabbingReportRepository extends JpaRepository<stabbingReport, String> {
    stabbingReport findByReport(Integer ReportId);
}
