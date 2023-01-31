package com.social.service;

import com.social.dto.board;
import com.social.mapper.boardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class boardService {

    @Autowired
    private boardMapper mapper;

    public List<board> getList(){
        return mapper.getList();
    }


}
