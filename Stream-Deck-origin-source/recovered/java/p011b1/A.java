package p011b1;

import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p010b0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f15653a = new m(0, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15657d;

        public /* synthetic */ a(long j8, long j9, boolean z8, int i8, AbstractC2633k abstractC2633k) {
            this(j8, j9, z8, i8);
        }

        public final boolean a() {
            return this.f15656c;
        }

        public final long b() {
            return this.f15655b;
        }

        public final long c() {
            return this.f15654a;
        }

        public a(long j8, long j9, boolean z8, int i8) {
            this.f15654a = j8;
            this.f15655b = j9;
            this.f15656c = z8;
            this.f15657d = i8;
        }
    }

    public final void a() {
        this.f15653a.a();
    }

    public final C1760h b(B b8, O o8) {
        long jC;
        boolean zA;
        long jW;
        m mVar = new m(b8.b().size());
        List listB = b8.b();
        int size = listB.size();
        for (int i8 = 0; i8 < size; i8++) {
            C c8 = (C) listB.get(i8);
            a aVar = (a) this.f15653a.e(c8.c());
            if (aVar == null) {
                zA = false;
                jC = c8.k();
                jW = c8.f();
            } else {
                jC = aVar.c();
                zA = aVar.a();
                jW = o8.w(aVar.b());
            }
            mVar.i(c8.c(), new z(c8.c(), c8.k(), c8.f(), c8.a(), c8.h(), jC, jW, zA, false, c8.j(), c8.b(), c8.i(), c8.e(), null));
            if (c8.a()) {
                this.f15653a.i(c8.c(), new a(c8.k(), c8.g(), c8.a(), c8.j(), null));
            } else {
                this.f15653a.k(c8.c());
            }
        }
        return new C1760h(mVar, b8);
    }
}
