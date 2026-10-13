package p183v0;

import D6.r;
import D6.w;
import L0.l;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f35012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f35013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f35014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35015e;

    public i(Context context) {
        super(context);
        this.f35011a = 5;
        ArrayList arrayList = new ArrayList();
        this.f35012b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f35013c = arrayList2;
        this.f35014d = new j();
        setClipChildren(false);
        l lVar = new l(context);
        addView(lVar);
        arrayList.add(lVar);
        arrayList2.add(lVar);
        this.f35015e = 1;
        setTag(l.f4862J, Boolean.TRUE);
    }

    public final void a(a aVar) {
        aVar.o();
        l lVarB = this.f35014d.b(aVar);
        if (lVarB != null) {
            lVarB.d();
            this.f35014d.c(aVar);
            this.f35013c.add(lVarB);
        }
    }

    public final l b(a aVar) {
        l lVarB = this.f35014d.b(aVar);
        if (lVarB != null) {
            return lVarB;
        }
        l lVar = (l) w.N(this.f35013c);
        if (lVar == null) {
            if (this.f35015e > r.p(this.f35012b)) {
                lVar = new l(getContext());
                addView(lVar);
                this.f35012b.add(lVar);
            } else {
                lVar = (l) this.f35012b.get(this.f35015e);
                a aVarA = this.f35014d.a(lVar);
                if (aVarA != null) {
                    aVarA.o();
                    this.f35014d.c(aVarA);
                    lVar.d();
                }
            }
            int i8 = this.f35015e;
            if (i8 < this.f35011a - 1) {
                this.f35015e = i8 + 1;
            } else {
                this.f35015e = 0;
            }
        }
        this.f35014d.d(aVar, lVar);
        return lVar;
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }
}
