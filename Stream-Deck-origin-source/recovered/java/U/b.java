package U;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f9935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f9936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f9937c;

    public b(Rect cropRectBeforeScaling, Size childSizeToScale, Size originalSelectedChildSize) {
        t.g(cropRectBeforeScaling, "cropRectBeforeScaling");
        t.g(childSizeToScale, "childSizeToScale");
        t.g(originalSelectedChildSize, "originalSelectedChildSize");
        this.f9935a = cropRectBeforeScaling;
        this.f9936b = childSizeToScale;
        this.f9937c = originalSelectedChildSize;
    }

    public final Size a() {
        return this.f9936b;
    }

    public final Rect b() {
        return this.f9935a;
    }

    public final Size c() {
        return this.f9937c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.f9935a, bVar.f9935a) && t.c(this.f9936b, bVar.f9936b) && t.c(this.f9937c, bVar.f9937c);
    }

    public int hashCode() {
        return (((this.f9935a.hashCode() * 31) + this.f9936b.hashCode()) * 31) + this.f9937c.hashCode();
    }

    public String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f9935a + ", childSizeToScale=" + this.f9936b + ", originalSelectedChildSize=" + this.f9937c + ')';
    }
}
