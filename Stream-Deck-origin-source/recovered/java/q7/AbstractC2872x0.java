package q7;

import java.util.ArrayList;

/* JADX INFO: renamed from: q7.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2872x0 {
    public static final void a(int i8, int i9, o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i10 = (~i8) & i9;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(descriptor.g(i11));
            }
            i10 >>>= 1;
        }
        throw new p116m7.c(arrayList, descriptor.a());
    }
}
