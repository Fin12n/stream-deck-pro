package p022c3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p076i3.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l implements m, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16143d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f16145f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16140a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f16141b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f16142c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f16144e = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16146a;

        static {
            int[] iArr = new int[j.a.values().length];
            f16146a = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16146a[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16146a[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16146a[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16146a[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(j jVar) {
        this.f16143d = jVar.c();
        this.f16145f = jVar;
    }

    public final void a() {
        for (int i8 = 0; i8 < this.f16144e.size(); i8++) {
            this.f16142c.addPath(((m) this.f16144e.get(i8)).w());
        }
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
        for (int i8 = 0; i8 < this.f16144e.size(); i8++) {
            ((m) this.f16144e.get(i8)).b(list, list2);
        }
    }

    public final void c(Path.Op op) {
        this.f16141b.reset();
        this.f16140a.reset();
        for (int size = this.f16144e.size() - 1; size >= 1; size--) {
            m mVar = (m) this.f16144e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List listK = dVar.k();
                for (int size2 = listK.size() - 1; size2 >= 0; size2--) {
                    Path pathW = ((m) listK.get(size2)).w();
                    pathW.transform(dVar.l());
                    this.f16141b.addPath(pathW);
                }
            } else {
                this.f16141b.addPath(mVar.w());
            }
        }
        m mVar2 = (m) this.f16144e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List listK2 = dVar2.k();
            for (int i8 = 0; i8 < listK2.size(); i8++) {
                Path pathW2 = ((m) listK2.get(i8)).w();
                pathW2.transform(dVar2.l());
                this.f16140a.addPath(pathW2);
            }
        } else {
            this.f16140a.set(mVar2.w());
        }
        this.f16142c.op(this.f16140a, this.f16141b, op);
    }

    @Override // p022c3.j
    public void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f16144e.add((m) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // p022c3.m
    public Path w() {
        this.f16142c.reset();
        if (this.f16145f.d()) {
            return this.f16142c;
        }
        int i8 = a.f16146a[this.f16145f.b().ordinal()];
        if (i8 == 1) {
            a();
        } else if (i8 == 2) {
            c(Path.Op.UNION);
        } else if (i8 == 3) {
            c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i8 == 4) {
            c(Path.Op.INTERSECT);
        } else if (i8 == 5) {
            c(Path.Op.XOR);
        }
        return this.f16142c;
    }
}
