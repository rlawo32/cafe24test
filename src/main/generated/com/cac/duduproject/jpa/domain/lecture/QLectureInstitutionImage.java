package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLectureInstitutionImage is a Querydsl query type for LectureInstitutionImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLectureInstitutionImage extends EntityPathBase<LectureInstitutionImage> {

    private static final long serialVersionUID = 339481351L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLectureInstitutionImage lectureInstitutionImage = new QLectureInstitutionImage("lectureInstitutionImage");

    public final StringPath institutionImageCratedDate = createString("institutionImageCratedDate");

    public final StringPath institutionImageCustom = createString("institutionImageCustom");

    public final StringPath institutionImageExtension = createString("institutionImageExtension");

    public final NumberPath<Long> institutionImageNo = createNumber("institutionImageNo", Long.class);

    public final StringPath institutionImageOrigin = createString("institutionImageOrigin");

    public final NumberPath<Long> institutionImageSize = createNumber("institutionImageSize", Long.class);

    public final StringPath institutionImageType = createString("institutionImageType");

    public final StringPath institutionImageUrl = createString("institutionImageUrl");

    public final QLectureInstitution lectureInstitution;

    public QLectureInstitutionImage(String variable) {
        this(LectureInstitutionImage.class, forVariable(variable), INITS);
    }

    public QLectureInstitutionImage(Path<? extends LectureInstitutionImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLectureInstitutionImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLectureInstitutionImage(PathMetadata metadata, PathInits inits) {
        this(LectureInstitutionImage.class, metadata, inits);
    }

    public QLectureInstitutionImage(Class<? extends LectureInstitutionImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lectureInstitution = inits.isInitialized("lectureInstitution") ? new QLectureInstitution(forProperty("lectureInstitution")) : null;
    }

}

