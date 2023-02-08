package com.social;

import com.social.dto.Board;
import com.social.mapper.BoardMapper;
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

    @Autowired
    BoardMapper mapper;

    @Test
    public void getList(){
        List<Board> result = mapper.getList();

        System.out.println(result);

        //assertThat(1).isEqualTo(1);
    }
}



