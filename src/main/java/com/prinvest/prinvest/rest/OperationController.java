package com.prinvest.prinvest.rest;

import com.prinvest.prinvest.DTO.OperationDTO;
import com.prinvest.prinvest.domain.Operation;
import com.prinvest.prinvest.service.OperationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@AllArgsConstructor
@RestController
@RequestMapping("/operations")
public class OperationController {

    private OperationService operationService;

    @GetMapping("/{id}")
    public OperationDTO getOne(@PathVariable("id") Long id) {
        return operationService.getOne(id);
    }

    @GetMapping
    public List<OperationDTO> getAll() {
        return operationService.getAll();
    }

    @GetMapping("/search")
    public List<OperationDTO> getAllSearch(@RequestParam(value = "search", required = false, defaultValue = "")
                                                       String search) {
        return operationService.getAllSearch(search, search);
    }

    @PostMapping
    public Operation create(@RequestBody OperationDTO operation) {
        return operationService.create(operation);
    }

    @PutMapping
    public Operation update(@RequestBody OperationDTO operation) {
        return operationService.update(operation);
    }
}
