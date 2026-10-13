package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i implements p077i4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B6.a f17878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B6.a f17879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B6.a f17880c;

    public i(B6.a aVar, B6.a aVar2, B6.a aVar3) {
        this.f17878a = aVar;
        this.f17879b = aVar2;
        this.f17880c = aVar3;
    }

    public static i a(B6.a aVar, B6.a aVar2, B6.a aVar3) {
        return new i(aVar, aVar2, aVar3);
    }

    public static SchemaManager c(Context context, String str, int i8) {
        return new SchemaManager(context, str, i8);
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SchemaManager get() {
        return c((Context) this.f17878a.get(), (String) this.f17879b.get(), ((Integer) this.f17880c.get()).intValue());
    }
}
