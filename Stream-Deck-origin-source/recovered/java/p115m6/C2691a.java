package p115m6;

import T0.Vl.PCRzgdeK;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: m6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2691a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30073a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2691a.class == obj.getClass() && t.c(this.f30073a, ((C2691a) obj).f30073a);
    }

    public int hashCode() {
        return this.f30073a.hashCode();
    }

    public String toString() {
        return "AttributeKey: " + this.f30073a;
    }

    public C2691a(String str) {
        t.g(str, PCRzgdeK.zfOQrliRxr);
        this.f30073a = str;
        if (str.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }
}
