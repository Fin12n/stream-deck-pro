package G;

import A.AbstractC0882l0;
import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class B implements Q.A {
    @Override // Q.A
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q.B apply(Q.B b8) {
        androidx.camera.core.f fVar = new androidx.camera.core.f(AbstractC0882l0.a(b8.h().getWidth(), b8.h().getHeight(), 256, 2));
        androidx.camera.core.d dVarE = ImageProcessingUtil.e(fVar, (byte[]) b8.c());
        fVar.d();
        Objects.requireNonNull(dVarE);
        I.f fVarD = b8.d();
        Objects.requireNonNull(fVarD);
        return Q.B.j(dVarE, fVarD, b8.b(), b8.f(), b8.g(), b8.a());
    }
}
