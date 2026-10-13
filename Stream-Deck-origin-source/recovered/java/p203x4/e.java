package p203x4;

import S4.k;
import S4.l;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Collections;
import p211y4.AbstractC3113n;
import p211y4.B;
import p211y4.C3100a;
import p211y4.C3101b;
import p211y4.C3104e;
import p211y4.C3117s;
import p211y4.G;
import p211y4.InterfaceC3112m;
import p211y4.ServiceConnectionC3108i;
import p211y4.U;
import p219z4.AbstractC3194c;
import p219z4.AbstractC3207p;
import p219z4.C3195d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p203x4.a f37386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x4.a.d f37387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3101b f37388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f37389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f37391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3112m f37392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3104e f37393j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f37394c = new C0841a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC3112m f37395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f37396b;

        /* JADX INFO: renamed from: x4.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class C0841a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public InterfaceC3112m f37397a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Looper f37398b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f37397a == null) {
                    this.f37397a = new C3100a();
                }
                if (this.f37398b == null) {
                    this.f37398b = Looper.getMainLooper();
                }
                return new a(this.f37397a, this.f37398b);
            }

            public C0841a b(Looper looper) {
                AbstractC3207p.l(looper, "Looper must not be null.");
                this.f37398b = looper;
                return this;
            }

            public C0841a c(InterfaceC3112m interfaceC3112m) {
                AbstractC3207p.l(interfaceC3112m, "StatusExceptionMapper must not be null.");
                this.f37397a = interfaceC3112m;
                return this;
            }
        }

        public a(InterfaceC3112m interfaceC3112m, Account account, Looper looper) {
            this.f37395a = interfaceC3112m;
            this.f37396b = looper;
        }
    }

    public e(Activity activity, p203x4.a aVar, x4.a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    @Override // p203x4.g
    public final C3101b d() {
        return this.f37388e;
    }

    public C3195d.a e() {
        C3195d.a aVar = new C3195d.a();
        aVar.d(null);
        aVar.c(Collections.EMPTY_SET);
        aVar.e(this.f37384a.getClass().getName());
        aVar.b(this.f37384a.getPackageName());
        return aVar;
    }

    public k f(AbstractC3113n abstractC3113n) {
        return m(2, abstractC3113n);
    }

    public k g(AbstractC3113n abstractC3113n) {
        return m(0, abstractC3113n);
    }

    public String h(Context context) {
        return null;
    }

    public String i() {
        return this.f37385b;
    }

    public final int j() {
        return this.f37390g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x4.a.f k(Looper looper, B b8) {
        C3195d c3195dA = e().a();
        x4.a.f fVarA = ((p203x4.a.AbstractC0839a) AbstractC3207p.k(this.f37386c.a())).a(this.f37384a, looper, c3195dA, this.f37387d, b8, b8);
        String strI = i();
        if (strI != null && (fVarA instanceof AbstractC3194c)) {
            ((AbstractC3194c) fVarA).O(strI);
        }
        if (strI != null && (fVarA instanceof ServiceConnectionC3108i)) {
            ((ServiceConnectionC3108i) fVarA).r(strI);
        }
        return fVarA;
    }

    public final U l(Context context, Handler handler) {
        return new U(context, handler, e().a());
    }

    public final k m(int i8, AbstractC3113n abstractC3113n) {
        l lVar = new l();
        this.f37393j.z(this, i8, abstractC3113n, lVar, this.f37392i);
        return lVar.a();
    }

    @Deprecated
    public e(Activity activity, p203x4.a aVar, x4.a.d dVar, InterfaceC3112m interfaceC3112m) {
        a.C0841a c0841a = new a.C0841a();
        c0841a.c(interfaceC3112m);
        c0841a.b(activity.getMainLooper());
        this(activity, aVar, dVar, c0841a.a());
    }

    public e(Context context, Activity activity, p203x4.a aVar, x4.a.d dVar, a aVar2) {
        String strH;
        AbstractC3207p.l(context, "Null context is not permitted.");
        AbstractC3207p.l(aVar, "Api must not be null.");
        AbstractC3207p.l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC3207p.l(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f37384a = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            strH = context.getAttributionTag();
        } else {
            strH = h(context);
        }
        this.f37385b = strH;
        this.f37386c = aVar;
        this.f37387d = dVar;
        this.f37389f = aVar2.f37396b;
        C3101b c3101bA = C3101b.a(aVar, dVar, strH);
        this.f37388e = c3101bA;
        this.f37391h = new G(this);
        C3104e c3104eT = C3104e.t(context2);
        this.f37393j = c3104eT;
        this.f37390g = c3104eT.k();
        this.f37392i = aVar2.f37395a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C3117s.u(activity, c3104eT, c3101bA);
        }
        c3104eT.D(this);
    }

    @Deprecated
    public e(Context context, p203x4.a aVar, x4.a.d dVar, Looper looper, InterfaceC3112m interfaceC3112m) {
        a.C0841a c0841a = new a.C0841a();
        c0841a.b(looper);
        c0841a.c(interfaceC3112m);
        this(context, aVar, dVar, c0841a.a());
    }

    public e(Context context, p203x4.a aVar, x4.a.d dVar, a aVar2) {
        this(context, (Activity) null, aVar, dVar, aVar2);
    }

    @Deprecated
    public e(Context context, p203x4.a aVar, x4.a.d dVar, InterfaceC3112m interfaceC3112m) {
        a.C0841a c0841a = new a.C0841a();
        c0841a.c(interfaceC3112m);
        this(context, aVar, dVar, c0841a.a());
    }
}
