package com.cac.duduproject.jpa.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardImage is a Querydsl query type for BoardImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardImage extends EntityPathBase<BoardImage> {

    private static final long serialVersionUID = 347516295L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardImage boardImage = new QBoardImage("boardImage");

    public final QBoard board;

    public final StringPath boardImageCratedDate = createString("boardImageCratedDate");

    public final StringPath boardImageCustom = createString("boardImageCustom");

    public final StringPath boardImageExtension = createString("boardImageExtension");

    public final NumberPath<Long> boardImageNo = createNumber("boardImageNo", Long.class);

    public final StringPath boardImageOrigin = createString("boardImageOrigin");

    public final NumberPath<Long> boardImageSize = createNumber("boardImageSize", Long.class);

    public final StringPath boardImageType = createString("boardImageType");

    public final StringPath boardImageUrl = createString("boardImageUrl");

    public QBoardImage(String variable) {
        this(BoardImage.class, forVariable(variable), INITS);
    }

    public QBoardImage(Path<? extends BoardImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardImage(PathMetadata metadata, PathInits inits) {
        this(BoardImage.class, metadata, inits);
    }

    public QBoardImage(Class<? extends BoardImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board"), inits.get("board")) : null;
    }

}

