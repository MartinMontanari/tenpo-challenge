package com.tenpochallenge.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "calculator")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calculator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "number_1")
    private Long number1;

    @Column(name = "number_2")
    private Long number2;

    @Column(name = "percentage_to_apply")
    private Long percentageToApply;

    @Column(name = "total_amount")
    private Long totalAmount;
}
