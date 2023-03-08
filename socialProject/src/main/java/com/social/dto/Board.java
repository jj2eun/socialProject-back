package com.social.dto;

import lombok.Data;

import java.util.List;

/*
* Data 는 : Getter, Setter, RequiredArgsConstructor, ToString, EqualsAndHashCode
* 이거 다쓰게 해주는 annotation 입니다.
*
* */
@Data
public class Board {

    private String boardSeq;
    private String boardId;
    private String contents;
    private String insertDt;
    private String updateDt;
    private String id;
    private String boardMaxSeq;
    private List<String> boardList;
    private String boardSeqStr;

}