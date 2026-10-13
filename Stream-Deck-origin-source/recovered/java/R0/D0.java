package R0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends D0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H0 f9294a;

        public a(H0 h8) {
            super(null);
            this.f9294a = h8;
        }

        public final H0 a() {
            return this.f9294a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.t.c(this.f9294a, ((a) obj).f9294a);
        }

        public int hashCode() {
            return this.f9294a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends D0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q0.h f9295a;

        public b(Q0.h hVar) {
            super(null);
            this.f9295a = hVar;
        }

        public final Q0.h a() {
            return this.f9295a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.t.c(this.f9295a, ((b) obj).f9295a);
        }

        public int hashCode() {
            return this.f9295a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends D0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q0.j f9296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final H0 f9297b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Q0.j jVar) {
            super(0 == true ? 1 : 0);
            H0 h0A = null;
            this.f9296a = jVar;
            if (!E0.f(jVar)) {
                h0A = T.a();
                h0A.i(jVar);
            }
            this.f9297b = h0A;
        }

        public final Q0.j a() {
            return this.f9296a;
        }

        public final H0 b() {
            return this.f9297b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.t.c(this.f9296a, ((c) obj).f9296a);
        }

        public int hashCode() {
            return this.f9296a.hashCode();
        }
    }

    public /* synthetic */ D0(AbstractC2633k abstractC2633k) {
        this();
    }

    public D0() {
    }
}
