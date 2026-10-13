package p052f6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum H {
    SSL3(768),
    TLS10(769),
    TLS11(770),
    TLS12(771);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22022b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H[] f22023c = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22029a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final H a(int i8) {
            if (768 <= i8 && i8 < 772) {
                return H.f22023c[i8 - 768];
            }
            throw new IllegalArgumentException("Invalid TLS version code " + i8);
        }

        public a() {
        }
    }

    H(int i8) {
        this.f22029a = i8;
    }

    public final int c() {
        return this.f22029a;
    }
}
