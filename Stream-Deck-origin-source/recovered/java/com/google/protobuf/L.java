package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f19205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19207c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0.b f19208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f19209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0.b f19210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f19211d;

        public a(C0.b bVar, Object obj, C0.b bVar2, Object obj2) {
            this.f19208a = bVar;
            this.f19209b = obj;
            this.f19210c = bVar2;
            this.f19211d = obj2;
        }
    }

    public L(C0.b bVar, Object obj, C0.b bVar2, Object obj2) {
        this.f19205a = new a(bVar, obj, bVar2, obj2);
        this.f19206b = obj;
        this.f19207c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C2110v.d(aVar.f19208a, 1, obj) + C2110v.d(aVar.f19210c, 2, obj2);
    }

    public static L d(C0.b bVar, Object obj, C0.b bVar2, Object obj2) {
        return new L(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC2100k abstractC2100k, a aVar, Object obj, Object obj2) {
        C2110v.E(abstractC2100k, aVar.f19208a, 1, obj);
        C2110v.E(abstractC2100k, aVar.f19210c, 2, obj2);
    }

    public int a(int i8, Object obj, Object obj2) {
        return AbstractC2100k.V(i8) + AbstractC2100k.D(b(this.f19205a, obj, obj2));
    }

    public a c() {
        return this.f19205a;
    }
}
