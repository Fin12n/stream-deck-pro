package P3;

import C6.G;
import C6.r;
import D6.C0938s;
import E4.JFpq.XRlnZWSrAFn;
import N3.p;
import X5.T;
import Z6.u;
import Z6.w;
import com.elgato.streamdeck.vsd2.AppSettings;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.Endpoint;
import com.elgato.streamdeck.vsd2.StaticHost;
import com.google.protobuf.GeneratedMessageLite;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f8889a;

        /* JADX INFO: renamed from: P3.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0248a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f8890a;

            /* JADX INFO: renamed from: P3.g$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0249a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f8891a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f8892b;

                public C0249a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f8891a = obj;
                    this.f8892b |= Integer.MIN_VALUE;
                    return C0248a.this.emit(null, this);
                }
            }

            public C0248a(InterfaceC2261g interfaceC2261g) {
                this.f8890a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0249a c0249a;
                if (dVar instanceof C0249a) {
                    c0249a = (C0249a) dVar;
                    int i8 = c0249a.f8892b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0249a.f8892b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0249a = new C0249a(dVar);
                    }
                } else {
                    c0249a = new C0249a(dVar);
                }
                Object obj2 = c0249a.f8891a;
                Object objF = H6.c.f();
                int i9 = c0249a.f8892b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f8890a;
                    List<StaticHost> staticHostList = ((AppSettings) obj).getStaticHostList();
                    t.f(staticHostList, "getStaticHostList(...)");
                    ArrayList arrayList = new ArrayList(C0938s.y(staticHostList, 10));
                    for (StaticHost staticHost : staticHostList) {
                        t.d(staticHost);
                        arrayList.add(g.e(staticHost));
                    }
                    c0249a.f8892b = 1;
                    if (interfaceC2261g.emit(arrayList, c0249a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public a(InterfaceC2260f interfaceC2260f) {
            this.f8889a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f8889a.collect(new C0248a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    public static final StaticHost a(StaticHost.Builder builder, e data) {
        t.g(builder, "<this>");
        t.g(data, "data");
        GeneratedMessageLite generatedMessageLiteBuild = StaticHost.newBuilder().setRawID(data.b()).addAllEndpoint(data.a()).build();
        t.f(generatedMessageLiteBuild, "build(...)");
        return (StaticHost) generatedMessageLiteBuild;
    }

    public static final List b(T t8, String str) {
        List listC = t8.h().c(str);
        if (listC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            List listA0 = w.A0((String) it.next(), new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, null);
            if (listA0.size() < 2) {
                listA0 = null;
            }
            if (listA0 != null) {
                arrayList.add(listA0);
            }
        }
        return arrayList;
    }

    public static final e c(T t8) {
        List<List> listB;
        ArrayList arrayList;
        t.g(t8, "<this>");
        String strD = t8.h().d("w");
        if (strD == null) {
            return null;
        }
        String strB = i.b(strD);
        if (t8.h().d("av2") != null) {
            List<List> listB2 = b(t8, "av2");
            if (listB2 == null) {
                return null;
            }
            arrayList = new ArrayList(C0938s.y(listB2, 10));
            for (List list : listB2) {
                String str = (String) list.get(0);
                Integer numM = u.m((String) list.get(1));
                arrayList.add(f.a(str, numM != null ? numM.intValue() : 28198, Endpoint.Source.STATIC));
            }
        } else {
            if (t8.h().d("a") == null || (listB = b(t8, "a")) == null) {
                return null;
            }
            arrayList = new ArrayList(C0938s.y(listB, 10));
            for (List list2 : listB) {
                String str2 = (String) list2.get(0);
                Integer numM2 = u.m((String) list2.get(1));
                arrayList.add(f.a(str2, numM2 != null ? numM2.intValue() : 28197, Endpoint.Source.STATIC));
            }
        }
        return new e(strB, arrayList, null);
    }

    public static final InterfaceC2260f d(AppSettingsStore appSettingsStore) {
        t.g(appSettingsStore, "<this>");
        return new a(appSettingsStore.getData());
    }

    public static final p e(StaticHost staticHost) {
        t.g(staticHost, XRlnZWSrAFn.XqGiCxQtCO);
        String rawID = staticHost.getRawID();
        t.f(rawID, "getRawID(...)");
        String strB = i.b(rawID);
        String displayName = staticHost.getDisplayName();
        t.f(displayName, "getDisplayName(...)");
        List<Endpoint> endpointList = staticHost.getEndpointList();
        t.f(endpointList, "getEndpointList(...)");
        return new p(strB, displayName, endpointList, null);
    }
}
