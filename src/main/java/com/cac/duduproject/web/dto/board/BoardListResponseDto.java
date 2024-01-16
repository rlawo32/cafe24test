package com.cac.duduproject.web.dto.board;

import com.cac.duduproject.jpa.domain.board.Board;
import lombok.Data;

@Data
public class BoardListResponseDto {

    private Long boardNo;
    private String boardTitle;
    private String boardCreatedDate;

    public BoardListResponseDto(Board board) {
        this.boardNo = board.getBoardNo();
        this.boardTitle = board.getBoardTitle();
        this.boardCreatedDate = board.getBoardCreatedDate();
    }
}
