package security.repositories;


import security.models.kidnapReport;
import security.models.report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kidnapReportRepository extends JpaRepository<kidnapReport, String> {
}
