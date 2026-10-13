package p191w0;

import A1.p;
import A1.t;
import L0.c;

/* JADX INFO: renamed from: w0.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3057e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3057e0 f35859a = new C3057e0();

    /* JADX INFO: renamed from: w0.e0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        int a(p pVar, long j8, int i8, t tVar);
    }

    /* JADX INFO: renamed from: w0.e0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        int a(p pVar, long j8, int i8);
    }

    public final b a(int i8) {
        c.a aVar = c.f4806a;
        return new C3052c(aVar.a(), aVar.j(), i8);
    }

    public final b b(int i8) {
        return new X0(c.f4806a.a(), i8);
    }

    public final b c(int i8) {
        c.a aVar = c.f4806a;
        return new C3052c(aVar.g(), aVar.j(), i8);
    }

    public final a d(int i8) {
        c.a aVar = c.f4806a;
        return new C3050b(aVar.h(), aVar.h(), i8);
    }

    public final a e(int i8) {
        return new W0(L0.a.f4797a.a(), i8);
    }

    public final a f(int i8) {
        return new W0(L0.a.f4797a.b(), i8);
    }

    public final a g(int i8) {
        c.a aVar = c.f4806a;
        return new C3050b(aVar.i(), aVar.i(), i8);
    }

    public final b h(int i8) {
        c.a aVar = c.f4806a;
        return new C3052c(aVar.j(), aVar.a(), i8);
    }

    public final b i(int i8) {
        return new X0(c.f4806a.j(), i8);
    }
}
