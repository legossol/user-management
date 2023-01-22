package kr.legossol.userManagement.api.userInfo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmployeeUserInfo is a Querydsl query type for EmployeeUserInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmployeeUserInfo extends EntityPathBase<EmployeeUserInfo> {

    private static final long serialVersionUID = 279172296L;

    public static final QEmployeeUserInfo employeeUserInfo = new QEmployeeUserInfo("employeeUserInfo");

    public final StringPath cellPhone = createString("cellPhone");

    public final StringPath dateOfBirth = createString("dateOfBirth");

    public final NumberPath<Integer> departmentId = createNumber("departmentId", Integer.class);

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

    public QEmployeeUserInfo(String variable) {
        super(EmployeeUserInfo.class, forVariable(variable));
    }

    public QEmployeeUserInfo(Path<? extends EmployeeUserInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmployeeUserInfo(PathMetadata metadata) {
        super(EmployeeUserInfo.class, metadata);
    }

}

