package p131o4;

import B6.a;
import android.content.Context;
import p077i4.b;
import p077i4.e;

/* JADX INFO: renamed from: o4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2755g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30924a;

    public C2755g(a aVar) {
        this.f30924a = aVar;
    }

    public static C2755g a(a aVar) {
        return new C2755g(aVar);
    }

    public static String c(Context context) {
        return (String) e.c(com.google.android.datatransport.runtime.scheduling.persistence.a.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f30924a.get());
    }
}
