package com.teamprojectback.DTO.Board;

import com.teamprojectback.DTO.ResponseCode;
import com.teamprojectback.DTO.ResponseDTO;
import com.teamprojectback.DTO.ResponseMessage;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
public class PostBoard_ResponseDTO extends ResponseDTO {
    private PostBoard_ResponseDTO(String code, String message) {
        super(code, message);
    }

    public static ResponseEntity<PostBoard_ResponseDTO> success() {
        PostBoard_ResponseDTO result = new PostBoard_ResponseDTO(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
