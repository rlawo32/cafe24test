package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLectureState is a Querydsl query type for LectureState
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLectureState extends EntityPathBase<LectureState> {

    private static final long serialVersionUID = 810959501L;

    public static final QLectureState lectureState = new QLectureState("lectureState");

    public final StringPath lectureStateDesc = createString("lectureStateDesc");

    public final StringPath lectureStateName = createString("lectureStateName");

    public final NumberPath<Long> lectureStateNo = createNumber("lectureStateNo", Long.class);

    public QLectureState(String variable) {
        super(LectureState.class, forVariable(variable));
    }

    public QLectureState(Path<? extends LectureState> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLectureState(PathMetadata metadata) {
        super(LectureState.class, metadata);
    }

}

