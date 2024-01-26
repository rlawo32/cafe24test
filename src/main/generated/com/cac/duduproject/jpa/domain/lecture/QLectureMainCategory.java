package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLectureMainCategory is a Querydsl query type for LectureMainCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLectureMainCategory extends EntityPathBase<LectureMainCategory> {

    private static final long serialVersionUID = 538274907L;

    public static final QLectureMainCategory lectureMainCategory = new QLectureMainCategory("lectureMainCategory");

    public final StringPath lectureMainCategoryDesc = createString("lectureMainCategoryDesc");

    public final StringPath lectureMainCategoryName = createString("lectureMainCategoryName");

    public final NumberPath<Long> lectureMainCategoryNo = createNumber("lectureMainCategoryNo", Long.class);

    public QLectureMainCategory(String variable) {
        super(LectureMainCategory.class, forVariable(variable));
    }

    public QLectureMainCategory(Path<? extends LectureMainCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLectureMainCategory(PathMetadata metadata) {
        super(LectureMainCategory.class, metadata);
    }

}

