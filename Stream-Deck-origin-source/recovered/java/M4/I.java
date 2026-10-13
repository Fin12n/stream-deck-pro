package M4;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import p140p5.AbstractC2793c;
import p140p5.C2797g;
import p219z4.C3204m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC1055i f5535i = AbstractC1055i.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f5538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p140p5.m f5539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S4.k f5540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S4.k f5541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5543h;

    public I(Context context, final p140p5.m mVar, B b8, String str) {
        new HashMap();
        new HashMap();
        this.f5536a = context.getPackageName();
        this.f5537b = AbstractC2793c.a(context);
        this.f5539d = mVar;
        this.f5538c = b8;
        T.a();
        this.f5542g = str;
        this.f5540e = C2797g.a().b(new Callable() { // from class: M4.G
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5533a.a();
            }
        });
        C2797g c2797gA = C2797g.a();
        Objects.requireNonNull(mVar);
        this.f5541f = c2797gA.b(new Callable() { // from class: M4.H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        AbstractC1055i abstractC1055i = f5535i;
        this.f5543h = abstractC1055i.containsKey(str) ? DynamiteModule.b(context, (String) abstractC1055i.get(str)) : -1;
    }

    public final /* synthetic */ String a() {
        return C3204m.a().b(this.f5542g);
    }
}
