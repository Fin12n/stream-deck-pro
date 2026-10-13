package p061g6;

import C6.m;
import kotlin.jvm.internal.t;
import p052f6.C2314e;
import p052f6.D;
import p052f6.EnumC2316g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23809a = a.f23810a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f23810a = new a();

        /* JADX INFO: renamed from: g6.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0552a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23811a;

            static {
                int[] iArr = new int[EnumC2316g.values().length];
                try {
                    iArr[EnumC2316g.GCM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2316g.CBC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f23811a = iArr;
            }
        }

        public final f a(C2314e suite, byte[] keyMaterial) {
            t.g(suite, "suite");
            t.g(keyMaterial, "keyMaterial");
            int i8 = C0552a.f23811a[suite.b().ordinal()];
            if (i8 == 1) {
                return new d(suite, keyMaterial);
            }
            if (i8 == 2) {
                return new p061g6.a(suite, keyMaterial);
            }
            throw new m();
        }
    }

    D a(D d8);

    D b(D d8);
}
