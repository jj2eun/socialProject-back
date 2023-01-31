package com.social.controller;

import com.social.dto.board;
import com.social.service.boardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class boardController {

    @Autowired
    private boardService service;

    @RequestMapping(value="/memberList", method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<board> memberList(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws  Exception{
        return service.getList();
    }




}
