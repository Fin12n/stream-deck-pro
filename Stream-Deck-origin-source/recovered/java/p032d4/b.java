package p032d4;

import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19815a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f19815a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f19815a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f19815a.equals(((b) obj).f19815a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19815a.hashCode() ^ 1000003;
    }

    public String toString() {
        return jULK.UoX + this.f19815a + "\"}";
    }
}
