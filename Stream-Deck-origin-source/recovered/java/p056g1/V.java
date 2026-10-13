package p056g1;

import B0.d;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23492c = d.f896d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f23493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f23494b;

    public V(d dVar, Function0 function0) {
        this.f23493a = dVar;
        this.f23494b = function0;
    }

    public final void a(int i8, Object obj) {
        this.f23493a.c(i8, obj);
        this.f23494b.invoke();
    }

    public final List b() {
        return this.f23493a.k();
    }

    public final void c() {
        this.f23493a.m();
        this.f23494b.invoke();
    }

    public final Object d(int i8) {
        return this.f23493a.r()[i8];
    }

    public final int e() {
        return this.f23493a.s();
    }

    public final d f() {
        return this.f23493a;
    }

    public final Object g(int i8) {
        Object objD = this.f23493a.D(i8);
        this.f23494b.invoke();
        return objD;
    }
}
