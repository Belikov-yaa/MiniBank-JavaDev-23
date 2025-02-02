package ru.sberbank.api.account.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Информация о изменении баланса счета")
public class ChangeBalanceDto {

    @Schema(description = "Номер счета", required = true, example = "40801810123450000001")
    private String numberAccount;
    @Schema(description = "Сумма операции изменения", required = true, example = "-20.0")
    private double changeBalance;
}
