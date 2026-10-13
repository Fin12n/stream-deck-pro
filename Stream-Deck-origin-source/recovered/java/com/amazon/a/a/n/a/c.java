package com.amazon.a.a.n.a;

import android.os.Binder;
import android.os.RemoteException;
import com.amazon.d.a.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RemoteException f16588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f16589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.amazon.d.a.h f16590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.amazon.d.a.f f16591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.amazon.d.a.g f16592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16593g = Binder.getCallingUid();

    public c(j jVar) {
        this.f16589c = jVar;
        try {
            this.f16587a = jVar.a();
        } catch (RemoteException e8) {
            this.f16588b = e8;
        }
    }

    public String a() throws RemoteException {
        RemoteException remoteException = this.f16588b;
        if (remoteException == null) {
            return this.f16587a;
        }
        throw remoteException;
    }

    public j b() {
        return this.f16589c;
    }

    public com.amazon.d.a.h c() {
        return this.f16590d;
    }

    public com.amazon.d.a.f d() {
        return this.f16591e;
    }

    public com.amazon.d.a.g e() {
        return this.f16592f;
    }

    public int f() {
        return this.f16593g;
    }

    public String toString() {
        return "CommandResult: [CallingUid: " + this.f16593g + ", SuccessResult: " + this.f16589c + ", FailureResult: " + this.f16590d + ", DecisionResult: " + this.f16591e + ", ExceptionResult: " + this.f16592f + "]";
    }

    public c(com.amazon.d.a.h hVar) {
        this.f16590d = hVar;
        try {
            this.f16587a = hVar.a();
        } catch (RemoteException e8) {
            this.f16588b = e8;
        }
    }

    public c(com.amazon.d.a.f fVar) {
        this.f16591e = fVar;
        try {
            this.f16587a = fVar.a();
        } catch (RemoteException e8) {
            this.f16588b = e8;
        }
    }

    public c(com.amazon.d.a.g gVar) {
        this.f16592f = gVar;
    }
}
