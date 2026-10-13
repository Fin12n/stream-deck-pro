package G3;

import D6.C0938s;
import D6.L;
import android.content.Context;
import com.elgato.streamdeck.vsd2.PermissionChecker;
import com.elgato.streamdeck.vsd2.PermissionRepository;
import com.elgato.streamdeck.vsd2.PermissionState;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements PermissionChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2716a;

    public a(Context context) {
        t.g(context, "context");
        this.f2716a = context;
    }

    public final PermissionState a(PermissionRepository.Permission permission) {
        return this.f2716a.checkSelfPermission(b.a(permission)) == 0 ? PermissionState.Granted.INSTANCE : PermissionState.Rejected.INSTANCE;
    }

    @Override // com.elgato.streamdeck.vsd2.PermissionChecker
    public Map checkPermissions(List permissions) {
        t.g(permissions, "permissions");
        LinkedHashMap linkedHashMap = new LinkedHashMap(W6.n.d(L.d(C0938s.y(permissions, 10)), 16));
        for (Object obj : permissions) {
            linkedHashMap.put(obj, a((PermissionRepository.Permission) obj));
        }
        return linkedHashMap;
    }
}
