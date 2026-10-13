package R0;

import android.graphics.Shader;

/* JADX INFO: renamed from: R0.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1584e0 {

    /* JADX INFO: renamed from: R0.e0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends P0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Shader f9395e;

        public a(Shader shader) {
            this.f9395e = shader;
        }

        @Override // R0.P0
        public Shader b(long j8) {
            return this.f9395e;
        }
    }

    public static final P0 a(Shader shader) {
        return new a(shader);
    }
}
