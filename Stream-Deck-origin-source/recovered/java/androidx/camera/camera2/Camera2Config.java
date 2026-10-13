package androidx.camera.camera2;

import A.C0886n0;
import A.C0900v;
import A.C0904x;
import A.G;
import H.AbstractC0972c0;
import H.H;
import H.v1;
import L.m;
import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import java.util.Set;
import p166t.C2990y;
import p166t.K0;
import p166t.R0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class Camera2Config {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class DefaultProvider implements G.b {
        @Override // A.G.b
        public G getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ v1 a(Context context) {
        return new R0(context);
    }

    public static /* synthetic */ H.G b(Context context, Object obj, Set set) throws C0886n0 {
        try {
            return new K0(context, obj, set);
        } catch (C0904x e8) {
            throw new C0886n0(e8);
        }
    }

    public static G c() {
        H.a aVar = new H.a() { // from class: r.a
            @Override // H.H.a
            public final H a(Context context, AbstractC0972c0 abstractC0972c0, C0900v c0900v, long j8, G g8, m mVar) {
                return new C2990y(context, abstractC0972c0, c0900v, j8, g8, mVar);
            }
        };
        H.G.a aVar2 = new H.G.a() { // from class: r.b
            @Override // H.G.a
            public final H.G a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new G.a().c(aVar).e(aVar2).i(new v1.c() { // from class: r.c
            @Override // H.v1.c
            public final v1 a(Context context) {
                return Camera2Config.a(context);
            }
        }).d(0).f(true).a();
    }
}
