package p055g0;

import p037e0.AbstractC2214j;
import p037e0.InterfaceC2213i;

/* JADX INFO: renamed from: g0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2329j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23142a = a.f23143a;

    /* JADX INFO: renamed from: g0.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f23143a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InterfaceC2213i f23144b = AbstractC2214j.g(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InterfaceC2329j f23145c = new C0536a();

        /* JADX INFO: renamed from: g0.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0536a implements InterfaceC2329j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterfaceC2213i f23146b = a.f23143a.b();

            @Override // p055g0.InterfaceC2329j
            public float a(float f8, float f9, float f10) {
                float f11 = f9 + f8;
                if (f8 >= 0.0f && f11 <= f10) {
                    return 0.0f;
                }
                if (f8 < 0.0f && f11 > f10) {
                    return 0.0f;
                }
                float f12 = f11 - f10;
                return Math.abs(f8) < Math.abs(f12) ? f8 : f12;
            }

            @Override // p055g0.InterfaceC2329j
            public InterfaceC2213i b() {
                return this.f23146b;
            }
        }

        public final InterfaceC2329j a() {
            return f23145c;
        }

        public final InterfaceC2213i b() {
            return f23144b;
        }
    }

    float a(float f8, float f9, float f10);

    InterfaceC2213i b();
}
