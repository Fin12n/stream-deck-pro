package N3;

import C6.v;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final V3.i d(String str, String str2) {
        String strB = V3.c.b.VIRTUAL_DEVICE_DELETE_CONFIRM.b();
        C6.o oVarA = v.a("screen_name", V3.c.d.VIRTUAL_DEVICE_DETAIL.b());
        if (str == null) {
            str = "-1";
        }
        C6.o oVarA2 = v.a("device_id", str);
        if (str2 == null) {
            str2 = "-1";
        }
        return new V3.i(new V3.h.a(strB, new C6.o[]{oVarA, oVarA2, v.a("workstation_id", str2)}, (V3.a) null, 4, (AbstractC2633k) null));
    }

    public static final V3.i e(String str, String str2) {
        String strB = V3.c.b.VIRTUAL_DEVICE_DELETE.b();
        C6.o oVarA = v.a("screen_name", V3.c.d.VIRTUAL_DEVICE_DETAIL.b());
        if (str == null) {
            str = "-1";
        }
        C6.o oVarA2 = v.a("device_id", str);
        if (str2 == null) {
            str2 = "-1";
        }
        return new V3.i(new V3.h.a(strB, new C6.o[]{oVarA, oVarA2, v.a("workstation_id", str2)}, (V3.a) null, 4, (AbstractC2633k) null));
    }

    public static final V3.h.a f(Throwable th, String str) {
        String strB;
        String strA;
        String message;
        String strB2 = V3.c.b.CREATE_DEFAULT_VIRTUAL_FAILED.b();
        C6.o oVarA = v.a("screen_name", V3.c.d.NEW_VIRTUAL_DEVICE.b());
        String str2 = "-1";
        if (str == null) {
            str = "-1";
        }
        C6.o oVarA2 = v.a("workstation_id", str);
        if (th == null || (strB = defpackage.a.b(th)) == null) {
            strB = "-1";
        }
        C6.o oVarA3 = v.a("error_type", strB);
        if (th == null || (strA = defpackage.a.a(th)) == null) {
            strA = "-1";
        }
        C6.o oVarA4 = v.a("error_code", strA);
        if (th != null && (message = th.getMessage()) != null) {
            str2 = message;
        }
        return new V3.h.a(strB2, new C6.o[]{oVarA, oVarA2, oVarA3, oVarA4, v.a("error_description", str2)}, (V3.a) null, 4, (AbstractC2633k) null);
    }
}
