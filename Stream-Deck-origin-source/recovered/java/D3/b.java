package D3;

import D6.r;
import W6.i;
import W6.n;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0071b f1837d = new C0071b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f1838e = r.q(new d(), new a(), new e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1841c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends b {
        public a() {
            super(p194w3.b.f37021g0, 5, 3, null);
        }
    }

    /* JADX INFO: renamed from: D3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0071b {
        public /* synthetic */ C0071b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b a(int i8, int i9, boolean z8) {
            if (z8) {
                for (b bVar : b()) {
                    if (bVar.b() == i8 && bVar.d() == i9) {
                        return bVar;
                    }
                }
            }
            return new c(i8, i9);
        }

        public final List b() {
            return b.f1838e;
        }

        public C0071b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends b {
        public c(int i8, int i9) {
            super(p194w3.b.f37024h0, n.l(i8, new i(1, 8)), n.l(i9, new i(1, 8)), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends b {
        public d() {
            super(p194w3.b.f37027i0, 3, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends b {
        public e() {
            super(p194w3.b.f37030j0, 8, 4, null);
        }
    }

    public /* synthetic */ b(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this(i8, i9, i10);
    }

    public final int b() {
        return this.f1840b;
    }

    public final int c() {
        return this.f1839a;
    }

    public final int d() {
        return this.f1841c;
    }

    public b(int i8, int i9, int i10) {
        this.f1839a = i8;
        this.f1840b = i9;
        this.f1841c = i10;
    }
}
