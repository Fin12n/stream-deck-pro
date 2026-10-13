package p052f6;

import kotlin.jvm.internal.t;
import p079i6.b;

/* JADX INFO: renamed from: f6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2315f {
    public static final boolean a(C2314e c2314e) {
        t.g(c2314e, "<this>");
        String strB = b.a().b();
        int iHashCode = strB.hashCode();
        if (iHashCode == 46676283) {
            return !strB.equals("1.6.0") || b.a().c() >= 181 || c2314e.i() <= 128;
        }
        if (iHashCode != 46677244) {
            return iHashCode != 46678205 || !strB.equals("1.8.0") || b.a().c() >= 161 || c2314e.i() <= 128;
        }
        return !strB.equals("1.7.0") || b.a().c() >= 171 || c2314e.i() <= 128;
        return true;
    }
}
