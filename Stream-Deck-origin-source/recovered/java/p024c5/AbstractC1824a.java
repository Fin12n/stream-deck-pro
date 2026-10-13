package p024c5;

import java.util.Set;
import p087j5.b;

/* JADX INFO: renamed from: c5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1824a implements d {
    @Override // p024c5.d
    public Object a(Class cls) {
        b bVarB = b(cls);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }

    @Override // p024c5.d
    public Set d(Class cls) {
        return (Set) c(cls).get();
    }
}
