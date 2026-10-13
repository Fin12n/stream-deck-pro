package r7;

import kotlin.jvm.internal.AbstractC2633k;
import s7.C2912t;
import s7.K;
import s7.L;
import s7.X;
import s7.a0;
import s7.d0;
import s7.e0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements p116m7.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32534d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f32535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7.c f32536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2912t f32537c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends c {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
            super(new h(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, null, 65535, null), t7.d.a(), null);
        }
    }

    public /* synthetic */ c(h hVar, t7.c cVar, AbstractC2633k abstractC2633k) {
        this(hVar, cVar);
    }

    @Override // p116m7.h
    public t7.c a() {
        return this.f32536b;
    }

    @Override // p116m7.o
    public final Object b(p116m7.a deserializer, String string) {
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        kotlin.jvm.internal.t.g(string, "string");
        a0 a0Var = new a0(string);
        Object objA = new X(this, e0.OBJ, a0Var, deserializer.getDescriptor(), null).A(deserializer);
        a0Var.v();
        return objA;
    }

    @Override // p116m7.o
    public final String c(p116m7.k serializer, Object obj) {
        kotlin.jvm.internal.t.g(serializer, "serializer");
        L l8 = new L();
        try {
            K.b(this, l8, serializer, obj);
            return l8.toString();
        } finally {
            l8.g();
        }
    }

    public final j d(p116m7.k serializer, Object obj) {
        kotlin.jvm.internal.t.g(serializer, "serializer");
        return d0.c(this, obj, serializer);
    }

    public final h e() {
        return this.f32535a;
    }

    public final C2912t f() {
        return this.f32537c;
    }

    public final j g(String string) {
        kotlin.jvm.internal.t.g(string, "string");
        return (j) b(l.f32576a, string);
    }

    public c(h hVar, t7.c cVar) {
        this.f32535a = hVar;
        this.f32536b = cVar;
        this.f32537c = new C2912t();
    }
}
