package r7;

import kotlin.jvm.internal.AbstractC2633k;
import s7.b0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.f f32586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32587c;

    public /* synthetic */ q(Object obj, boolean z8, o7.f fVar, int i8, AbstractC2633k abstractC2633k) {
        this(obj, z8, (i8 & 4) != 0 ? null : fVar);
    }

    @Override // r7.y
    public String c() {
        return this.f32587c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return m() == qVar.m() && kotlin.jvm.internal.t.c(c(), qVar.c());
    }

    public int hashCode() {
        return (Boolean.hashCode(m()) * 31) + c().hashCode();
    }

    @Override // r7.y
    public boolean m() {
        return this.f32585a;
    }

    public final o7.f o() {
        return this.f32586b;
    }

    @Override // r7.y
    public String toString() {
        if (!m()) {
            return c();
        }
        StringBuilder sb = new StringBuilder();
        b0.c(sb, c());
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object body, boolean z8, o7.f fVar) {
        super(null);
        kotlin.jvm.internal.t.g(body, "body");
        this.f32585a = z8;
        this.f32586b = fVar;
        this.f32587c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
