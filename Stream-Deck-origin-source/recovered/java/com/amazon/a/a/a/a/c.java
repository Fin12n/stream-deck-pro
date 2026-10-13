package com.amazon.a.a.a.a;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c implements com.amazon.a.a.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f16324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Application f16325b;

    public c(d dVar, Application application) {
        this.f16324a = dVar;
        this.f16325b = application;
    }

    public Application b() {
        return this.f16325b;
    }

    @Override // com.amazon.a.a.c.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d a() {
        return this.f16324a;
    }
}
