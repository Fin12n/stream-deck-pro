package io.ktor.utils.io.jvm.javaio;

import kotlin.jvm.internal.t;
import p017b7.F;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f25541c = new i();

    @Override // p017b7.F
    public void L0(G6.g context, Runnable block) {
        t.g(context, "context");
        t.g(block, "block");
        block.run();
    }

    @Override // p017b7.F
    public boolean g1(G6.g context) {
        t.g(context, "context");
        return true;
    }
}
