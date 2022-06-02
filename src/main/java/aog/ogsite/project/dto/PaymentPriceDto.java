package aog.ogsite.project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentPriceDto {
    private int total_price;
    private int tobepaid_price;
    private double earnMileage;
    private int used_mileage;
}
