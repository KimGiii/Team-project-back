package com.teamprojectback.Controller;

import com.teamprojectback.DTO.Board.PatchBoard_RequestDTO;
import com.teamprojectback.DTO.Board.PatchBoard_ResponseDTO;
import com.teamprojectback.DTO.Board.PostBoard_RequestDTO;
import com.teamprojectback.DTO.Board.PostBoard_ResponseDTO;
import com.teamprojectback.Service.Board_Service;

import lombok.RequiredArgsConstructor;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class Board_Controller {

    @Autowired Board_Service boardService;

    @PostMapping("")
    public ResponseEntity<? super PostBoard_ResponseDTO> postBoard(
            @RequestBody @Valid PostBoard_RequestDTO requestBody,
            String email
    ) {
        ResponseEntity<? super PostBoard_ResponseDTO> response = boardService.postBoard(requestBody, email);
        return response;
    }

    @PatchMapping("/{boardNumber}")
    public ResponseEntity<? super PatchBoard_ResponseDTO> patchBoard(
            @RequestBody @Valid PatchBoard_RequestDTO requestBody,
            @PathVariable("boardNumber") Integer boardNumber,
            String email
    ) {
        ResponseEntity<? super PatchBoard_ResponseDTO> response = boardService.patchBoard(requestBody, boardNumber, email);
        return response;
    }
}