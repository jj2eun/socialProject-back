package com.social;

import com.social.dto.board;
import com.social.mapper.boardMapper;
import com.social.service.boardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootApplication
@SpringBootTest
@Transactional
public class TestApplication {

    @Autowired boardService service;

    @Test
    public void getList(){
        List<board> result = service.getList();

        System.out.println(result);

        //assertThat(1).isEqualTo(1);
    }
}
