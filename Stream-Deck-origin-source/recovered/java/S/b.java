package S;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f9539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f9542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f9543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9546h;

    public b(UUID uuid, int i8, int i9, Rect rect, Size size, int i10, boolean z8, boolean z9) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f9539a = uuid;
        this.f9540b = i8;
        this.f9541c = i9;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f9542d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f9543e = size;
        this.f9544f = i10;
        this.f9545g = z8;
        this.f9546h = z9;
    }

    @Override // S.f
    public Rect a() {
        return this.f9542d;
    }

    @Override // S.f
    public int b() {
        return this.f9541c;
    }

    @Override // S.f
    public int c() {
        return this.f9544f;
    }

    @Override // S.f
    public Size d() {
        return this.f9543e;
    }

    @Override // S.f
    public int e() {
        return this.f9540b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f9539a.equals(fVar.f()) && this.f9540b == fVar.e() && this.f9541c == fVar.b() && this.f9542d.equals(fVar.a()) && this.f9543e.equals(fVar.d()) && this.f9544f == fVar.c() && this.f9545g == fVar.g() && this.f9546h == fVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // S.f
    public UUID f() {
        return this.f9539a;
    }

    @Override // S.f
    public boolean g() {
        return this.f9545g;
    }

    public int hashCode() {
        return ((((((((((((((this.f9539a.hashCode() ^ 1000003) * 1000003) ^ this.f9540b) * 1000003) ^ this.f9541c) * 1000003) ^ this.f9542d.hashCode()) * 1000003) ^ this.f9543e.hashCode()) * 1000003) ^ this.f9544f) * 1000003) ^ (this.f9545g ? 1231 : 1237)) * 1000003) ^ (this.f9546h ? 1231 : 1237);
    }

    @Override // S.f
    public boolean j() {
        return this.f9546h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f9539a + ", getTargets=" + this.f9540b + ", getFormat=" + this.f9541c + ", getCropRect=" + this.f9542d + ", getSize=" + this.f9543e + ", getRotationDegrees=" + this.f9544f + ", isMirroring=" + this.f9545g + ", shouldRespectInputCropRect=" + this.f9546h + "}";
    }
}
