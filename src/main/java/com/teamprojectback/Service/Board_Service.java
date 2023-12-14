package com.teamprojectback.Service;

import com.teamprojectback.DTO.Board.*;
import org.springframework.http.ResponseEntity;

public interface Board_Service {

    ResponseEntity<? super PostBoard_ResponseDTO> postBoard(PostBoard_RequestDTO DTO, String email);
    ResponseEntity<? super PatchBoard_ResponseDTO> patchBoard(PatchBoard_RequestDTO DTO, Integer boardNumber);

    ResponseEntity<? super GetBoard_ResponseDTO> getBoard(Integer number);

    ResponseEntity<? super GetLatestBoardList_ResponseDTO> getLatestBoardList();
}
