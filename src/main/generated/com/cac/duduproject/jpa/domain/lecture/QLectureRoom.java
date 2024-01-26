package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLectureRoom is a Querydsl query type for LectureRoom
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLectureRoom extends EntityPathBase<LectureRoom> {

    private static final long serialVersionUID = -666610849L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLectureRoom lectureRoom = new QLectureRoom("lectureRoom");

    public final QLectureInstitution lectureInstitution;

    public final StringPath lectureRoomContact = createString("lectureRoomContact");

    public final StringPath lectureRoomName = createString("lectureRoomName");

    public final NumberPath<Long> lectureRoomNo = createNumber("lectureRoomNo", Long.class);

    public QLectureRoom(String variable) {
        this(LectureRoom.class, forVariable(variable), INITS);
    }

    public QLectureRoom(Path<? extends LectureRoom> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLectureRoom(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLectureRoom(PathMetadata metadata, PathInits inits) {
        this(LectureRoom.class, metadata, inits);
    }

    public QLectureRoom(Class<? extends LectureRoom> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lectureInstitution = inits.isInitialized("lectureInstitution") ? new QLectureInstitution(forProperty("lectureInstitution")) : null;
    }

}

