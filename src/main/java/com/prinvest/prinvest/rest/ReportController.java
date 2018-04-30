package com.prinvest.prinvest.rest;

import com.prinvest.prinvest.DTO.ReportChartDTO;
import com.prinvest.prinvest.service.ReportService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@AllArgsConstructor
@RestController
@RequestMapping("/reports")
public class ReportController {

    private ReportService reportService;

    @GetMapping
    public List<ReportChartDTO> report() {
        return reportService.report();
    }
}
