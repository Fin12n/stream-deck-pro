package R0;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: R0.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1600m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9420b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorFilter f9421a;

    /* JADX INFO: renamed from: R0.m0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ C1600m0 b(a aVar, long j8, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = X.f9354a.z();
            }
            return aVar.a(j8, i8);
        }

        public final C1600m0 a(long j8, int i8) {
            return new Y(j8, i8, (AbstractC2633k) null);
        }

        public a() {
        }
    }

    public C1600m0(ColorFilter colorFilter) {
        this.f9421a = colorFilter;
    }

    public final ColorFilter a() {
        return this.f9421a;
    }
}
