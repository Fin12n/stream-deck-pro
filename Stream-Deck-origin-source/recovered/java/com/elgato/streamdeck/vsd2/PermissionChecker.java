package com.elgato.streamdeck.vsd2;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface PermissionChecker {
    Map<PermissionRepository.Permission, PermissionState> checkPermissions(List<? extends PermissionRepository.Permission> list);
}
