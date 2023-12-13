package com.teamprojectback.Service;

import com.teamprojectback.DTO.Board.PatchBoard_RequestDTO;
import com.teamprojectback.DTO.Board.PatchBoard_ResponseDTO;
import com.teamprojectback.DTO.Board.PostBoard_RequestDTO;
import com.teamprojectback.DTO.Board.PostBoard_ResponseDTO;
import com.teamprojectback.DTO.ResponseDTO;
import com.teamprojectback.Entity.board_Entity;
import com.teamprojectback.Repository.board_Repository;
import com.teamprojectback.Repository.user_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Board_Service_implement implements Board_Service {

    private final user_Repository userRepository;
    private final board_Repository boardRepository;

    @Override
    public ResponseEntity<? super PostBoard_ResponseDTO> postBoard(PostBoard_RequestDTO dto, String email) {

        try {
            boolean existedUser = userRepository.existsByEmail(email);
            board_Entity board_Entity = new board_Entity(dto, email);
            boardRepository.save(board_Entity);
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDTO.databaseError();
        }

        return PostBoard_ResponseDTO.success();
    }

    @Override
    public ResponseEntity<? super PatchBoard_ResponseDTO> patchBoard(PatchBoard_RequestDTO dto, Integer number, String email) {

        try {
            boolean existedUser = userRepository.existsByEmail(email);

            board_Entity boardEntity = boardRepository.findByNumber(number);
            if (boardEntity == null) return PatchBoard_ResponseDTO.notExistBoard();
            boardEntity.patch(dto);
            boardRepository.save(boardEntity);

        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDTO.databaseError();
        }

        return PatchBoard_ResponseDTO.success();
    }
}
