package com.cac.duduproject.jpa.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -1892381644L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoard board = new QBoard("board");

    public final StringPath boardCategory = createString("boardCategory");

    public final StringPath boardContent = createString("boardContent");

    public final StringPath boardCreatedDate = createString("boardCreatedDate");

    public final NumberPath<Long> boardNo = createNumber("boardNo", Long.class);

    public final StringPath boardTitle = createString("boardTitle");

    public final com.cac.duduproject.jpa.domain.lecture.QLectureInstitution lectureInstitution;

    public QBoard(String variable) {
        this(Board.class, forVariable(variable), INITS);
    }

    public QBoard(Path<? extends Board> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoard(PathMetadata metadata, PathInits inits) {
        this(Board.class, metadata, inits);
    }

    public QBoard(Class<? extends Board> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lectureInstitution = inits.isInitialized("lectureInstitution") ? new com.cac.duduproject.jpa.domain.lecture.QLectureInstitution(forProperty("lectureInstitution")) : null;
    }

}

