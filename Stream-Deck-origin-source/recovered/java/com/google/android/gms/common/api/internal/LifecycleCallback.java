package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p211y4.C3105f;
import p211y4.InterfaceC3106g;
import p211y4.h0;
import p211y4.j0;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3106g f17911a;

    public LifecycleCallback(InterfaceC3106g interfaceC3106g) {
        this.f17911a = interfaceC3106g;
    }

    public static InterfaceC3106g c(Activity activity) {
        return d(new C3105f(activity));
    }

    public static InterfaceC3106g d(C3105f c3105f) {
        if (c3105f.d()) {
            return j0.E1(c3105f.b());
        }
        if (c3105f.c()) {
            return h0.f(c3105f.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    private static InterfaceC3106g getChimeraLifecycleFragmentImpl(C3105f c3105f) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public Activity b() {
        Activity activityD = this.f17911a.d();
        AbstractC3207p.k(activityD);
        return activityD;
    }

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void e(int i8, int i9, Intent intent) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
