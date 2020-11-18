package io.github.batetolast1.spring.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EditAdvertDTO {

    private Long advertId;
    private String title;
    private String description;
}
