package p191w0;

import A1.p;
import L0.c;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: w0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3052c implements C3057e0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.InterfaceC0174c f35808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.InterfaceC0174c f35809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35810c;

    public C3052c(c.InterfaceC0174c interfaceC0174c, c.InterfaceC0174c interfaceC0174c2, int i8) {
        this.f35808a = interfaceC0174c;
        this.f35809b = interfaceC0174c2;
        this.f35810c = i8;
    }

    @Override // p191w0.C3057e0.b
    public int a(p pVar, long j8, int i8) {
        int iA = this.f35809b.a(0, pVar.c());
        return pVar.f() + iA + (-this.f35808a.a(0, i8)) + this.f35810c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3052c)) {
            return false;
        }
        C3052c c3052c = (C3052c) obj;
        return t.c(this.f35808a, c3052c.f35808a) && t.c(this.f35809b, c3052c.f35809b) && this.f35810c == c3052c.f35810c;
    }

    public int hashCode() {
        return (((this.f35808a.hashCode() * 31) + this.f35809b.hashCode()) * 31) + Integer.hashCode(this.f35810c);
    }

    public String toString() {
        return "Vertical(menuAlignment=" + this.f35808a + ", anchorAlignment=" + this.f35809b + ", offset=" + this.f35810c + ')';
    }
}
