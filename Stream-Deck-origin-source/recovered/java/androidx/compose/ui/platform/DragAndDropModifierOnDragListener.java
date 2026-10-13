package androidx.compose.ui.platform;

import Q6.k;
import Q6.p;
import android.view.DragEvent;
import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.u;
import p010b0.C1749b;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropModifierOnDragListener implements View.OnDragListener, N0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f14883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N0.e f14884b = new N0.e(a.f14887a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1749b f14885c = new C1749b(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.i f14886d = new U() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // p056g1.U
        public int hashCode() {
            return this.f14888b.f14884b.hashCode();
        }

        @Override // p056g1.U
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public N0.e k() {
            return this.f14888b.f14884b;
        }

        @Override // p056g1.U
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void p(N0.e eVar) {
        }
    };

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14887a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final N0.g invoke(N0.b bVar) {
            return null;
        }
    }

    public DragAndDropModifierOnDragListener(p pVar) {
        this.f14883a = pVar;
    }

    @Override // N0.c
    public void a(N0.d dVar) {
        this.f14885c.add(dVar);
    }

    @Override // N0.c
    public boolean b(N0.d dVar) {
        return this.f14885c.contains(dVar);
    }

    public L0.i d() {
        return this.f14886d;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        N0.b bVar = new N0.b(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zD2 = this.f14884b.d2(bVar);
                Iterator<E> it = this.f14885c.iterator();
                while (it.hasNext()) {
                    ((N0.d) it.next()).P(bVar);
                }
                return zD2;
            case 2:
                this.f14884b.N(bVar);
                return false;
            case 3:
                return this.f14884b.F(bVar);
            case 4:
                this.f14884b.J0(bVar);
                return false;
            case 5:
                this.f14884b.z0(bVar);
                return false;
            case 6:
                this.f14884b.T0(bVar);
                return false;
            default:
                return false;
        }
    }
}
