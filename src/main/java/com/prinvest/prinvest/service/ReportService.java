package com.prinvest.prinvest.service;

import com.prinvest.prinvest.DTO.OperationDTO;
import com.prinvest.prinvest.DTO.ReportChartDTO;
import com.prinvest.prinvest.domain.Operation;
import com.prinvest.prinvest.mapper.OperationMapper;
import com.prinvest.prinvest.persistence.OperationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ReportService {

    private OperationRepository operationRepository;
    private OperationMapper operationMapper;

    public List<ReportChartDTO> report() {
        List<OperationDTO> operations = operationRepository.findAll()
                .stream()
                .map(o -> operationMapper.toDTO(o))
                .collect(Collectors.toList());

        /*Map<String, BigDecimal> grouped = operations
                .stream()
                .collect(Collectors.groupingBy(OperationDTO::getCoin,
                        Collectors.reducing(BigDecimal.ZERO, OperationDTO::getUsdGain, BigDecimal::add)));*/

        Map<String, Long> grouped = operationRepository.findAll()
                .stream()
                .collect(Collectors.groupingBy(Operation::getCoin,
                        Collectors.counting()));

        List<ReportChartDTO> report = grouped.entrySet().stream()
                .map(r -> new ReportChartDTO(r.getKey(), r.getValue()))
                .collect(Collectors.toList());

        return report;
    }
}
