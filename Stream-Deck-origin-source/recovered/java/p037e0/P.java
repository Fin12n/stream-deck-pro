package p037e0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC2633k;
import p010b0.h;
import p010b0.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f20058c;

    public /* synthetic */ P(AbstractC2633k abstractC2633k) {
        this();
    }

    public final int a() {
        return this.f20057b;
    }

    public final int b() {
        return this.f20056a;
    }

    public final q c() {
        return this.f20058c;
    }

    public final void d(int i8) {
        this.f20056a = i8;
    }

    public final N e(N n8, B b8) {
        n8.c(b8);
        return n8;
    }

    public P() {
        this.f20056a = RCHTTPStatusCodes.UNSUCCESSFUL;
        this.f20058c = h.a();
    }
}
