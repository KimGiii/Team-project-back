package com.teamprojectback.Controller;

import com.teamprojectback.DTO.Board.*;
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

    @PatchMapping("/{number}")
    public ResponseEntity<? super PatchBoard_ResponseDTO> patchBoard(
            @RequestBody @Valid PatchBoard_RequestDTO requestBody,
            @PathVariable("number") Integer number
    ) {
        ResponseEntity<? super PatchBoard_ResponseDTO> response = boardService.patchBoard(requestBody, number);
        return response;
    }

    @GetMapping("/")
    public ResponseEntity<? super GetBoard_ResponseDTO> getBoard(
            @PathVariable("number") Integer number
    ) {
        ResponseEntity<? super GetBoard_ResponseDTO> response = boardService.getBoard(number);
        return response;
    }

    @GetMapping("/latest-list")
    public ResponseEntity<? super GetLatestBoardList_ResponseDTO> getLatestBoardList() {
        ResponseEntity<? super GetLatestBoardList_ResponseDTO> response = boardService.getLatestBoardList();
        return response;
    }
}