package kr.legossol.userManagement.api.userInfo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmergencyContact is a Querydsl query type for EmergencyContact
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmergencyContact extends EntityPathBase<EmergencyContact> {

    private static final long serialVersionUID = 1127871024L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmergencyContact emergencyContact = new QEmergencyContact("emergencyContact");

    public final StringPath contactNumber = createString("contactNumber");

    public final QEmployeeUserInfo employeeUserInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<kr.legossol.userManagement.api.userInfo.code.RelateCode> relation = createEnum("relation", kr.legossol.userManagement.api.userInfo.code.RelateCode.class);

    public QEmergencyContact(String variable) {
        this(EmergencyContact.class, forVariable(variable), INITS);
    }

    public QEmergencyContact(Path<? extends EmergencyContact> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmergencyContact(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmergencyContact(PathMetadata metadata, PathInits inits) {
        this(EmergencyContact.class, metadata, inits);
    }

    public QEmergencyContact(Class<? extends EmergencyContact> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employeeUserInfo = inits.isInitialized("employeeUserInfo") ? new QEmployeeUserInfo(forProperty("employeeUserInfo")) : null;
    }

}

