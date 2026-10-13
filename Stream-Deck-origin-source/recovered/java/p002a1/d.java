package p002a1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p047f1.e;
import p047f1.l;
import p056g1.InterfaceC2346j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f13020a = e.a(a.f13021a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13021a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return null;
        }
    }

    public static final l a() {
        return f13020a;
    }

    public static final InterfaceC2346j b(p002a1.a aVar, b bVar) {
        return new c(aVar, bVar);
    }
}
