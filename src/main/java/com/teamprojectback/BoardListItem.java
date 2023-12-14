package com.teamprojectback;


import com.teamprojectback.Entity.board_Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BoardListItem {

    private int number;
    private String title;
    private String text;
    private String date;
    private String videoInfo;

    public BoardListItem(board_Entity boardEntity) {
        this.number = boardEntity.getNumber();
        this.title = boardEntity.getTitle();
        this.text = boardEntity.getText();
        this.date = boardEntity.getDate();
        this.videoInfo = boardEntity.getVideoInfo();
    }

    public static List<BoardListItem> getList(List<board_Entity> boardEntities) {
        List<BoardListItem> list = new ArrayList<>();
        for (board_Entity boardEntity: boardEntities) {
            BoardListItem boardListItem = new BoardListItem(boardEntity);
            list.add(boardListItem);
        }
        return list;
    }
}
