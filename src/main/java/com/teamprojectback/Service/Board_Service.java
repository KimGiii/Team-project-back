package com.teamprojectback.Service;

import com.teamprojectback.DTO.Board.PatchBoard_RequestDTO;
import com.teamprojectback.DTO.Board.PatchBoard_ResponseDTO;
import com.teamprojectback.DTO.Board.PostBoard_RequestDTO;
import com.teamprojectback.DTO.Board.PostBoard_ResponseDTO;
import org.springframework.http.ResponseEntity;

public interface Board_Service {
//    @Autowired user_Repository userRepository;
//    @Autowired board_Repository board_Repository;
//    @Autowired video_Repository videoRepository;
//
//    public ResponseDTO<?> postBoard(PostBoard_RequestDTO DTO) {
//        String boardTitle = DTO.getTitle();
//        String boardText = DTO.getText();
//        String useEmail = DTO.getEmail();
//
//        // 유튜브 영상 ID 확인
//        try {
//            boolean existed_User = user_Repository.existsByEmail(email);
//        } catch (Exception error) {
//            return ResponseDTO.setFailed("데이터베이스 연동 오류");
//        }
//
//        // 내용과 제목 작성 여부 확인
//        try{
//            boolean existContent = board_Repository.existsByTitleAndText(boardTitle, boardText);
//            if(!existContent) return ResponseDTO.setFailed("내용과 제목을 모두 입력하세요.");
//        } catch(Exception error) {
//            return ResponseDTO.setFailed("데이터베이스 연동 오류");
//        }
//
//        //board_Entity 생성
//        board_Entity board_Entity = new board_Entity(DTO, email);
//
//        //board_Repository를 이용해서 데이터베이스에 Entity 저장
//        try {
//            board_Repository.save(board_Entity);
//        } catch (Exception error) {
//            return ResponseDTO.setFailed("데이터베이스 연동 오류");
//        }
//
//        //성공시
//        return ResponseDTO.setSuccess("게시물이 등록되었습니다", null);
//    }
    ResponseEntity<? super PostBoard_ResponseDTO> postBoard(PostBoard_RequestDTO dto, String email);
    ResponseEntity<? super PatchBoard_ResponseDTO> patchBoard(PatchBoard_RequestDTO dto, Integer boardNumber, String email);
}
