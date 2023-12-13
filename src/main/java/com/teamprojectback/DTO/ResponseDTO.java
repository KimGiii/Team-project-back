package com.teamprojectback.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private String code;
    private String message;

    public static ResponseEntity<ResponseDTO> databaseError() {
        ResponseDTO result = new ResponseDTO(ResponseCode.DATABASE_ERROR, ResponseMessage.DATABASE_ERROR);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
    }

    public static ResponseEntity<ResponseDTO> validationFailed() {
        ResponseDTO result = new ResponseDTO(ResponseCode.VALIDATION_FAILED, ResponseMessage.VALIDATION_FAILED);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }
}
