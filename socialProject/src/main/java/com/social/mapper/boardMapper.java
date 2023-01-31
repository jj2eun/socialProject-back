package com.social.mapper;

import com.social.dto.board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface boardMapper {

    List<board> getList();

}
