package p036e;

import kotlin.jvm.internal.t;
import p045f.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.e f19997a = c.b.f21232a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.e f19998a = c.b.f21232a;

        public final h a() {
            h hVar = new h();
            hVar.b(this.f19998a);
            return hVar;
        }

        public final a b(c.e mediaType) {
            t.g(mediaType, "mediaType");
            this.f19998a = mediaType;
            return this;
        }
    }

    public final c.e a() {
        return this.f19997a;
    }

    public final void b(c.e eVar) {
        t.g(eVar, "<set-?>");
        this.f19997a = eVar;
    }
}
