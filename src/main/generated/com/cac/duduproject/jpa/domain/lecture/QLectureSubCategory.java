package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLectureSubCategory is a Querydsl query type for LectureSubCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLectureSubCategory extends EntityPathBase<LectureSubCategory> {

    private static final long serialVersionUID = 880324698L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLectureSubCategory lectureSubCategory = new QLectureSubCategory("lectureSubCategory");

    public final QLectureMainCategory lectureMainCategory;

    public final StringPath lectureSubCategoryDesc = createString("lectureSubCategoryDesc");

    public final StringPath lectureSubCategoryName = createString("lectureSubCategoryName");

    public final NumberPath<Long> lectureSubCategoryNo = createNumber("lectureSubCategoryNo", Long.class);

    public final StringPath lectureSubCategoryThumbnail = createString("lectureSubCategoryThumbnail");

    public QLectureSubCategory(String variable) {
        this(LectureSubCategory.class, forVariable(variable), INITS);
    }

    public QLectureSubCategory(Path<? extends LectureSubCategory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLectureSubCategory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLectureSubCategory(PathMetadata metadata, PathInits inits) {
        this(LectureSubCategory.class, metadata, inits);
    }

    public QLectureSubCategory(Class<? extends LectureSubCategory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lectureMainCategory = inits.isInitialized("lectureMainCategory") ? new QLectureMainCategory(forProperty("lectureMainCategory")) : null;
    }

}

