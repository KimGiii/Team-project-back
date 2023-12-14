package com.teamprojectback.DTO.Board;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PostBoard_RequestDTO {

    @NotBlank
    private String title;
    private String videoInfo;
    @NotBlank
    private String text;
    private String date;
    private String writer;
//    @NotNull
//    private List<String> boardList;
}
