package com.social.dto;

import lombok.Data;

/*
* Data 는 : Getter, Setter, RequiredArgsConstructor, ToString, EqualsAndHashCode
* 이거 다쓰게 해주는 annotation 입니다.
*
* */
@Data
public class board {

    private String boardId;
    private String contents;

}
