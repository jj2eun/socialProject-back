package com.social;

import com.social.dto.board;
import com.social.mapper.boardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class boardControllerTest {

    @Autowired
    private static boardMapper mapper;


    @Test
    @Transactional
    @Rollback(false)
    public void getList(){
        List<board> result = mapper.getList();

        System.out.println(result);

        assertThat(1).isEqualTo(1);

    }


}