package me.hibiki.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 高弘昆
 * @date 2020/5/7 15:43
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ApplyExtend extends Apply{
    private User user;
}
