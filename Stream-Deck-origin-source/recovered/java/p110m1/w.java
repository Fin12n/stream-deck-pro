package p110m1;

import Q6.o;
import X6.l;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29615d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f29617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29618c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29619a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public w(String str, o oVar) {
        this.f29616a = str;
        this.f29617b = oVar;
    }

    public final String a() {
        return this.f29616a;
    }

    public final boolean b() {
        return this.f29618c;
    }

    public final Object c(Object obj, Object obj2) {
        return this.f29617b.invoke(obj, obj2);
    }

    public final void d(x xVar, l lVar, Object obj) {
        xVar.c(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f29616a;
    }

    public /* synthetic */ w(String str, o oVar, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? a.f29619a : oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(String str, boolean z8) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.f29618c = z8;
    }

    public w(String str, boolean z8, o oVar) {
        this(str, oVar);
        this.f29618c = z8;
    }
}
