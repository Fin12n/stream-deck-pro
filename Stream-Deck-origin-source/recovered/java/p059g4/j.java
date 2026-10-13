package p059g4;

import p032d4.b;
import p032d4.c;
import p032d4.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public abstract j a();

        public abstract a b(b bVar);

        public abstract a c(c cVar);

        public abstract a d(e eVar);

        public abstract a e(com.google.android.datatransport.runtime.e eVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new b.C0550b();
    }

    public abstract b b();

    public abstract c c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    public abstract e e();

    public abstract com.google.android.datatransport.runtime.e f();

    public abstract String g();
}
