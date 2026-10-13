package p109m0;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final int a(q qVar, Object obj, int i8) {
        int iC;
        return (obj == null || qVar.d() == 0 || (i8 < qVar.d() && t.c(obj, qVar.a(i8))) || (iC = qVar.c(obj)) == -1) ? i8 : iC;
    }
}
