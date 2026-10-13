package com.elgato.streamdeck.vsd2;

import C6.v;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p044e7.AbstractC2262h;
import p044e7.M;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class PermissionRepository {
    private final x _permissions;
    private final PermissionChecker permissionChecker;
    private final M permissions;
    private final List<Permission> permissionsToCheck;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum Permission {
        CAMERA,
        LOCATION;

        private static final /* synthetic */ J6.a $ENTRIES = J6.b.a(values());

        public static J6.a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionRepository(PermissionChecker permissionChecker, List<? extends Permission> permissionsToCheck) {
        t.g(permissionChecker, "permissionChecker");
        t.g(permissionsToCheck, "permissionsToCheck");
        this.permissionChecker = permissionChecker;
        this.permissionsToCheck = permissionsToCheck;
        x xVarA = O.a(D6.M.g());
        this._permissions = xVarA;
        this.permissions = AbstractC2262h.b(xVarA);
        recheckPermissions();
    }

    public final M getPermissions() {
        return this.permissions;
    }

    public final void onPermissionResult(Permission permission, PermissionState result) {
        Object value;
        Map map;
        t.g(permission, "permission");
        t.g(result, "result");
        x xVar = this._permissions;
        do {
            value = xVar.getValue();
            map = (Map) value;
            if (!map.containsKey(permission)) {
                throw new IllegalStateException(("Permission " + permission + " not found in permissions map.").toString());
            }
        } while (!xVar.b(value, D6.M.m(map, v.a(permission, result))));
    }

    public final void recheckPermissions() {
        this._permissions.setValue(this.permissionChecker.checkPermissions(this.permissionsToCheck));
    }

    public /* synthetic */ PermissionRepository(PermissionChecker permissionChecker, List list, int i8, AbstractC2633k abstractC2633k) {
        this(permissionChecker, (i8 & 2) != 0 ? Permission.getEntries() : list);
    }
}
