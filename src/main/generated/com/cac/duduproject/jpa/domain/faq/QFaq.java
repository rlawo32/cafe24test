package com.cac.duduproject.jpa.domain.faq;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFaq is a Querydsl query type for Faq
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFaq extends EntityPathBase<Faq> {

    private static final long serialVersionUID = -1004425836L;

    public static final QFaq faq = new QFaq("faq");

    public final StringPath faqCategory = createString("faqCategory");

    public final StringPath faqContent = createString("faqContent");

    public final StringPath faqCreatedDate = createString("faqCreatedDate");

    public final NumberPath<Long> faqNo = createNumber("faqNo", Long.class);

    public final StringPath faqTitle = createString("faqTitle");

    public final NumberPath<Long> faqViews = createNumber("faqViews", Long.class);

    public QFaq(String variable) {
        super(Faq.class, forVariable(variable));
    }

    public QFaq(Path<? extends Faq> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFaq(PathMetadata metadata) {
        super(Faq.class, metadata);
    }

}

