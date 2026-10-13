package B5;

import A5.h;
import A5.q;
import C6.m;
import androidx.lifecycle.AbstractC1726i;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1204a;

        static {
            int[] iArr = new int[AbstractC1726i.b.values().length];
            try {
                iArr[AbstractC1726i.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1726i.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1726i.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1726i.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1726i.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1204a = iArr;
        }
    }

    /* JADX INFO: renamed from: B5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0048b extends B5.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f1205b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0048b(AbstractC1726i.a aVar, h hVar) {
            super(aVar);
            this.f1205b = hVar;
        }

        @Override // B5.a
        public void close() {
            this.f1205b.b();
        }
    }

    public static final h a(h hVar, AbstractC1726i lifecycle, AbstractC1726i.a closeEvent) {
        t.g(hVar, "<this>");
        t.g(lifecycle, "lifecycle");
        t.g(closeEvent, "closeEvent");
        lifecycle.a(new C0048b(closeEvent, hVar));
        return hVar;
    }

    public static /* synthetic */ h b(h hVar, AbstractC1726i abstractC1726i, AbstractC1726i.a aVar, int i8, Object obj) throws q {
        if ((i8 & 2) != 0) {
            int i9 = a.f1204a[abstractC1726i.b().ordinal()];
            if (i9 == 1) {
                aVar = AbstractC1726i.a.ON_DESTROY;
            } else if (i9 == 2) {
                aVar = AbstractC1726i.a.ON_STOP;
            } else {
                if (i9 != 3) {
                    if (i9 == 4 || i9 == 5) {
                        throw new q("Cannot setup lifecycle auto close after onResume", null, 2, null);
                    }
                    throw new m();
                }
                aVar = AbstractC1726i.a.ON_PAUSE;
            }
        }
        return a(hVar, abstractC1726i, aVar);
    }
}
