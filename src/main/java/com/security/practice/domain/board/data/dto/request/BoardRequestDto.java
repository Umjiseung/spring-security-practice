package com.security.practice.domain.board.data.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardRequestDto {
    private final String title;
    private final String content;
    private final String password;
}
