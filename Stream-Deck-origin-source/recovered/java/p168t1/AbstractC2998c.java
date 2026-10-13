package p168t1;

import C6.q;
import G6.d;
import H6.b;
import H6.c;
import K1.h;
import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.t;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;

/* JADX INFO: renamed from: t1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2998c {

    /* JADX INFO: renamed from: t1.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f34037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M f34038b;

        public a(InterfaceC1795l interfaceC1795l, M m8) {
            this.f34037a = interfaceC1795l;
            this.f34038b = m8;
        }

        @Override // K1.h.e
        public void f(int i8) {
            this.f34037a.f(new IllegalStateException("Unable to load font " + this.f34038b + " (reason=" + i8 + ')'));
        }

        @Override // K1.h.e
        public void g(Typeface typeface) {
            this.f34037a.resumeWith(q.b(typeface));
        }
    }

    public static final Typeface c(M m8, Context context) {
        Typeface typefaceF = h.f(context, m8.d());
        t.d(typefaceF);
        return typefaceF;
    }

    public static final Object d(M m8, Context context, d dVar) {
        C1797m c1797m = new C1797m(b.c(dVar), 1);
        c1797m.z();
        h.h(context, m8.d(), new a(c1797m, m8), null);
        Object objS = c1797m.s();
        if (objS == c.f()) {
            I6.h.c(dVar);
        }
        return objS;
    }
}
