package com.testweb.springboot.dto;

import com.testweb.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void Lombok_기능_테스트(){
        //Given
        String name = "test";
        int amount = 1000;

        //When
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //Then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
