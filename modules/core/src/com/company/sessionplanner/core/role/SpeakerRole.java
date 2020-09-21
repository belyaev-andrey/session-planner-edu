package com.company.sessionplanner.core.role;

import com.company.sessionplanner.entity.Session;
import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.EntityAccess;
import com.haulmont.cuba.security.app.role.annotation.EntityAttributeAccess;
import com.haulmont.cuba.security.app.role.annotation.Role;
import com.haulmont.cuba.security.app.role.annotation.ScreenAccess;
import com.haulmont.cuba.security.entity.EntityOp;
import com.haulmont.cuba.security.role.EntityAttributePermissionsContainer;
import com.haulmont.cuba.security.role.EntityPermissionsContainer;
import com.haulmont.cuba.security.role.ScreenPermissionsContainer;

@Role(name = SpeakerRole.NAME, description = "Speaker Role")
public class SpeakerRole extends AnnotatedRoleDefinition {
    public final static String NAME = "speaker-role";

    @ScreenAccess(screenIds = {"sessionplanner_Session.browse", "application-sessionplanner", "sessionplanner_Session.edit", "aboutWindow", "help"})
    @Override
    public ScreenPermissionsContainer screenPermissions() {
        return super.screenPermissions();
    }

    @EntityAccess(entityClass = Session.class, operations = {EntityOp.READ, EntityOp.UPDATE})
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(entityClass = Session.class, modify = {"startDate", "description"}, view = "*")
    @Override
    public EntityAttributePermissionsContainer entityAttributePermissions() {
        return super.entityAttributePermissions();
    }

}
