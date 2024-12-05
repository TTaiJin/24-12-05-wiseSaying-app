package com.ll.domain.wiseSaying.controller;

import com.ll.AppTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WiseSayingControllerTest {
    @Test
    @DisplayName("종료")
    public void t1() {
        String output = AppTest.run("""
                종료
                """);

        assertThat(output).contains("앱을 종료합니다.");
    }

    @Test
    @DisplayName("등록")
    public void t2() {
        String output = AppTest.run("""
                등록
                현재를 사랑하라.
                작자미상
                """);

        assertThat(output).contains("명언 : ")
                .contains("작가 : ");
    }
}
