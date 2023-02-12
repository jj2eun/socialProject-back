package com.social.mapper;

import com.social.dto.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<Board> getList(Board param) throws Exception;

    int getBoardInsert(Board param) throws Exception;

    int getBoardUpdate(Board param) throws Exception;

    int getBoardDelete(Board param) throws Exception;

    int getDelBoard(Board param) throws Exception;

}
