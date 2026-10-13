package p065h1;

import I0.g;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: h1.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2381b0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f24231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f24232b;

    public C2381b0(g gVar, Function0 function0) {
        this.f24231a = function0;
        this.f24232b = gVar;
    }

    @Override // I0.g
    public boolean a(Object obj) {
        return this.f24232b.a(obj);
    }

    @Override // I0.g
    public Map b() {
        return this.f24232b.b();
    }

    @Override // I0.g
    public Object c(String str) {
        return this.f24232b.c(str);
    }

    @Override // I0.g
    public g.a d(String str, Function0 function0) {
        return this.f24232b.d(str, function0);
    }

    public final void e() {
        this.f24231a.invoke();
    }
}
