package com.teamprojectback.DTO.Board;

import com.teamprojectback.DTO.ResponseCode;
import com.teamprojectback.DTO.ResponseDTO;
import com.teamprojectback.DTO.ResponseMessage;
import com.teamprojectback.Entity.board_Entity;
import com.teamprojectback.Entity.board_Entity;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
public class GetBoard_ResponseDTO extends ResponseDTO {

    private int number;
    private String title;
    private String text;
    private String date;
    private String videoInfo;

    private GetBoard_ResponseDTO(String code, String message, board_Entity boardEntity) {
        super(code, message);

        this.number = boardEntity.getNumber();
        this.title = boardEntity.getTitle();
        this.text = boardEntity.getText();
        this.date = boardEntity.getDate();
        this.videoInfo = boardEntity.getVideoInfo();
    }

    public static ResponseEntity<GetBoard_ResponseDTO> success(board_Entity boardEntity) {
        GetBoard_ResponseDTO result = new GetBoard_ResponseDTO(ResponseCode.SUCCESS, ResponseMessage.SUCCESS, boardEntity);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDTO> notExistBoard() {
        ResponseDTO result = new ResponseDTO(ResponseCode.NOT_EXIST_BOARD, ResponseMessage.NOT_EXIST_BOARD);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }
}
