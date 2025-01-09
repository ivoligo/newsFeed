package org.ivoligo.spring.mvc.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsDto {

    private String title;
    private String content;
    private String date;
    private String category;
}
