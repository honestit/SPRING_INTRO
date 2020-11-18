package io.github.batetolast1.spring.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ShowCategoryDTO {

    private Long id;
    private String name;
    private Long advertsCount;
    private boolean allowToDelete;
}
