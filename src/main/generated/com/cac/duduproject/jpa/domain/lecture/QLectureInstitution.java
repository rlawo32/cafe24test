package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLectureInstitution is a Querydsl query type for LectureInstitution
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLectureInstitution extends EntityPathBase<LectureInstitution> {

    private static final long serialVersionUID = 407221940L;

    public static final QLectureInstitution lectureInstitution = new QLectureInstitution("lectureInstitution");

    public final StringPath institutionContact = createString("institutionContact");

    public final StringPath institutionName = createString("institutionName");

    public final NumberPath<Long> institutionNo = createNumber("institutionNo", Long.class);

    public final StringPath institutionPosition = createString("institutionPosition");

    public QLectureInstitution(String variable) {
        super(LectureInstitution.class, forVariable(variable));
    }

    public QLectureInstitution(Path<? extends LectureInstitution> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLectureInstitution(PathMetadata metadata) {
        super(LectureInstitution.class, metadata);
    }

}

