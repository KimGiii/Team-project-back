package com.teamprojectback.Entity;


import com.teamprojectback.DTO.Board.PatchBoard_RequestDTO;
import com.teamprojectback.DTO.Board.PostBoard_RequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="board")
@Table(name="board")
public class board_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;
    private String title;
    private String date;
    private String videoId;
    private String text;

    public board_Entity(PostBoard_RequestDTO dto, String email) {
        this.title = dto.getTitle();
        this.date = dto.getDate();
        this.text =  dto.getText();
        this.videoId = dto.getVideoId();
    }

    public void patch(PatchBoard_RequestDTO dto) {
        this.title = dto.getTitle();
        this.text = dto.getText();
    }
}
