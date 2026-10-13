package p004a3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f13174b;

    public O(Object obj) {
        this.f13173a = obj;
        this.f13174b = null;
    }

    public Throwable a() {
        return this.f13174b;
    }

    public Object b() {
        return this.f13173a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o8 = (O) obj;
        if (b() != null && b().equals(o8.b())) {
            return true;
        }
        if (a() == null || o8.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public O(Throwable th) {
        this.f13174b = th;
        this.f13173a = null;
    }
}
