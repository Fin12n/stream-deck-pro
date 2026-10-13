package io.sentry.android.replay.util;

import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1598l0 f26895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26896b;

    public /* synthetic */ l(C1598l0 c1598l0, boolean z8, AbstractC2633k abstractC2633k) {
        this(c1598l0, z8);
    }

    public final C1598l0 a() {
        return this.f26895a;
    }

    public final boolean b() {
        return this.f26896b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return t.c(this.f26895a, lVar.f26895a) && this.f26896b == lVar.f26896b;
    }

    public int hashCode() {
        C1598l0 c1598l0 = this.f26895a;
        return ((c1598l0 == null ? 0 : C1598l0.w(c1598l0.y())) * 31) + Boolean.hashCode(this.f26896b);
    }

    public String toString() {
        return "TextAttributes(color=" + this.f26895a + ", hasFillModifier=" + this.f26896b + ')';
    }

    public l(C1598l0 c1598l0, boolean z8) {
        this.f26895a = c1598l0;
        this.f26896b = z8;
    }
}
