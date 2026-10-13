package p040e3;

import Q6.k;
import kotlin.jvm.internal.t;
import p130o3.b;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f20717d;

        public a(k kVar) {
            this.f20717d = kVar;
        }

        @Override // p130o3.c
        public Object a(b frameInfo) {
            t.g(frameInfo, "frameInfo");
            return this.f20717d.invoke(frameInfo);
        }
    }

    public static final a b(k kVar) {
        return new a(kVar);
    }
}
