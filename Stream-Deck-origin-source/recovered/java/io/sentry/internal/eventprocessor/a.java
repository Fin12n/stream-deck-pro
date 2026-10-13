package io.sentry.internal.eventprocessor;

import io.sentry.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f27182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f27183b;

    public a(C c8, Long l8) {
        this.f27182a = c8;
        if (l8 == null) {
            this.f27183b = Long.valueOf(System.nanoTime());
        } else {
            this.f27183b = l8;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.f27183b.compareTo(aVar.f27183b);
    }

    public C b() {
        return this.f27182a;
    }
}
