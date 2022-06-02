package aog.ogsite.project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemToBasketDto {
    private Long id;
    private String item_color;
    private String item_idx;
    private String where;
    private String quantity;
}
