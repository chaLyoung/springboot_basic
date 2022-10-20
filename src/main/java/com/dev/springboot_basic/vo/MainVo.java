package com.dev.springboot_basic.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 모든 필드값을 파라미터로 받는 생성자를 만듦
@NoArgsConstructor //파라미터가 없는 기본 생성자를 생성
@Builder
public class MainVo {
    private String id;
    private String password;
    private String name;
}
