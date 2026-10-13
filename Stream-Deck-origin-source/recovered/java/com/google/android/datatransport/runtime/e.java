package com.google.android.datatransport.runtime;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public abstract e a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(p032d4.d dVar);
    }

    public static a a() {
        return new b.C0423b().d(p032d4.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract p032d4.d d();

    public boolean e() {
        return c() != null;
    }

    public e f(p032d4.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
