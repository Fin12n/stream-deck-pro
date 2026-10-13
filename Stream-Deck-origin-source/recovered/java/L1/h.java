package L1;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f4938e = new h(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4942d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static Insets a(int i8, int i9, int i10, int i11) {
            return Insets.of(i8, i9, i10, i11);
        }
    }

    public h(int i8, int i9, int i10, int i11) {
        this.f4939a = i8;
        this.f4940b = i9;
        this.f4941c = i10;
        this.f4942d = i11;
    }

    public static h a(h hVar, h hVar2) {
        return b(Math.max(hVar.f4939a, hVar2.f4939a), Math.max(hVar.f4940b, hVar2.f4940b), Math.max(hVar.f4941c, hVar2.f4941c), Math.max(hVar.f4942d, hVar2.f4942d));
    }

    public static h b(int i8, int i9, int i10, int i11) {
        return (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) ? f4938e : new h(i8, i9, i10, i11);
    }

    public static h c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static h d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f4939a, this.f4940b, this.f4941c, this.f4942d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4942d == hVar.f4942d && this.f4939a == hVar.f4939a && this.f4941c == hVar.f4941c && this.f4940b == hVar.f4940b;
    }

    public int hashCode() {
        return (((((this.f4939a * 31) + this.f4940b) * 31) + this.f4941c) * 31) + this.f4942d;
    }

    public String toString() {
        return "Insets{left=" + this.f4939a + ", top=" + this.f4940b + ", right=" + this.f4941c + ", bottom=" + this.f4942d + '}';
    }
}
