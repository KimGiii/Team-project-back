package com.teamprojectback.Service;

import com.teamprojectback.DTO.Board.*;
import com.teamprojectback.DTO.ResponseDTO;
import com.teamprojectback.Entity.board_Entity;
import com.teamprojectback.Repository.board_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Board_Service_implement implements Board_Service {

    private final board_Repository boardRepository;;

    @Override
    public ResponseEntity<? super PostBoard_ResponseDTO> postBoard(PostBoard_RequestDTO DTO, String email) {

        try {

            board_Entity board_Entity = new board_Entity(DTO, email);
            boardRepository.save(board_Entity);

        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDTO.databaseError();
        }

        return PostBoard_ResponseDTO.success();
    }

    @Override
    public ResponseEntity<? super PatchBoard_ResponseDTO> patchBoard(PatchBoard_RequestDTO DTO, Integer number) {

        try {
            board_Entity boardEntity = boardRepository.findByNumber(number);
            if (boardEntity == null) return PatchBoard_ResponseDTO.notExistBoard();
            boardEntity.patch(DTO);
            boardRepository.save(boardEntity);

        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDTO.databaseError();
        }

        return PatchBoard_ResponseDTO.success();
    }

    @Override
    public ResponseEntity<? super GetBoard_ResponseDTO> getBoard(Integer number) {

        board_Entity boardEntity = null;

        try {

            boardEntity = boardRepository.findByNumber(number);
            if (boardEntity == null) return GetBoard_ResponseDTO.notExistBoard();

        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDTO.databaseError();
        }

        return GetBoard_ResponseDTO.success(boardEntity);

    }

    @Override
    public ResponseEntity<? super GetLatestBoardList_ResponseDTO> getLatestBoardList() {

        List<board_Entity> boardEntities = new ArrayList<>();

        try {

            boardEntities = boardRepository.findByOrderByDateDesc();

        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDTO.databaseError();
        }

        return GetLatestBoardList_ResponseDTO.success(boardEntities);

    }

}
