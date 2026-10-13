package Z6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum l implements e {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    f12973g(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    f12975i(128, 0, 2, null);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ J6.a f12977k = J6.b.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12979b;

    l(int i8, int i9) {
        this.f12978a = i8;
        this.f12979b = i9;
    }

    @Override // Z6.e
    public int getValue() {
        return this.f12978a;
    }

    /* synthetic */ l(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this(i8, (i10 & 2) != 0 ? i8 : i9);
    }
}
