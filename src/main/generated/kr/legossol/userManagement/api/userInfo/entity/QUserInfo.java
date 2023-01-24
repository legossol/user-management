package kr.legossol.userManagement.api.userInfo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserInfo is a Querydsl query type for UserInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserInfo extends EntityPathBase<UserInfo> {

    private static final long serialVersionUID = -160134918L;

    public static final QUserInfo userInfo = new QUserInfo("userInfo");

    public final StringPath cellPhone = createString("cellPhone");

    public final StringPath dateOfBirth = createString("dateOfBirth");

    public final StringPath departmentId = createString("departmentId");

    public final StringPath externalEmail = createString("externalEmail");

    public final StringPath grade = createString("grade");

    public final StringPath groupWareId = createString("groupWareId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath position = createString("position");

    public final StringPath residentRegistrationNumber = createString("residentRegistrationNumber");

    public final StringPath userId = createString("userId");

    public final StringPath workLocate = createString("workLocate");

    public final EnumPath<kr.legossol.userManagement.api.userInfo.code.WorkStateCode> workStatus = createEnum("workStatus", kr.legossol.userManagement.api.userInfo.code.WorkStateCode.class);

    public QUserInfo(String variable) {
        super(UserInfo.class, forVariable(variable));
    }

    public QUserInfo(Path<? extends UserInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserInfo(PathMetadata metadata) {
        super(UserInfo.class, metadata);
    }

}

