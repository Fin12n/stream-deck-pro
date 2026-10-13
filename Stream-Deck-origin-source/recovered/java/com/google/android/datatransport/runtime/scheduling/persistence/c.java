package com.google.android.datatransport.runtime.scheduling.persistence;

import p131o4.AbstractC2753e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p077i4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B6.a f17873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B6.a f17874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B6.a f17875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B6.a f17876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B6.a f17877e;

    public c(B6.a aVar, B6.a aVar2, B6.a aVar3, B6.a aVar4, B6.a aVar5) {
        this.f17873a = aVar;
        this.f17874b = aVar2;
        this.f17875c = aVar3;
        this.f17876d = aVar4;
        this.f17877e = aVar5;
    }

    public static c a(B6.a aVar, B6.a aVar2, B6.a aVar3, B6.a aVar4, B6.a aVar5) {
        return new c(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SQLiteEventStore c(p147q4.a aVar, p147q4.a aVar2, Object obj, Object obj2, B6.a aVar3) {
        return new SQLiteEventStore(aVar, aVar2, (AbstractC2753e) obj, (SchemaManager) obj2, aVar3);
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SQLiteEventStore get() {
        return c((p147q4.a) this.f17873a.get(), (p147q4.a) this.f17874b.get(), this.f17875c.get(), this.f17876d.get(), this.f17877e);
    }
}
