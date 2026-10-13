package p211y4;

import p203x4.a;
import p219z4.AbstractC3206o;

/* JADX INFO: renamed from: y4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f38341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.d f38342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38343d;

    public C3101b(a aVar, a.d dVar, String str) {
        this.f38341b = aVar;
        this.f38342c = dVar;
        this.f38343d = str;
        this.f38340a = AbstractC3206o.b(aVar, dVar, str);
    }

    public static C3101b a(a aVar, a.d dVar, String str) {
        return new C3101b(aVar, dVar, str);
    }

    public final String b() {
        return this.f38341b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3101b)) {
            return false;
        }
        C3101b c3101b = (C3101b) obj;
        return AbstractC3206o.a(this.f38341b, c3101b.f38341b) && AbstractC3206o.a(this.f38342c, c3101b.f38342c) && AbstractC3206o.a(this.f38343d, c3101b.f38343d);
    }

    public final int hashCode() {
        return this.f38340a;
    }
}
