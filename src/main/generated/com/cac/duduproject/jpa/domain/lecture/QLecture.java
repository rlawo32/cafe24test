package com.cac.duduproject.jpa.domain.lecture;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLecture is a Querydsl query type for Lecture
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLecture extends EntityPathBase<Lecture> {

    private static final long serialVersionUID = 1748250724L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLecture lecture = new QLecture("lecture");

    public final NumberPath<Integer> lectureCapacity = createNumber("lectureCapacity", Integer.class);

    public final NumberPath<Integer> lectureCount = createNumber("lectureCount", Integer.class);

    public final StringPath lectureCreatedDate = createString("lectureCreatedDate");

    public final NumberPath<Integer> lectureCurrentPerson = createNumber("lectureCurrentPerson", Integer.class);

    public final StringPath lectureDescription = createString("lectureDescription");

    public final StringPath lectureDivision = createString("lectureDivision");

    public final QLectureEvent lectureEvent;

    public final StringPath lectureEventType = createString("lectureEventType");

    public final NumberPath<Long> lectureFee = createNumber("lectureFee", Long.class);

    public final ListPath<LectureImage, QLectureImage> lectureImages = this.<LectureImage, QLectureImage>createList("lectureImages", LectureImage.class, QLectureImage.class, PathInits.DIRECT2);

    public final QLectureInstitution lectureInstitution;

    public final QLectureMainCategory lectureMainCategory;

    public final NumberPath<Long> lectureNo = createNumber("lectureNo", Long.class);

    public final StringPath lecturePeriod = createString("lecturePeriod");

    public final StringPath lectureReception = createString("lectureReception");

    public final QLectureRoom lectureRoom;

    public final StringPath lectureSchedule = createString("lectureSchedule");

    public final QLectureState lectureState;

    public final QLectureSubCategory lectureSubCategory;

    public final StringPath lectureTime = createString("lectureTime");

    public final StringPath lectureTitle = createString("lectureTitle");

    public final StringPath materialsAndSignificant = createString("materialsAndSignificant");

    public final com.cac.duduproject.jpa.domain.member.QMember member;

    public QLecture(String variable) {
        this(Lecture.class, forVariable(variable), INITS);
    }

    public QLecture(Path<? extends Lecture> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLecture(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLecture(PathMetadata metadata, PathInits inits) {
        this(Lecture.class, metadata, inits);
    }

    public QLecture(Class<? extends Lecture> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lectureEvent = inits.isInitialized("lectureEvent") ? new QLectureEvent(forProperty("lectureEvent"), inits.get("lectureEvent")) : null;
        this.lectureInstitution = inits.isInitialized("lectureInstitution") ? new QLectureInstitution(forProperty("lectureInstitution")) : null;
        this.lectureMainCategory = inits.isInitialized("lectureMainCategory") ? new QLectureMainCategory(forProperty("lectureMainCategory")) : null;
        this.lectureRoom = inits.isInitialized("lectureRoom") ? new QLectureRoom(forProperty("lectureRoom"), inits.get("lectureRoom")) : null;
        this.lectureState = inits.isInitialized("lectureState") ? new QLectureState(forProperty("lectureState")) : null;
        this.lectureSubCategory = inits.isInitialized("lectureSubCategory") ? new QLectureSubCategory(forProperty("lectureSubCategory"), inits.get("lectureSubCategory")) : null;
        this.member = inits.isInitialized("member") ? new com.cac.duduproject.jpa.domain.member.QMember(forProperty("member")) : null;
    }

}

