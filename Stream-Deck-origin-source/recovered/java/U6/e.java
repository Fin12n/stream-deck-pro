package U6;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends c implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f10245i = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10251h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public e(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f10246c = i8;
        this.f10247d = i9;
        this.f10248e = i10;
        this.f10249f = i11;
        this.f10250g = i12;
        this.f10251h = i13;
        if ((i8 | i9 | i10 | i11 | i12) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i14 = 0; i14 < 64; i14++) {
            e();
        }
    }

    @Override // U6.c
    public int b(int i8) {
        return d.h(e(), i8);
    }

    @Override // U6.c
    public int e() {
        int i8 = this.f10246c;
        int i9 = i8 ^ (i8 >>> 2);
        this.f10246c = this.f10247d;
        this.f10247d = this.f10248e;
        this.f10248e = this.f10249f;
        int i10 = this.f10250g;
        this.f10249f = i10;
        int i11 = ((i9 ^ (i9 << 1)) ^ i10) ^ (i10 << 4);
        this.f10250g = i11;
        int i12 = this.f10251h + 362437;
        this.f10251h = i12;
        return i11 + i12;
    }

    public e(int i8, int i9) {
        this(i8, i9, 0, 0, ~i8, (i8 << 10) ^ (i9 >>> 4));
    }
}
