package o7;

import C6.G;
import D6.C0934n;
import Z6.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import q7.F0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31000a = new a();

        public a() {
            super(1);
        }

        public final void b(o7.a aVar) {
            t.g(aVar, "$this$null");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o7.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31001a = new b();

        public b() {
            super(1);
        }

        public final void b(o7.a aVar) {
            t.g(aVar, "$this$null");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o7.a) obj);
            return G.f1419a;
        }
    }

    public static final f a(String serialName, e kind) {
        t.g(serialName, "serialName");
        t.g(kind, "kind");
        if (w.b0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return F0.a(serialName, kind);
    }

    public static final f b(String serialName, f[] typeParameters, Q6.k builderAction) {
        t.g(serialName, "serialName");
        t.g(typeParameters, "typeParameters");
        t.g(builderAction, "builderAction");
        if (w.b0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        o7.a aVar = new o7.a(serialName);
        builderAction.invoke(aVar);
        return new g(serialName, k.a.f31004a, aVar.f().size(), C0934n.r0(typeParameters), aVar);
    }

    public static /* synthetic */ f c(String str, f[] fVarArr, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            kVar = a.f31000a;
        }
        return b(str, fVarArr, kVar);
    }

    public static final f d(String serialName, j kind, f[] typeParameters, Q6.k builder) {
        t.g(serialName, "serialName");
        t.g(kind, "kind");
        t.g(typeParameters, "typeParameters");
        t.g(builder, "builder");
        if (w.b0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (t.c(kind, k.a.f31004a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        o7.a aVar = new o7.a(serialName);
        builder.invoke(aVar);
        return new g(serialName, kind, aVar.f().size(), C0934n.r0(typeParameters), aVar);
    }

    public static /* synthetic */ f e(String str, j jVar, f[] fVarArr, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            kVar = b.f31001a;
        }
        return d(str, jVar, fVarArr, kVar);
    }
}
