package kr.legossol.userManagement.api.userInfo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmployeeFile is a Querydsl query type for EmployeeFile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmployeeFile extends EntityPathBase<EmployeeFile> {

    private static final long serialVersionUID = -486862165L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmployeeFile employeeFile = new QEmployeeFile("employeeFile");

    public final QEmployeeUserInfo employeeUserInfo;

    public final StringPath filePath = createString("filePath");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<kr.legossol.userManagement.api.userInfo.code.CertificateFileCode> species = createEnum("species", kr.legossol.userManagement.api.userInfo.code.CertificateFileCode.class);

    public QEmployeeFile(String variable) {
        this(EmployeeFile.class, forVariable(variable), INITS);
    }

    public QEmployeeFile(Path<? extends EmployeeFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmployeeFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmployeeFile(PathMetadata metadata, PathInits inits) {
        this(EmployeeFile.class, metadata, inits);
    }

    public QEmployeeFile(Class<? extends EmployeeFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employeeUserInfo = inits.isInitialized("employeeUserInfo") ? new QEmployeeUserInfo(forProperty("employeeUserInfo")) : null;
    }

}

