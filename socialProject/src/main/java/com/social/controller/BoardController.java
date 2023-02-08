package com.social.controller;

import com.social.dto.Board;
import com.social.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardMapper mapper;
    
    @RequestMapping(value="/memberList", method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<Board> memberList(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws  Exception{
        return mapper.getList();
    }




}
