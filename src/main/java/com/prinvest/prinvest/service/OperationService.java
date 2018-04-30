package com.prinvest.prinvest.service;

import com.prinvest.prinvest.DTO.OperationDTO;
import com.prinvest.prinvest.domain.Operation;
import com.prinvest.prinvest.mapper.OperationMapper;
import com.prinvest.prinvest.persistence.OperationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class OperationService {

    private OperationRepository operationRepository;
    private OperationMapper operationMapper;

    public OperationDTO getOne(Long id) {
        return operationMapper.toDTO(operationRepository.findById(id).get());
    }

    public List<OperationDTO> getAllSearch(String coin, String user) {
        return operationRepository.findAllByCoinContainingOrUserNameContaining(coin, user)
                .stream()
                .map(o -> operationMapper.toDTO(o))
                .collect(Collectors.toList());
    }

    public List<OperationDTO> getAll() {
        return operationRepository.findAll()
                .stream()
                .map(o -> operationMapper.toDTO(o))
                .collect(Collectors.toList());
    }

    public Operation create(OperationDTO operation) {
        return operationRepository.save(operationMapper.ToEntity(operation));
    }

    public Operation update(OperationDTO operation) {
        return operationRepository.save(operationMapper.ToEntity(operation));
    }
}
