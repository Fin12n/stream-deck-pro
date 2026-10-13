package s7;

import kotlin.jvm.internal.C2639q;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: s7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2918z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7.D f33308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33309b;

    /* JADX INFO: renamed from: s7.z$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements Q6.o {
        public final Boolean h(o7.f p8, int i8) {
            kotlin.jvm.internal.t.g(p8, "p0");
            return Boolean.valueOf(((C2918z) this.receiver).e(p8, i8));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return h((o7.f) obj, ((Number) obj2).intValue());
        }

        public a(Object obj) {
            super(2, obj, C2918z.class, kDsnNkYbBsI.orAPuZ, "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }
    }

    public C2918z(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        this.f33308a = new q7.D(descriptor, new a(this));
    }

    public final boolean b() {
        return this.f33309b;
    }

    public final void c(int i8) {
        this.f33308a.a(i8);
    }

    public final int d() {
        return this.f33308a.d();
    }

    public final boolean e(o7.f fVar, int i8) {
        boolean z8 = !fVar.j(i8) && fVar.i(i8).c();
        this.f33309b = z8;
        return z8;
    }
}
