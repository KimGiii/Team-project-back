package com.teamprojectback.DTO.Board;

import com.teamprojectback.DTO.ResponseCode;
import com.teamprojectback.DTO.ResponseDTO;
import com.teamprojectback.DTO.ResponseMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
public class PatchBoard_ResponseDTO extends ResponseDTO {

    private PatchBoard_ResponseDTO(String code, String message) {
        super(code, message);
    }

    public static ResponseEntity<PatchBoard_ResponseDTO> success() {
        PatchBoard_ResponseDTO result = new PatchBoard_ResponseDTO(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDTO> notExistBoard() {
        ResponseDTO result = new ResponseDTO(ResponseCode.NOT_EXIST_BOARD, ResponseMessage.NOT_EXIST_BOARD);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

    public static ResponseEntity<ResponseDTO> noPermission() {
        ResponseDTO result = new ResponseDTO(ResponseCode.NO_PERMISSION, ResponseMessage.NO_PERMISSION);
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(result);
    }
}
