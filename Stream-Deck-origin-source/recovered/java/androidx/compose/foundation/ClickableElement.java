package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p073i0.m;
import p110m1.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f14298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f14299f;

    public /* synthetic */ ClickableElement(m mVar, boolean z8, String str, h hVar, Function0 function0, AbstractC2633k abstractC2633k) {
        this(mVar, z8, str, hVar, function0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return t.c(this.f14295b, clickableElement.f14295b) && this.f14296c == clickableElement.f14296c && t.c(this.f14297d, clickableElement.f14297d) && t.c(this.f14298e, clickableElement.f14298e) && t.c(this.f14299f, clickableElement.f14299f);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = ((this.f14295b.hashCode() * 31) + Boolean.hashCode(this.f14296c)) * 31;
        String str = this.f14297d;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        h hVar = this.f14298e;
        return ((iHashCode2 + (hVar != null ? h.l(hVar.n()) : 0)) * 31) + this.f14299f.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e k() {
        return new e(this.f14295b, this.f14296c, this.f14297d, this.f14298e, this.f14299f, null);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(e eVar) {
        eVar.p2(this.f14295b, this.f14296c, this.f14297d, this.f14298e, this.f14299f);
    }

    public /* synthetic */ ClickableElement(m mVar, boolean z8, String str, h hVar, Function0 function0, int i8, AbstractC2633k abstractC2633k) {
        this(mVar, z8, str, (i8 & 8) != 0 ? null : hVar, function0, null);
    }

    public ClickableElement(m mVar, boolean z8, String str, h hVar, Function0 function0) {
        this.f14295b = mVar;
        this.f14296c = z8;
        this.f14297d = str;
        this.f14298e = hVar;
        this.f14299f = function0;
    }
}
