package com.amazon.a.a.m;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.amazon.a.a.e.a<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f16547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f16548c;

    public a(Object obj, Date date) {
        this.f16547b = obj;
        this.f16548c = date;
    }

    @Override // com.amazon.a.a.e.a
    public final Date a() {
        return this.f16548c;
    }

    public final Object h() {
        return this.f16547b;
    }
}
