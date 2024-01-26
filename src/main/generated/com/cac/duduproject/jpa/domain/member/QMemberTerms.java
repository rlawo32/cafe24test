package com.cac.duduproject.jpa.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberTerms is a Querydsl query type for MemberTerms
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberTerms extends EntityPathBase<MemberTerms> {

    private static final long serialVersionUID = -872797597L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberTerms memberTerms = new QMemberTerms("memberTerms");

    public final QMember member;

    public final StringPath memberTermsAgree1 = createString("memberTermsAgree1");

    public final StringPath memberTermsAgree2 = createString("memberTermsAgree2");

    public final StringPath memberTermsAgree3 = createString("memberTermsAgree3");

    public final StringPath memberTermsDate = createString("memberTermsDate");

    public final NumberPath<Long> memberTermsNo = createNumber("memberTermsNo", Long.class);

    public QMemberTerms(String variable) {
        this(MemberTerms.class, forVariable(variable), INITS);
    }

    public QMemberTerms(Path<? extends MemberTerms> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberTerms(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberTerms(PathMetadata metadata, PathInits inits) {
        this(MemberTerms.class, metadata, inits);
    }

    public QMemberTerms(Class<? extends MemberTerms> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

