package com.social.controller;

import com.social.dto.Board;
import com.social.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Controller
public class BoardController {

    @Autowired
    private BoardMapper mapper;
    
    @RequestMapping(value="/boardList", method={RequestMethod.GET})
    @ResponseBody
    public List<Board> boardList(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Board param) throws  Exception{
        return mapper.getList(param);
    }

    @RequestMapping(value="/boardInsert", method={RequestMethod.POST})
    @ResponseBody
    public void boardInsert(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Board param) throws  Exception{
        mapper.getBoardInsert(param);
    }

    @RequestMapping(value="/boardUpdate", method={ RequestMethod.POST})
    @ResponseBody
    public void boardUpdate(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Board param) throws  Exception{
        mapper.getBoardUpdate(param);
    }

    @RequestMapping(value="/boardDelete", method = {RequestMethod.DELETE})
    @ResponseBody
    public void boardDelete(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Board param) throws  Exception{
        mapper.getBoardDelete(param);
    }

    @RequestMapping(value="/delBoardDelete", method={RequestMethod.GET})
    @ResponseBody
    public void delBoardDelete(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Board param) throws  Exception{
        mapper.getDelBoard(param);
    }

}
