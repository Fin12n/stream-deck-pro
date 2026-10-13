package androidx.compose.ui.input.nestedscroll;

import kotlin.jvm.internal.t;
import p002a1.b;
import p002a1.c;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p002a1.a f14727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f14728c;

    public NestedScrollElement(p002a1.a aVar, b bVar) {
        this.f14727b = aVar;
        this.f14728c = bVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return t.c(nestedScrollElement.f14727b, this.f14727b) && t.c(nestedScrollElement.f14728c, this.f14728c);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = this.f14727b.hashCode() * 31;
        b bVar = this.f14728c;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public c k() {
        return new c(this.f14727b, this.f14728c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(c cVar) {
        cVar.k2(this.f14727b, this.f14728c);
    }
}
