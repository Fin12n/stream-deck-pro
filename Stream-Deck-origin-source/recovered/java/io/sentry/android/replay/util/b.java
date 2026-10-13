package io.sentry.android.replay.util;

import kotlin.jvm.internal.t;
import p128o1.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26881c = E.f30750g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f26882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26883b;

    public b(E layout, boolean z8) {
        t.g(layout, "layout");
        this.f26882a = layout;
        this.f26883b = z8;
    }

    @Override // io.sentry.android.replay.util.m
    public int a(int i8) {
        return S6.c.d(this.f26882a.v(i8));
    }

    @Override // io.sentry.android.replay.util.m
    public int b(int i8) {
        return S6.c.d(this.f26882a.m(i8));
    }

    @Override // io.sentry.android.replay.util.m
    public int d(int i8) {
        return this.f26882a.u(i8);
    }

    @Override // io.sentry.android.replay.util.m
    public int e() {
        return this.f26882a.n();
    }

    @Override // io.sentry.android.replay.util.m
    public float f(int i8, int i9) {
        float fJ = this.f26882a.j(i9, true);
        return (this.f26883b || e() != 1) ? fJ : fJ - this.f26882a.s(i8);
    }

    @Override // io.sentry.android.replay.util.m
    public Integer g() {
        return null;
    }

    @Override // io.sentry.android.replay.util.m
    public int h(int i8) {
        return this.f26882a.o(i8, true);
    }

    @Override // io.sentry.android.replay.util.m
    public int i(int i8) {
        return this.f26882a.D(i8) ? 1 : 0;
    }
}
