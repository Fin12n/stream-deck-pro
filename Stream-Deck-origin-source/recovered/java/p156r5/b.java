package p156r5;

import java.util.concurrent.Executor;
import p219z4.AbstractC3206o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f32520c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32521a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f32522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f32523c;

        public b a() {
            return new b(this.f32521a, this.f32522b, this.f32523c, null, null);
        }

        public a b(int i8, int... iArr) {
            this.f32521a = i8;
            if (iArr != null) {
                for (int i9 : iArr) {
                    this.f32521a = i9 | this.f32521a;
                }
            }
            return this;
        }
    }

    public /* synthetic */ b(int i8, boolean z8, Executor executor, d dVar, e eVar) {
        this.f32518a = i8;
        this.f32519b = z8;
        this.f32520c = executor;
    }

    public final int a() {
        return this.f32518a;
    }

    public final d b() {
        return null;
    }

    public final Executor c() {
        return this.f32520c;
    }

    public final boolean d() {
        return this.f32519b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f32518a == bVar.f32518a && this.f32519b == bVar.f32519b && AbstractC3206o.a(this.f32520c, bVar.f32520c) && AbstractC3206o.a(null, null);
    }

    public int hashCode() {
        return AbstractC3206o.b(Integer.valueOf(this.f32518a), Boolean.valueOf(this.f32519b), this.f32520c, null);
    }
}
