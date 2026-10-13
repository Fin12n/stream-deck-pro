package p099l;

import U1.S;
import U1.T;
import U1.U;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f28884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f28885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28886e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28883b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U f28887f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28882a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28888a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28889b = 0;

        public a() {
        }

        @Override // U1.U, U1.T
        public void b(View view) {
            int i8 = this.f28889b + 1;
            this.f28889b = i8;
            if (i8 == h.this.f28882a.size()) {
                T t8 = h.this.f28885d;
                if (t8 != null) {
                    t8.b(null);
                }
                d();
            }
        }

        @Override // U1.U, U1.T
        public void c(View view) {
            if (this.f28888a) {
                return;
            }
            this.f28888a = true;
            T t8 = h.this.f28885d;
            if (t8 != null) {
                t8.c(null);
            }
        }

        public void d() {
            this.f28889b = 0;
            this.f28888a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f28886e) {
            Iterator it = this.f28882a.iterator();
            while (it.hasNext()) {
                ((S) it.next()).c();
            }
            this.f28886e = false;
        }
    }

    public void b() {
        this.f28886e = false;
    }

    public h c(S s8) {
        if (!this.f28886e) {
            this.f28882a.add(s8);
        }
        return this;
    }

    public h d(S s8, S s9) {
        this.f28882a.add(s8);
        s9.i(s8.d());
        this.f28882a.add(s9);
        return this;
    }

    public h e(long j8) {
        if (!this.f28886e) {
            this.f28883b = j8;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f28886e) {
            this.f28884c = interpolator;
        }
        return this;
    }

    public h g(T t8) {
        if (!this.f28886e) {
            this.f28885d = t8;
        }
        return this;
    }

    public void h() {
        if (this.f28886e) {
            return;
        }
        for (S s8 : this.f28882a) {
            long j8 = this.f28883b;
            if (j8 >= 0) {
                s8.e(j8);
            }
            Interpolator interpolator = this.f28884c;
            if (interpolator != null) {
                s8.f(interpolator);
            }
            if (this.f28885d != null) {
                s8.g(this.f28887f);
            }
            s8.k();
        }
        this.f28886e = true;
    }
}
