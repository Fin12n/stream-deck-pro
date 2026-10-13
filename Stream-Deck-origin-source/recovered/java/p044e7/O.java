package p044e7;

import G6.g;
import p035d7.d;
import p053f7.t;
import p062g7.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f20959a = new G("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f20960b = new G("PENDING");

    public static final x a(Object obj) {
        if (obj == null) {
            obj = t.f22340a;
        }
        return new N(obj);
    }

    public static final InterfaceC2260f d(M m8, g gVar, int i8, d dVar) {
        return (((i8 < 0 || i8 >= 2) && i8 != -2) || dVar != d.DROP_OLDEST) ? D.e(m8, gVar, i8, dVar) : m8;
    }
}
