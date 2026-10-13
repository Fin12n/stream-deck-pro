package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p077i4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B6.a f17819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B6.a f17820b;

    public b(B6.a aVar, B6.a aVar2) {
        this.f17819a = aVar;
        this.f17820b = aVar2;
    }

    public static b a(B6.a aVar, B6.a aVar2) {
        return new b(aVar, aVar2);
    }

    public static MetadataBackendRegistry c(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MetadataBackendRegistry get() {
        return c((Context) this.f17819a.get(), this.f17820b.get());
    }
}
