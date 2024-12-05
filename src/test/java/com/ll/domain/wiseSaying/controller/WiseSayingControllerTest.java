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
}
