package com.teamprojectback.DTO.Board;

import com.teamprojectback.DTO.ResponseCode;
import com.teamprojectback.DTO.ResponseDTO;
import com.teamprojectback.DTO.ResponseMessage;
import com.teamprojectback.Entity.board_Entity;
import com.teamprojectback.BoardListItem;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Getter
public class GetLatestBoardList_ResponseDTO extends ResponseDTO {

    private List<BoardListItem> latestList;

    private GetLatestBoardList_ResponseDTO(String code, String message, List<board_Entity> boardEntities) {
        super(code, message);
        this.latestList = BoardListItem.getList(boardEntities);
    }

    public static ResponseEntity<GetLatestBoardList_ResponseDTO> success(List<board_Entity> boardEntities) {
        GetLatestBoardList_ResponseDTO result = new GetLatestBoardList_ResponseDTO(ResponseCode.SUCCESS, ResponseMessage.SUCCESS, boardEntities);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
