package io.nayasis.sample.registrylock.redis.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReqDeposit {

    private Long       id;
    private BigDecimal amount;

}
