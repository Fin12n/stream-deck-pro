package p025c6;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16280b;

    public a(String regexRaw, int i8, boolean z8) {
        t.g(regexRaw, "regexRaw");
        if (z8) {
            regexRaw = '(' + regexRaw + ')';
        }
        this.f16279a = regexRaw;
        this.f16280b = z8 ? i8 + 1 : i8;
    }

    public final int a() {
        return this.f16280b;
    }

    public final String b() {
        return this.f16279a;
    }

    public /* synthetic */ a(String str, int i8, boolean z8, int i9, AbstractC2633k abstractC2633k) {
        this(str, (i9 & 2) != 0 ? 0 : i8, (i9 & 4) != 0 ? false : z8);
    }
}
