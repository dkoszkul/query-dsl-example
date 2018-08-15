package com.example.dsl.repository.expression;

import com.example.dsl.model.QCake;
import com.querydsl.core.types.dsl.BooleanExpression;

public class CakeExpressions {

    public static BooleanExpression hasName(String name) {
        return QCake.cake.name.eq(name);
    }
}
