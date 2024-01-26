package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLectureImage is a Querydsl query type for LectureImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLectureImage extends EntityPathBase<LectureImage> {

    private static final long serialVersionUID = 801515351L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLectureImage lectureImage = new QLectureImage("lectureImage");

    public final QLecture lecture;

    public final StringPath lectureImageCratedDate = createString("lectureImageCratedDate");

    public final StringPath lectureImageCustom = createString("lectureImageCustom");

    public final StringPath lectureImageExtension = createString("lectureImageExtension");

    public final NumberPath<Long> lectureImageNo = createNumber("lectureImageNo", Long.class);

    public final StringPath lectureImageOrigin = createString("lectureImageOrigin");

    public final NumberPath<Long> lectureImageSize = createNumber("lectureImageSize", Long.class);

    public final StringPath lectureImageType = createString("lectureImageType");

    public final StringPath lectureImageUrl = createString("lectureImageUrl");

    public QLectureImage(String variable) {
        this(LectureImage.class, forVariable(variable), INITS);
    }

    public QLectureImage(Path<? extends LectureImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLectureImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLectureImage(PathMetadata metadata, PathInits inits) {
        this(LectureImage.class, metadata, inits);
    }

    public QLectureImage(Class<? extends LectureImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lecture = inits.isInitialized("lecture") ? new QLecture(forProperty("lecture"), inits.get("lecture")) : null;
    }

}

