package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCertificateItem is a Querydsl query type for CertificateItem
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCertificateItem extends EntityPathBase<CertificateItem> {

    private static final long serialVersionUID = -874420318L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCertificateItem certificateItem = new QCertificateItem("certificateItem");

    public final DatePath<java.time.LocalDate> acquisitionDate = createDate("acquisitionDate", java.time.LocalDate.class);

    public final QCertificate certificate;

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imagePath = createString("imagePath");

    public final StringPath institution = createString("institution");

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath name = createString("name");

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QCertificateItem(String variable) {
        this(CertificateItem.class, forVariable(variable), INITS);
    }

    public QCertificateItem(Path<? extends CertificateItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCertificateItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCertificateItem(PathMetadata metadata, PathInits inits) {
        this(CertificateItem.class, metadata, inits);
    }

    public QCertificateItem(Class<? extends CertificateItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.certificate = inits.isInitialized("certificate") ? new QCertificate(forProperty("certificate")) : null;
    }

}

