package kr.ac.skuniv.realestate.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by YoungMan on 2019-02-19.
 */

@Getter
@Setter
public class AnswerSaveDto {

    private String content;
    private String author;
    private Long boardNo;

    public AnswerSaveDto() {
    }

    @Builder
    public AnswerSaveDto(String content, String author, Long boardNo) {
        this.content = content;
        this.author = author;
        this.boardNo = boardNo;
    }
}
