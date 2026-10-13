package L0;

import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f4830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f4831c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4832a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, i.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public f(i iVar, i iVar2) {
        this.f4830b = iVar;
        this.f4831c = iVar2;
    }

    @Override // L0.i
    public boolean a(Q6.k kVar) {
        return this.f4830b.a(kVar) && this.f4831c.a(kVar);
    }

    @Override // L0.i
    public Object b(Object obj, Q6.o oVar) {
        return this.f4831c.b(this.f4830b.b(obj, oVar), oVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return t.c(this.f4830b, fVar.f4830b) && t.c(this.f4831c, fVar.f4831c);
    }

    public int hashCode() {
        return this.f4830b.hashCode() + (this.f4831c.hashCode() * 31);
    }

    public final i k() {
        return this.f4831c;
    }

    public final i p() {
        return this.f4830b;
    }

    public String toString() {
        return '[' + ((String) b("", a.f4832a)) + ']';
    }
}
