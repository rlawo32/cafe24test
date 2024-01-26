package com.cac.duduproject.jpa.domain.faq;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFaqCategory is a Querydsl query type for FaqCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFaqCategory extends EntityPathBase<FaqCategory> {

    private static final long serialVersionUID = 278002354L;

    public static final QFaqCategory faqCategory = new QFaqCategory("faqCategory");

    public final StringPath faqCategoryDesc = createString("faqCategoryDesc");

    public final StringPath faqCategoryFlag = createString("faqCategoryFlag");

    public final StringPath faqCategoryName = createString("faqCategoryName");

    public final NumberPath<Long> faqCategoryNo = createNumber("faqCategoryNo", Long.class);

    public QFaqCategory(String variable) {
        super(FaqCategory.class, forVariable(variable));
    }

    public QFaqCategory(Path<? extends FaqCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFaqCategory(PathMetadata metadata) {
        super(FaqCategory.class, metadata);
    }

}

