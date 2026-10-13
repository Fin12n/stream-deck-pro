package p166t;

import A.AbstractC0890p0;
import A.AbstractC0902w;
import H.AbstractC0995o;
import H.I;
import H.InterfaceC1001r0;
import H.Z0;
import I.c;
import I.t;
import L.m;
import T1.f;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import androidx.lifecycle.AbstractC1737u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p174u.n;
import p182v.e;
import p190w.a;
import p214z.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Y implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f33575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f33576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2984w f33578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f33579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f33580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f33581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f33582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f33584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z0 f33585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC1001r0 f33586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p174u.t f33587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f33588o;

    public Y(String str, p174u.t tVar) {
        this(str, tVar, m.f4781b);
    }

    public final void A() {
        String str;
        int iW = w();
        if (iW == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iW == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iW == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iW == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iW != 4) {
            str = "Unknown value: " + iW;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        AbstractC0890p0.e("Camera2CameraInfo", "Device Level: " + str);
    }

    public void B(AbstractC1737u abstractC1737u) {
        this.f33583j.s(abstractC1737u);
    }

    @Override // H.I
    public Set a() {
        int[] iArrD = this.f33575b.e().d();
        if (iArrD == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i8 : iArrD) {
            hashSet.add(Integer.valueOf(i8));
        }
        return hashSet;
    }

    @Override // A.InterfaceC0896t
    public AbstractC1737u b() {
        return this.f33583j;
    }

    @Override // H.I
    public Set c() {
        return e.a(this.f33575b).c();
    }

    @Override // A.InterfaceC0896t
    public int d() {
        return l(0);
    }

    @Override // H.I
    public String e() {
        return this.f33574a;
    }

    @Override // H.I
    public void f(AbstractC0995o abstractC0995o) {
        synchronized (this.f33577d) {
            try {
                C2984w c2984w = this.f33578e;
                if (c2984w != null) {
                    c2984w.U(abstractC0995o);
                    return;
                }
                List list = this.f33584k;
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC0995o) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H.I
    public Rect h() {
        Rect rect = (Rect) this.f33575b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) f.g(rect);
    }

    @Override // A.InterfaceC0896t
    public int i() {
        Integer num = (Integer) this.f33575b.a(CameraCharacteristics.LENS_FACING);
        f.b(num != null, "Unable to get the lens facing of the camera.");
        return F1.a(num.intValue());
    }

    @Override // A.InterfaceC0896t
    public String j() {
        return w() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // H.I
    public List k(int i8) {
        Size[] sizeArrA = this.f33575b.e().a(i8);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // A.InterfaceC0896t
    public int l(int i8) {
        return c.a(c.b(i8), v(), 1 == i());
    }

    @Override // H.I
    public Object m() {
        return this.f33575b.j();
    }

    @Override // H.I
    public Z0 o() {
        return this.f33585l;
    }

    @Override // H.I
    public List p(int i8) {
        Size[] sizeArrF = this.f33575b.e().f(i8);
        return sizeArrF != null ? Arrays.asList(sizeArrF) : Collections.EMPTY_LIST;
    }

    @Override // H.I
    public void q(Executor executor, AbstractC0995o abstractC0995o) {
        synchronized (this.f33577d) {
            try {
                C2984w c2984w = this.f33578e;
                if (c2984w != null) {
                    c2984w.u(executor, abstractC0995o);
                    return;
                }
                if (this.f33584k == null) {
                    this.f33584k = new ArrayList();
                }
                this.f33584k.add(new Pair(abstractC0995o, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H.I
    public Set s() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.f33575b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i8 : iArr) {
                hashSet.add(Integer.valueOf(i8));
            }
        }
        return hashSet;
    }

    public h t() {
        return this.f33576c;
    }

    public n u() {
        return this.f33575b;
    }

    public int v() {
        Integer num = (Integer) this.f33575b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        f.g(num);
        return num.intValue();
    }

    public int w() {
        Integer num = (Integer) this.f33575b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        f.g(num);
        return num.intValue();
    }

    public boolean x() {
        return H1.b(this.f33575b);
    }

    public void y(C2984w c2984w) {
        synchronized (this.f33577d) {
            try {
                this.f33578e = c2984w;
                t tVar = this.f33582i;
                if (tVar != null) {
                    tVar.s(c2984w.K().d());
                }
                t tVar2 = this.f33579f;
                if (tVar2 != null) {
                    tVar2.s(this.f33578e.I().d());
                }
                t tVar3 = this.f33580g;
                if (tVar3 != null) {
                    tVar3.s(this.f33578e.I().e());
                }
                t tVar4 = this.f33581h;
                if (tVar4 != null) {
                    tVar4.s(this.f33578e.A().c());
                }
                List<Pair> list = this.f33584k;
                if (list != null) {
                    for (Pair pair : list) {
                        this.f33578e.u((Executor) pair.second, (AbstractC0995o) pair.first);
                    }
                    this.f33584k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z();
    }

    public final void z() {
        A();
    }

    public Y(String str, p174u.t tVar, m mVar) {
        this.f33577d = new Object();
        this.f33579f = null;
        this.f33580g = null;
        this.f33581h = null;
        this.f33582i = null;
        this.f33584k = null;
        String str2 = (String) f.g(str);
        this.f33574a = str2;
        this.f33587n = tVar;
        n nVarC = tVar.c(str2);
        this.f33575b = nVarC;
        this.f33576c = new h(this);
        Z0 z0A = a.a(str, nVarC);
        this.f33585l = z0A;
        this.f33586m = new L0(str, z0A);
        this.f33583j = new t(AbstractC0902w.a(AbstractC0902w.b.CLOSED));
        this.f33588o = mVar;
    }
}
