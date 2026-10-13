package p065h1;

import android.view.RenderNode;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D0 f24090a = new D0();

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i8) {
        renderNode.setAmbientShadowColor(i8);
    }

    public final void d(RenderNode renderNode, int i8) {
        renderNode.setSpotShadowColor(i8);
    }
}
