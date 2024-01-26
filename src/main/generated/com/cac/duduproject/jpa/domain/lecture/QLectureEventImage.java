package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLectureEventImage is a Querydsl query type for LectureEventImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLectureEventImage extends EntityPathBase<LectureEventImage> {

    private static final long serialVersionUID = 1918023269L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLectureEventImage lectureEventImage = new QLectureEventImage("lectureEventImage");

    public final QLectureEvent lectureEvent;

    public final StringPath lectureEventImageCratedDate = createString("lectureEventImageCratedDate");

    public final StringPath lectureEventImageCustom = createString("lectureEventImageCustom");

    public final StringPath lectureEventImageExtension = createString("lectureEventImageExtension");

    public final NumberPath<Long> lectureEventImageNo = createNumber("lectureEventImageNo", Long.class);

    public final StringPath lectureEventImageOrigin = createString("lectureEventImageOrigin");

    public final NumberPath<Long> lectureEventImageSize = createNumber("lectureEventImageSize", Long.class);

    public final StringPath lectureEventImageType = createString("lectureEventImageType");

    public final StringPath lectureEventImageUrl = createString("lectureEventImageUrl");

    public QLectureEventImage(String variable) {
        this(LectureEventImage.class, forVariable(variable), INITS);
    }

    public QLectureEventImage(Path<? extends LectureEventImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLectureEventImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLectureEventImage(PathMetadata metadata, PathInits inits) {
        this(LectureEventImage.class, metadata, inits);
    }

    public QLectureEventImage(Class<? extends LectureEventImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lectureEvent = inits.isInitialized("lectureEvent") ? new QLectureEvent(forProperty("lectureEvent"), inits.get("lectureEvent")) : null;
    }

}

