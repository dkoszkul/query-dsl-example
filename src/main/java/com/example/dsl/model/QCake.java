package com.example.dsl.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCake is a Querydsl query type for Cake
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCake extends EntityPathBase<Cake> {

    private static final long serialVersionUID = -7210273L;

    public static final QCake cake = new QCake("cake");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<Ingredient, QIngredient> ingredients = this.<Ingredient, QIngredient>createSet("ingredients", Ingredient.class, QIngredient.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QCake(String variable) {
        super(Cake.class, forVariable(variable));
    }

    public QCake(Path<? extends Cake> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCake(PathMetadata metadata) {
        super(Cake.class, metadata);
    }

}

