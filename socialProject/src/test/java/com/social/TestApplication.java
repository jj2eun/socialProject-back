package com.social;

import com.social.dto.Board;
import com.social.mapper.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class TestApplication {

    @Autowired
    BoardMapper mapper;

    // 데이터 조회 할 수 있는 TestCase
    @Test
    public void getList() throws Exception{
        Board param = new Board();
        param.setId("준성");

        List<Board> result = mapper.getList(param);

        System.out.println(result);

        //assertThat(1).isEqualTo(1);
    }

    /*데이터 인입 할 수 있는 TestCase
    Rollback 을 true 즉 Rollback을 할꺼면 사용 할 필요 없고 Rollback 하지 않을꺼면 false로 해야합니다.*/
    @Test
    @Transactional
    @Rollback(false)
    public void getInsert()  throws Exception{
        Board param = new Board();
        param.setBoardId("1");
        param.setContents("안녕");
        param.setId("준성지으닝");

        int result = mapper.getBoardInsert(param);
        System.out.println(result);
    }
}



