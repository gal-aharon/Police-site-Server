package security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.models.report;
import security.services.reportService;

import java.util.List;

@RestController
@RequestMapping("/report")
public class reportController {
    @Autowired
    security.services.reportService reportService;

    @GetMapping("")
    public List<report> getAll() {
        return reportService.getAll();
    }
}
