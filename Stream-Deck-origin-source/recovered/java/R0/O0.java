package R0;

import android.graphics.RenderEffect;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RenderEffect f9331a;

    public /* synthetic */ O0(AbstractC2633k abstractC2633k) {
        this();
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.f9331a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.f9331a = renderEffectB;
        return renderEffectB;
    }

    public abstract RenderEffect b();

    public O0() {
    }
}
