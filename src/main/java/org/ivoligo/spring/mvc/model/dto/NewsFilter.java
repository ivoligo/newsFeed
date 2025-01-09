package org.ivoligo.spring.mvc.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsFilter {

    private String title;
    private String content;
    private String category;
}
