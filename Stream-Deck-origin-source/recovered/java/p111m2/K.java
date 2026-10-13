package p111m2;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC1724g;
import androidx.lifecycle.L;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.r;
import p153r2.a;
import p153r2.b;
import p217z2.d;
import p217z2.e;
import p217z2.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class K implements InterfaceC1724g, f, S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentCallbacksC2681f f29713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f29714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P.c f29715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f29716d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f29717e = null;

    public K(ComponentCallbacksC2681f componentCallbacksC2681f, Q q8) {
        this.f29713a = componentCallbacksC2681f;
        this.f29714b = q8;
    }

    public void a(AbstractC1726i.a aVar) {
        this.f29716d.i(aVar);
    }

    public void c() {
        if (this.f29716d == null) {
            this.f29716d = new r(this);
            e eVarA = e.a(this);
            this.f29717e = eVarA;
            eVarA.c();
            I.c(this);
        }
    }

    public boolean d() {
        return this.f29716d != null;
    }

    public void e(Bundle bundle) {
        this.f29717e.d(bundle);
    }

    @Override // androidx.lifecycle.InterfaceC1724g
    public P.c f() {
        Application application;
        P.c cVarF = this.f29713a.f();
        if (!cVarF.equals(this.f29713a.f29867h0)) {
            this.f29715c = cVarF;
            return cVarF;
        }
        if (this.f29715c == null) {
            Context applicationContext = this.f29713a.o1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f29715c = new L(application, this, this.f29713a.r());
        }
        return this.f29715c;
    }

    @Override // androidx.lifecycle.InterfaceC1724g
    public a g() {
        Application application;
        Context applicationContext = this.f29713a.o1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        b bVar = new b();
        if (application != null) {
            bVar.c(P.a.f15249h, application);
        }
        bVar.c(I.f15227a, this);
        bVar.c(I.f15228b, this);
        if (this.f29713a.r() != null) {
            bVar.c(I.f15229c, this.f29713a.r());
        }
        return bVar;
    }

    public void h(Bundle bundle) {
        this.f29717e.e(bundle);
    }

    public void i(AbstractC1726i.b bVar) {
        this.f29716d.n(bVar);
    }

    @Override // androidx.lifecycle.S
    public Q k() {
        c();
        return this.f29714b;
    }

    @Override // p217z2.f
    public d l() {
        c();
        return this.f29717e.b();
    }

    @Override // androidx.lifecycle.InterfaceC1733p
    public AbstractC1726i w() {
        c();
        return this.f29716d;
    }
}
