package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p077i4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B6.a f17816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B6.a f17817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B6.a f17818c;

    public a(B6.a aVar, B6.a aVar2, B6.a aVar3) {
        this.f17816a = aVar;
        this.f17817b = aVar2;
        this.f17818c = aVar3;
    }

    public static a a(B6.a aVar, B6.a aVar2, B6.a aVar3) {
        return new a(aVar, aVar2, aVar3);
    }

    public static CreationContextFactory c(Context context, p147q4.a aVar, p147q4.a aVar2) {
        return new CreationContextFactory(context, aVar, aVar2);
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CreationContextFactory get() {
        return c((Context) this.f17816a.get(), (p147q4.a) this.f17817b.get(), (p147q4.a) this.f17818c.get());
    }
}
