package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p068h4.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
class CreationContextFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p147q4.a f17809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p147q4.a f17810c;

    public CreationContextFactory(Context context, p147q4.a aVar, p147q4.a aVar2) {
        this.f17808a = context;
        this.f17809b = aVar;
        this.f17810c = aVar2;
    }

    public h a(String str) {
        return h.a(this.f17808a, this.f17809b, this.f17810c, str);
    }
}
