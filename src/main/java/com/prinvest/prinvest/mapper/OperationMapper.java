package com.prinvest.prinvest.mapper;

import com.prinvest.prinvest.DTO.OperationDTO;
import com.prinvest.prinvest.domain.Operation;
import com.prinvest.prinvest.persistence.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@AllArgsConstructor
@Component
public class OperationMapper {

    private UserRepository userRepository;

    public OperationDTO toDTO(Operation operation) {
        OperationDTO operationDTO = new OperationDTO();

        operationDTO.setId(operation.getId());
        operationDTO.setEntry(operation.getEntry());
        operationDTO.setEntryBTC(operation.getEntryBTC());
        operationDTO.setEntryUSD(operation.getEntryUSD());
        operationDTO.setExit(operation.getExit());
        operationDTO.setExitBTC(operation.getExitBTC());
        operationDTO.setExitUSD(operation.getExitUSD());
        operationDTO.setCoin(operation.getCoin());
        operationDTO.setUserId(operation.getUser().getId());
        operationDTO.setUserName(operation.getUser().getName());
        operationDTO.setDate(operation.getDate());
        operationDTO.setCreated(operation.getCreated());
        operationDTO.setModified(operation.getModified());

        if(operation.getEntry() != null && operation.getEntry() != BigDecimal.ZERO) {
            operationDTO.setProfit((operation.getExit().subtract(operation.getEntry()))
                    .divide(operation.getEntry(), 15, RoundingMode.HALF_EVEN));
        }
        operationDTO.setBtcCost(operation.getEntryBTC());
        //operationDTO.setBtcCost(operation.getEntry().multiply(operation.getEntryBTC()));

        if(operation.getExitBTC() != null && operation.getEntryBTC() != null) {
            operationDTO.setBtcGain((operation.getExitBTC().subtract(operation.getEntryBTC())));
        }

        if(operation.getExitUSD() != null && operation.getEntryUSD() != null) {
            operationDTO.setUsdGain(operation.getExitUSD().subtract(operation.getEntryUSD()));
        }

        operationDTO.setComment(operation.getComment());

        return operationDTO;
    }

    public Operation ToEntity(OperationDTO operationDTO) {
        Operation operation = new Operation();

        operation.setId(operationDTO.getId());
        operation.setCoin(operationDTO.getCoin());
        operation.setEntry(operationDTO.getEntry());
        operation.setEntryBTC(operationDTO.getEntryBTC());
        operation.setEntryUSD(operationDTO.getEntryUSD());
        operation.setExit(operationDTO.getExit());
        operation.setExitBTC(operationDTO.getExitBTC());
        operation.setExitUSD(operationDTO.getExitUSD());

        if(operationDTO.getUserId() != null && operationDTO.getUserId() != 0) {
            operation.setUser(userRepository.findById(operationDTO.getUserId()).get());
        }

        operation.setDate(operationDTO.getDate());
        operation.setComment(operationDTO.getComment());

        return operation;
    }
}
