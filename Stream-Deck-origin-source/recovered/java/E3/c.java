package E3;

import C6.G;
import D6.r;
import D6.z;
import N6.g;
import Q6.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p082j0.T;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import q7.C2836f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends p210y3.a implements p210y3.b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8) {
            super(2);
            this.f2174b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            c.this.m(interfaceC3163l, F0.a(this.f2174b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2176b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8) {
            super(2);
            this.f2176b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            c.this.u(interfaceC3163l, F0.a(this.f2176b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public final List a(String str) {
        try {
            r7.c cVar = d.f2177a;
            cVar.a();
            return (List) cVar.b(new C2836f(e.Companion.serializer()), str);
        } catch (Throwable unused) {
            return r.n();
        }
    }

    public final String b(Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open("open_source_licenses.json");
            t.f(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Z6.c.f12941b), 8192);
            try {
                String strD = g.d(bufferedReader);
                N6.a.a(bufferedReader, null);
                return strD;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    N6.a.a(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        List listN;
        List listA;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1569748249);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(this) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1569748249, i9, -1, "com.elgato.streamdeck.settings.license.LicenseScreen.Content (LicenseScreen.kt:45)");
            }
            String strB = b((Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g()));
            if (strB == null || (listA = a(strB)) == null || (listN = z.c0(listA)) == null) {
                listN = r.n();
            }
            d.b(listN, interfaceC3163lP, 8);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(i8));
        }
    }

    @Override // p210y3.b
    public void s(T t8, InterfaceC3163l interfaceC3163l, int i8) {
        y3.b.a.a(this, t8, interfaceC3163l, i8);
    }

    @Override // p210y3.b
    public void u(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1022673062);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1022673062, i8, -1, "com.elgato.streamdeck.settings.license.LicenseScreen.Title (LicenseScreen.kt:42)");
            }
            p210y3.c.a(p194w3.b.f37037l1, null, interfaceC3163lP, 0, 2);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(i8));
        }
    }
}
