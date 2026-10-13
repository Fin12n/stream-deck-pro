package C3;

import C6.o;
import C6.v;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final V3.h.a a(f.a eventAddCustomFaceplate, String str, String str2) {
        t.g(eventAddCustomFaceplate, "$this$eventAddCustomFaceplate");
        String strB = V3.c.b.ADD_CUSTOM_FACEPLATE.b();
        o oVarA = v.a("screen_name", V3.c.d.FACEPLATE.b());
        if (str == null) {
            str = "-1";
        }
        o oVarA2 = v.a("device_id", str);
        if (str2 == null) {
            str2 = "-1";
        }
        return new V3.h.a(strB, new o[]{oVarA, oVarA2, v.a("workstation_id", str2)}, (V3.a) null, 4, (AbstractC2633k) null);
    }
}
