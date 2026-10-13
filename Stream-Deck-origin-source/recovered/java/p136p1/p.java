package p136p1;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p implements v {
    @Override // p136p1.v
    public StaticLayout a(w wVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(wVar.r(), wVar.q(), wVar.e(), wVar.o(), wVar.u());
        builderObtain.setTextDirection(wVar.s());
        builderObtain.setAlignment(wVar.a());
        builderObtain.setMaxLines(wVar.n());
        builderObtain.setEllipsize(wVar.c());
        builderObtain.setEllipsizedWidth(wVar.d());
        builderObtain.setLineSpacing(wVar.l(), wVar.m());
        builderObtain.setIncludePad(wVar.g());
        builderObtain.setBreakStrategy(wVar.b());
        builderObtain.setHyphenationFrequency(wVar.f());
        builderObtain.setIndents(wVar.i(), wVar.p());
        int i8 = Build.VERSION.SDK_INT;
        q.a(builderObtain, wVar.h());
        r.a(builderObtain, wVar.t());
        if (i8 >= 33) {
            t.b(builderObtain, wVar.j(), wVar.k());
        }
        return builderObtain.build();
    }

    @Override // p136p1.v
    public boolean b(StaticLayout staticLayout, boolean z8) {
        return Build.VERSION.SDK_INT >= 33 ? t.a(staticLayout) : z8;
    }
}
