package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLectureEvent is a Querydsl query type for LectureEvent
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLectureEvent extends EntityPathBase<LectureEvent> {

    private static final long serialVersionUID = 798093462L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLectureEvent lectureEvent = new QLectureEvent("lectureEvent");

    public final StringPath lectureEventCreatedDate = createString("lectureEventCreatedDate");

    public final StringPath lectureEventDesc = createString("lectureEventDesc");

    public final ListPath<LectureEventImage, QLectureEventImage> lectureEventImages = this.<LectureEventImage, QLectureEventImage>createList("lectureEventImages", LectureEventImage.class, QLectureEventImage.class, PathInits.DIRECT2);

    public final StringPath lectureEventName = createString("lectureEventName");

    public final NumberPath<Long> lectureEventNo = createNumber("lectureEventNo", Long.class);

    public final StringPath lectureEventThumbnail = createString("lectureEventThumbnail");

    public final StringPath lectureEventType = createString("lectureEventType");

    public final QLectureInstitution lectureInstitution;

    public QLectureEvent(String variable) {
        this(LectureEvent.class, forVariable(variable), INITS);
    }

    public QLectureEvent(Path<? extends LectureEvent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLectureEvent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLectureEvent(PathMetadata metadata, PathInits inits) {
        this(LectureEvent.class, metadata, inits);
    }

    public QLectureEvent(Class<? extends LectureEvent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lectureInstitution = inits.isInitialized("lectureInstitution") ? new QLectureInstitution(forProperty("lectureInstitution")) : null;
    }

}

