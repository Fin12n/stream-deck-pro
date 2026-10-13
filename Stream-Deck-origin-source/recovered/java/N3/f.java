package N3;

import C6.G;
import C6.InterfaceC0919h;
import D6.C0937q;
import D6.C0938s;
import D6.L;
import D6.z;
import R0.pkXL.Oitvkwcwn;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import com.elgato.streamdeck.vsd2.AppSettings;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.Endpoint;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.streamdeck.vsd2.connection.CryptoBox;
import com.elgato.vsd2.Messages;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiFunction;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.InterfaceC2636n;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1823z0;
import p017b7.B0;
import p017b7.I;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p017b7.Q;
import p017b7.S0;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.O;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f5845p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Z2.j f5846q = Z2.j.f12858c.d("DiscoveryService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N3.b f5847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppSettingsStore f5848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M3.o f5849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CryptoBox f5850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M3.p f5851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p098k7.d f5853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f5854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J f5855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p098k7.a f5856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p044e7.x f5857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p044e7.x f5858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f5859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f5860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f5861o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KnownHost f5864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f5865d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return F6.a.a(Long.valueOf(((KnownHost.Device) obj2).getLastOpenedAt().getSeconds()), Long.valueOf(((KnownHost.Device) obj).getLastOpenedAt().getSeconds()));
            }
        }

        public /* synthetic */ b(String str, String str2, KnownHost knownHost, boolean z8, AbstractC2633k abstractC2633k) {
            this(str, str2, knownHost, z8);
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, KnownHost knownHost, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = bVar.f5862a;
            }
            if ((i8 & 2) != 0) {
                str2 = bVar.f5863b;
            }
            if ((i8 & 4) != 0) {
                knownHost = bVar.f5864c;
            }
            if ((i8 & 8) != 0) {
                z8 = bVar.f5865d;
            }
            return bVar.b(str, str2, knownHost, z8);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            kotlin.jvm.internal.t.g(other, "other");
            KnownHost knownHost = other.f5864c;
            if (kotlin.jvm.internal.t.c(this, other)) {
                return 0;
            }
            KnownHost knownHost2 = this.f5864c;
            if (knownHost2 != null && knownHost == null) {
                return 1;
            }
            if (knownHost2 != null || knownHost == null) {
                return (knownHost2 == null || knownHost == null) ? this.f5863b.compareTo(other.f5863b) : kotlin.jvm.internal.t.i(knownHost2.getUpdatedAt().getSeconds(), knownHost.getUpdatedAt().getSeconds());
            }
            return -1;
        }

        public final b b(String id, String displayName, KnownHost knownHost, boolean z8) {
            kotlin.jvm.internal.t.g(id, "id");
            kotlin.jvm.internal.t.g(displayName, "displayName");
            return new b(id, displayName, knownHost, z8, null);
        }

        public final List d() {
            List<KnownHost.Device> devicesList;
            List listJ0;
            KnownHost knownHost = this.f5864c;
            return (knownHost == null || (devicesList = knownHost.getDevicesList()) == null || (listJ0 = z.J0(devicesList, new a())) == null) ? D6.r.n() : listJ0;
        }

        public final String e() {
            return this.f5863b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return P3.i.d(this.f5862a, bVar.f5862a) && kotlin.jvm.internal.t.c(this.f5863b, bVar.f5863b) && kotlin.jvm.internal.t.c(this.f5864c, bVar.f5864c) && this.f5865d == bVar.f5865d;
        }

        public int hashCode() {
            int iE = ((P3.i.e(this.f5862a) * 31) + this.f5863b.hashCode()) * 31;
            KnownHost knownHost = this.f5864c;
            return ((iE + (knownHost == null ? 0 : knownHost.hashCode())) * 31) + Boolean.hashCode(this.f5865d);
        }

        public final String j() {
            return this.f5862a;
        }

        public final KnownHost m() {
            return this.f5864c;
        }

        public final boolean s() {
            KnownHost knownHost = this.f5864c;
            return (knownHost == null || knownHost.hasDeletedAt()) ? false : true;
        }

        public final boolean t() {
            return this.f5865d;
        }

        public String toString() {
            return "DiscoveryHost(id=" + P3.i.f(this.f5862a) + ", displayName=" + this.f5863b + ", knownHost=" + this.f5864c + ", isReachable=" + this.f5865d + ")";
        }

        public b(String id, String displayName, KnownHost knownHost, boolean z8) {
            kotlin.jvm.internal.t.g(id, "id");
            kotlin.jvm.internal.t.g(displayName, "displayName");
            this.f5862a = id;
            this.f5863b = displayName;
            this.f5864c = knownHost;
            this.f5865d = z8;
        }

        public /* synthetic */ b(String str, String str2, KnownHost knownHost, boolean z8, int i8, AbstractC2633k abstractC2633k) {
            this(str, str2, (i8 & 4) != 0 ? null : knownHost, (i8 & 8) != 0 ? false : z8, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5866a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final KnownHost.Device f5867b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f5868c;

            public /* synthetic */ a(String str, KnownHost.Device device, d dVar, AbstractC2633k abstractC2633k) {
                this(str, device, dVar);
            }

            @Override // N3.f.c
            public d a() {
                return this.f5868c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return P3.i.d(this.f5866a, aVar.f5866a) && kotlin.jvm.internal.t.c(this.f5867b, aVar.f5867b) && kotlin.jvm.internal.t.c(this.f5868c, aVar.f5868c);
            }

            public int hashCode() {
                return (((P3.i.e(this.f5866a) * 31) + this.f5867b.hashCode()) * 31) + this.f5868c.hashCode();
            }

            public String toString() {
                return "CreateDevice(workstationID=" + P3.i.f(this.f5866a) + ", deviceSettings=" + this.f5867b + ", requestState=" + this.f5868c + ")";
            }

            public a(String workstationID, KnownHost.Device device, d requestState) {
                kotlin.jvm.internal.t.g(workstationID, "workstationID");
                kotlin.jvm.internal.t.g(device, Oitvkwcwn.dBUHpBckXip);
                kotlin.jvm.internal.t.g(requestState, "requestState");
                this.f5866a = workstationID;
                this.f5867b = device;
                this.f5868c = requestState;
            }

            public /* synthetic */ a(String str, KnownHost.Device device, d dVar, int i8, AbstractC2633k abstractC2633k) {
                this(str, device, (i8 & 4) != 0 ? d.b.f5880a : dVar, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5869a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f5870b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f5871c;

            public /* synthetic */ b(String str, String str2, d dVar, AbstractC2633k abstractC2633k) {
                this(str, str2, dVar);
            }

            @Override // N3.f.c
            public d a() {
                return this.f5871c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return P3.i.d(this.f5869a, bVar.f5869a) && P3.b.d(this.f5870b, bVar.f5870b) && kotlin.jvm.internal.t.c(this.f5871c, bVar.f5871c);
            }

            public int hashCode() {
                return (((P3.i.e(this.f5869a) * 31) + P3.b.e(this.f5870b)) * 31) + this.f5871c.hashCode();
            }

            public String toString() {
                return "DeleteDevice(workstationID=" + P3.i.f(this.f5869a) + ", deviceID=" + P3.b.f(this.f5870b) + ", requestState=" + this.f5871c + ")";
            }

            public b(String workstationID, String deviceID, d requestState) {
                kotlin.jvm.internal.t.g(workstationID, "workstationID");
                kotlin.jvm.internal.t.g(deviceID, "deviceID");
                kotlin.jvm.internal.t.g(requestState, "requestState");
                this.f5869a = workstationID;
                this.f5870b = deviceID;
                this.f5871c = requestState;
            }

            public /* synthetic */ b(String str, String str2, d dVar, int i8, AbstractC2633k abstractC2633k) {
                this(str, str2, (i8 & 4) != 0 ? d.b.f5880a : dVar, null);
            }
        }

        /* JADX INFO: renamed from: N3.f$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0219c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5872a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f5873b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f5874c;

            public /* synthetic */ C0219c(String str, String str2, d dVar, AbstractC2633k abstractC2633k) {
                this(str, str2, dVar);
            }

            @Override // N3.f.c
            public d a() {
                return this.f5874c;
            }

            public final String b() {
                return this.f5873b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0219c)) {
                    return false;
                }
                C0219c c0219c = (C0219c) obj;
                return P3.i.d(this.f5872a, c0219c.f5872a) && P3.b.d(this.f5873b, c0219c.f5873b) && kotlin.jvm.internal.t.c(this.f5874c, c0219c.f5874c);
            }

            public int hashCode() {
                return (((P3.i.e(this.f5872a) * 31) + P3.b.e(this.f5873b)) * 31) + this.f5874c.hashCode();
            }

            public String toString() {
                return "Open(workstationID=" + P3.i.f(this.f5872a) + ", deviceID=" + P3.b.f(this.f5873b) + ", requestState=" + this.f5874c + ")";
            }

            public C0219c(String workstationID, String deviceID, d requestState) {
                kotlin.jvm.internal.t.g(workstationID, "workstationID");
                kotlin.jvm.internal.t.g(deviceID, "deviceID");
                kotlin.jvm.internal.t.g(requestState, "requestState");
                this.f5872a = workstationID;
                this.f5873b = deviceID;
                this.f5874c = requestState;
            }

            public /* synthetic */ C0219c(String str, String str2, d dVar, int i8, AbstractC2633k abstractC2633k) {
                this(str, str2, (i8 & 4) != 0 ? d.b.f5880a : dVar, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5875a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f5876b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f5877c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final d f5878d;

            public /* synthetic */ d(String str, String str2, String str3, d dVar, AbstractC2633k abstractC2633k) {
                this(str, str2, str3, dVar);
            }

            public static /* synthetic */ d c(d dVar, String str, String str2, String str3, d dVar2, int i8, Object obj) {
                if ((i8 & 1) != 0) {
                    str = dVar.f5875a;
                }
                if ((i8 & 2) != 0) {
                    str2 = dVar.f5876b;
                }
                if ((i8 & 4) != 0) {
                    str3 = dVar.f5877c;
                }
                if ((i8 & 8) != 0) {
                    dVar2 = dVar.f5878d;
                }
                return dVar.b(str, str2, str3, dVar2);
            }

            @Override // N3.f.c
            public d a() {
                return this.f5878d;
            }

            public final d b(String workstationID, String hostname, String fingerprint, d requestState) {
                kotlin.jvm.internal.t.g(workstationID, "workstationID");
                kotlin.jvm.internal.t.g(hostname, "hostname");
                kotlin.jvm.internal.t.g(fingerprint, "fingerprint");
                kotlin.jvm.internal.t.g(requestState, "requestState");
                return new d(workstationID, hostname, fingerprint, requestState, null);
            }

            public final String d() {
                return this.f5877c;
            }

            public final String e() {
                return this.f5876b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return P3.i.d(this.f5875a, dVar.f5875a) && kotlin.jvm.internal.t.c(this.f5876b, dVar.f5876b) && kotlin.jvm.internal.t.c(this.f5877c, dVar.f5877c) && kotlin.jvm.internal.t.c(this.f5878d, dVar.f5878d);
            }

            public String f() {
                return this.f5875a;
            }

            public int hashCode() {
                return (((((P3.i.e(this.f5875a) * 31) + this.f5876b.hashCode()) * 31) + this.f5877c.hashCode()) * 31) + this.f5878d.hashCode();
            }

            public String toString() {
                return "Pairing(workstationID=" + P3.i.f(this.f5875a) + ", hostname=" + this.f5876b + ", fingerprint=" + this.f5877c + ", requestState=" + this.f5878d + ")";
            }

            public d(String workstationID, String hostname, String fingerprint, d requestState) {
                kotlin.jvm.internal.t.g(workstationID, "workstationID");
                kotlin.jvm.internal.t.g(hostname, "hostname");
                kotlin.jvm.internal.t.g(fingerprint, "fingerprint");
                kotlin.jvm.internal.t.g(requestState, "requestState");
                this.f5875a = workstationID;
                this.f5876b = hostname;
                this.f5877c = fingerprint;
                this.f5878d = requestState;
            }

            public /* synthetic */ d(String str, String str2, String str3, d dVar, int i8, AbstractC2633k abstractC2633k) {
                this(str, str2, str3, (i8 & 8) != 0 ? d.b.f5880a : dVar, null);
            }
        }

        d a();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f5879a;

            public a(Throwable error) {
                kotlin.jvm.internal.t.g(error, "error");
                this.f5879a = error;
            }

            public final Throwable a() {
                return this.f5879a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.t.c(this.f5879a, ((a) obj).f5879a);
            }

            public int hashCode() {
                return this.f5879a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f5879a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f5880a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 426296851;
            }

            public String toString() {
                return "Pending";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f5881a = new c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1431949277;
            }

            public String toString() {
                return "Succeeded";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f5882a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1399702485;
            }

            public String toString() {
                return "Discovery";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f5883a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1187391609;
            }

            public String toString() {
                return "Idle";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f5884a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f5885b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final c f5886c;

            public c() {
                this(null, null, null, 7, null);
            }

            public final List a() {
                return this.f5884a;
            }

            public final c b() {
                return this.f5886c;
            }

            public final List c() {
                return this.f5885b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.t.c(this.f5884a, cVar.f5884a) && kotlin.jvm.internal.t.c(this.f5885b, cVar.f5885b) && kotlin.jvm.internal.t.c(this.f5886c, cVar.f5886c);
            }

            public int hashCode() {
                int iHashCode = ((this.f5884a.hashCode() * 31) + this.f5885b.hashCode()) * 31;
                c cVar = this.f5886c;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public String toString() {
                return "Results(knownHosts=" + this.f5884a + ", unknownHosts=" + this.f5885b + ", request=" + this.f5886c + ")";
            }

            public c(List<b> knownHosts, List<b> unknownHosts, c cVar) {
                kotlin.jvm.internal.t.g(knownHosts, "knownHosts");
                kotlin.jvm.internal.t.g(unknownHosts, "unknownHosts");
                this.f5884a = knownHosts;
                this.f5885b = unknownHosts;
                this.f5886c = cVar;
            }

            public /* synthetic */ c(List list, List list2, c cVar, int i8, AbstractC2633k abstractC2633k) {
                this((i8 & 1) != 0 ? D6.r.n() : list, (i8 & 2) != 0 ? D6.r.n() : list2, (i8 & 4) != 0 ? null : cVar);
            }
        }
    }

    /* JADX INFO: renamed from: N3.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0220f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f5892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f5893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f5894h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f5895i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f5896j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b f5897k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f5898l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0220f(b bVar, f fVar, G6.d dVar) {
            super(2, dVar);
            this.f5897k = bVar;
            this.f5898l = fVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            C0220f c0220f = new C0220f(this.f5897k, this.f5898l, dVar);
            c0220f.f5896j = obj;
            return c0220f;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((C0220f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:129:0x034c A[EXC_TOP_SPLITTER, PHI: r0 r3 r4 r5 r7
          0x034c: PHI (r0v14 N3.f) = (r0v8 N3.f), (r0v86 N3.f) binds: [B:100:0x0349, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x034c: PHI (r3v7 k7.a) = (r3v1 k7.a), (r3v28 k7.a) binds: [B:100:0x0349, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x034c: PHI (r4v4 java.lang.Throwable) = (r4v2 java.lang.Throwable), (r4v20 java.lang.Throwable) binds: [B:100:0x0349, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x034c: PHI (r5v3 kotlin.jvm.internal.J) = (r5v1 kotlin.jvm.internal.J), (r5v13 kotlin.jvm.internal.J) binds: [B:100:0x0349, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x034c: PHI (r7v3 kotlin.jvm.internal.J) = (r7v0 kotlin.jvm.internal.J), (r7v39 kotlin.jvm.internal.J) binds: [B:100:0x0349, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x0092 A[PHI: r0 r7 r8 r9 r16
          0x0092: PHI (r0v58 java.lang.Object) = (r0v54 java.lang.Object), (r0v70 java.lang.Object) binds: [B:72:0x0278, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]
          0x0092: PHI (r7v24 kotlin.jvm.internal.J) = (r7v21 kotlin.jvm.internal.J), (r7v27 kotlin.jvm.internal.J) binds: [B:72:0x0278, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]
          0x0092: PHI (r8v18 kotlin.jvm.internal.J) = (r8v15 kotlin.jvm.internal.J), (r8v20 kotlin.jvm.internal.J) binds: [B:72:0x0278, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]
          0x0092: PHI (r9v18 b7.J) = (r9v15 b7.J), (r9v20 b7.J) binds: [B:72:0x0278, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]
          0x0092: PHI (r16v7 char) = (r16v5 char), (r16v8 char) binds: [B:72:0x0278, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x0163 A[Catch: all -> 0x00e0, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:32:0x00d0, B:42:0x0159, B:44:0x0163, B:47:0x0169, B:49:0x017d, B:51:0x0183, B:54:0x0189, B:56:0x019d, B:59:0x01a3), top: B:121:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0169 A[Catch: all -> 0x00e0, TRY_ENTER, TryCatch #0 {all -> 0x00e0, blocks: (B:32:0x00d0, B:42:0x0159, B:44:0x0163, B:47:0x0169, B:49:0x017d, B:51:0x0183, B:54:0x0189, B:56:0x019d, B:59:0x01a3), top: B:121:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:56:0x019d A[Catch: all -> 0x00e0, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:32:0x00d0, B:42:0x0159, B:44:0x0163, B:47:0x0169, B:49:0x017d, B:51:0x0183, B:54:0x0189, B:56:0x019d, B:59:0x01a3), top: B:121:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:59:0x01a3 A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:32:0x00d0, B:42:0x0159, B:44:0x0163, B:47:0x0169, B:49:0x017d, B:51:0x0183, B:54:0x0189, B:56:0x019d, B:59:0x01a3), top: B:121:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:62:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:70:0x0244  */
        /* JADX WARN: Code duplicated, block: B:76:0x0284 A[Catch: all -> 0x02b3, TRY_LEAVE, TryCatch #2 {all -> 0x02b3, blocks: (B:74:0x027c, B:76:0x0284), top: B:124:0x027c }] */
        /* JADX WARN: Code duplicated, block: B:79:0x02b0 A[PHI: r4 r7 r9 r16
          0x02b0: PHI (r4v11 kotlin.jvm.internal.J) = (r4v8 kotlin.jvm.internal.J), (r4v8 kotlin.jvm.internal.J), (r4v14 kotlin.jvm.internal.J) binds: [B:75:0x0282, B:77:0x02ac, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
          0x02b0: PHI (r7v30 kotlin.jvm.internal.J) = (r7v25 kotlin.jvm.internal.J), (r7v25 kotlin.jvm.internal.J), (r7v33 kotlin.jvm.internal.J) binds: [B:75:0x0282, B:77:0x02ac, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
          0x02b0: PHI (r9v23 b7.J) = (r9v18 b7.J), (r9v18 b7.J), (r9v25 b7.J) binds: [B:75:0x0282, B:77:0x02ac, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
          0x02b0: PHI (r16v11 char) = (r16v7 char), (r16v7 char), (r16v13 char) binds: [B:75:0x0282, B:77:0x02ac, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:96:0x0309  */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0384, code lost:
        
            if (r0.y(r27) == r2) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x02cf, code lost:
        
            if (r4.b(null, r27) == r2) goto L106;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            char c8;
            J j8;
            kotlin.jvm.internal.J j9;
            kotlin.jvm.internal.J j10;
            p098k7.a aVar;
            f fVar;
            kotlin.jvm.internal.J j11;
            b bVar;
            J j12;
            p098k7.a aVar2;
            kotlin.jvm.internal.J j13;
            f fVar2;
            J j14;
            b bVar2;
            M3.m mVar;
            String strJ;
            String strE;
            CryptoBox cryptoBox;
            Object objKeyPair;
            J j15;
            String str;
            p098k7.a aVar3;
            f fVar3;
            kotlin.jvm.internal.J j16;
            String str2;
            kotlin.jvm.internal.J j17;
            p098k7.a aVar4;
            kotlin.jvm.internal.J j18;
            J j19;
            M3.m mVar2;
            kotlin.jvm.internal.J j20;
            kotlin.jvm.internal.J j21;
            Object objX;
            kotlin.jvm.internal.J j22;
            M3.m mVar3;
            p098k7.a aVar5;
            f fVar4;
            Object objF = H6.c.f();
            try {
                try {
                    try {
                        switch (this.f5895i) {
                            case 0:
                                C6.r.b(obj);
                                J j23 = (J) this.f5896j;
                                V3.f.b(N3.h.b(f.f5845p, this.f5897k.j()));
                                kotlin.jvm.internal.J j24 = new kotlin.jvm.internal.J();
                                kotlin.jvm.internal.J j25 = new kotlin.jvm.internal.J();
                                p098k7.a aVar6 = this.f5898l.f5856j;
                                f fVar5 = this.f5898l;
                                b bVar3 = this.f5897k;
                                this.f5896j = j23;
                                this.f5887a = j24;
                                this.f5888b = j25;
                                this.f5889c = aVar6;
                                this.f5890d = fVar5;
                                this.f5891e = bVar3;
                                this.f5895i = 1;
                                if (aVar6.b(null, this) != objF) {
                                    j11 = j25;
                                    bVar = bVar3;
                                    j12 = j23;
                                    aVar2 = aVar6;
                                    j13 = j24;
                                    fVar2 = fVar5;
                                    j14 = j12;
                                    if (N3.h.j(fVar2.f5861o)) {
                                        G g8 = G.f1419a;
                                        aVar2.e(null);
                                        return g8;
                                    }
                                    bVar2 = (b) fVar2.f5859m.get(P3.i.a(bVar.j()));
                                    if (bVar2 == null && !bVar2.t()) {
                                        G g9 = G.f1419a;
                                        aVar2.e(null);
                                        return g9;
                                    }
                                    mVar = (M3.m) fVar2.f5860n.get(P3.i.a(bVar.j()));
                                    if (mVar == null) {
                                        G g10 = G.f1419a;
                                        aVar2.e(null);
                                        return g10;
                                    }
                                    j13.f28779a = mVar;
                                    strJ = bVar.j();
                                    strE = bVar.e();
                                    cryptoBox = fVar2.f5850d;
                                    AppSettingsStore appSettingsStore = fVar2.f5848b;
                                    this.f5896j = j14;
                                    this.f5887a = j13;
                                    this.f5888b = j11;
                                    this.f5889c = aVar2;
                                    this.f5890d = fVar2;
                                    this.f5891e = cryptoBox;
                                    this.f5892f = strE;
                                    this.f5893g = strJ;
                                    this.f5894h = j11;
                                    this.f5895i = 2;
                                    objKeyPair = appSettingsStore.keyPair(this);
                                    if (objKeyPair != objF) {
                                        f fVar6 = fVar2;
                                        j15 = j14;
                                        str = strJ;
                                        aVar3 = aVar2;
                                        fVar3 = fVar6;
                                        j16 = j11;
                                        str2 = strE;
                                        j17 = j16;
                                        try {
                                            String upperCase = Z6.w.I0(cryptoBox.getFingerprint(((CryptoBox.KeyPair) objKeyPair).getPublicKey()), new W6.i(0, 5)).toUpperCase(Locale.ROOT);
                                            kotlin.jvm.internal.t.f(upperCase, "toUpperCase(...)");
                                            j18 = j13;
                                            f fVar7 = fVar3;
                                            j19 = j15;
                                            c8 = 0;
                                            aVar4 = aVar3;
                                            try {
                                                j17.f28779a = new c.d(str, str2, upperCase, null, 8, null);
                                                fVar7.f5861o = (c) j16.f28779a;
                                                fVar7.Q();
                                                G g11 = G.f1419a;
                                                aVar4.e(null);
                                                try {
                                                    mVar2 = (M3.m) j18.f28779a;
                                                    this.f5896j = j19;
                                                    this.f5887a = j18;
                                                    this.f5888b = j16;
                                                    this.f5889c = null;
                                                    this.f5890d = null;
                                                    this.f5891e = null;
                                                    this.f5892f = null;
                                                    this.f5893g = null;
                                                    this.f5894h = null;
                                                    this.f5895i = 3;
                                                    if (mVar2.x(this) != objF) {
                                                        j20 = j18;
                                                        j8 = j19;
                                                        j21 = j16;
                                                        try {
                                                            V3.j[] jVarArr = new V3.j[1];
                                                            jVarArr[c8] = N3.h.a(f.f5845p, this.f5897k.j());
                                                            V3.f.b(jVarArr);
                                                            InterfaceC2260f interfaceC2260fM102getDevicesByWorkstationIDjCyGMI4 = this.f5898l.f5848b.m102getDevicesByWorkstationIDjCyGMI4(this.f5897k.j());
                                                            this.f5896j = j8;
                                                            this.f5887a = j20;
                                                            this.f5888b = j21;
                                                            this.f5895i = 4;
                                                            objX = AbstractC2262h.x(interfaceC2260fM102getDevicesByWorkstationIDjCyGMI4, this);
                                                            if (objX != objF) {
                                                                j22 = j21;
                                                                j9 = j20;
                                                                try {
                                                                    if (((List) objX).isEmpty()) {
                                                                        j20 = j9;
                                                                        j21 = j22;
                                                                        aVar5 = this.f5898l.f5856j;
                                                                        fVar4 = this.f5898l;
                                                                        this.f5896j = j8;
                                                                        this.f5887a = j20;
                                                                        this.f5888b = j21;
                                                                        this.f5889c = aVar5;
                                                                        this.f5890d = fVar4;
                                                                        this.f5895i = 6;
                                                                    } else {
                                                                        V3.j[] jVarArr2 = new V3.j[1];
                                                                        jVarArr2[c8] = N3.h.d(f.f5845p, this.f5897k.j());
                                                                        V3.f.b(jVarArr2);
                                                                        mVar3 = (M3.m) j9.f28779a;
                                                                        this.f5896j = j8;
                                                                        this.f5887a = j9;
                                                                        this.f5888b = j22;
                                                                        this.f5895i = 5;
                                                                        if (mVar3.G("Stream Deck Mobile", true, this) != objF) {
                                                                            j20 = j9;
                                                                            j21 = j22;
                                                                            aVar5 = this.f5898l.f5856j;
                                                                            fVar4 = this.f5898l;
                                                                            this.f5896j = j8;
                                                                            this.f5887a = j20;
                                                                            this.f5888b = j21;
                                                                            this.f5889c = aVar5;
                                                                            this.f5890d = fVar4;
                                                                            this.f5895i = 6;
                                                                        }
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    j10 = j22;
                                                                    th = th;
                                                                    if ((th instanceof M3.m.C1037b) && ((M3.m.C1037b) th).a() == Messages.Error.b.AuthenticationRejected) {
                                                                        V3.j[] jVarArr3 = new V3.j[1];
                                                                        jVarArr3[c8] = N3.h.i(f.f5845p, this.f5897k.j());
                                                                        V3.f.b(jVarArr3);
                                                                    }
                                                                    aVar = this.f5898l.f5856j;
                                                                    fVar = this.f5898l;
                                                                    this.f5896j = j8;
                                                                    this.f5887a = j9;
                                                                    this.f5888b = j10;
                                                                    this.f5889c = th;
                                                                    this.f5890d = aVar;
                                                                    this.f5891e = fVar;
                                                                    this.f5892f = null;
                                                                    this.f5893g = null;
                                                                    this.f5894h = null;
                                                                    this.f5895i = 7;
                                                                    if (aVar.b(null, this) != objF) {
                                                                        try {
                                                                            fVar.f5861o = c.d.c((c.d) j10.f28779a, null, null, null, new d.a(th), 7, null);
                                                                            fVar.Q();
                                                                            G g12 = G.f1419a;
                                                                            aVar.e(null);
                                                                            C6.q.a aVar7 = C6.q.f1441b;
                                                                            M3.m mVar4 = (M3.m) j9.f28779a;
                                                                            this.f5896j = null;
                                                                            this.f5887a = null;
                                                                            this.f5888b = null;
                                                                            this.f5889c = null;
                                                                            this.f5890d = null;
                                                                            this.f5891e = null;
                                                                            this.f5895i = 8;
                                                                        } catch (Throwable th3) {
                                                                            aVar.e(null);
                                                                            throw th3;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            j10 = j21;
                                                            j9 = j20;
                                                            if (th instanceof M3.m.C1037b) {
                                                                V3.j[] jVarArr4 = new V3.j[1];
                                                                jVarArr4[c8] = N3.h.i(f.f5845p, this.f5897k.j());
                                                                V3.f.b(jVarArr4);
                                                            }
                                                            aVar = this.f5898l.f5856j;
                                                            fVar = this.f5898l;
                                                            this.f5896j = j8;
                                                            this.f5887a = j9;
                                                            this.f5888b = j10;
                                                            this.f5889c = th;
                                                            this.f5890d = aVar;
                                                            this.f5891e = fVar;
                                                            this.f5892f = null;
                                                            this.f5893g = null;
                                                            this.f5894h = null;
                                                            this.f5895i = 7;
                                                            if (aVar.b(null, this) != objF) {
                                                                fVar.f5861o = c.d.c((c.d) j10.f28779a, null, null, null, new d.a(th), 7, null);
                                                                fVar.Q();
                                                                G g13 = G.f1419a;
                                                                aVar.e(null);
                                                                C6.q.a aVar8 = C6.q.f1441b;
                                                                M3.m mVar5 = (M3.m) j9.f28779a;
                                                                this.f5896j = null;
                                                                this.f5887a = null;
                                                                this.f5888b = null;
                                                                this.f5889c = null;
                                                                this.f5890d = null;
                                                                this.f5891e = null;
                                                                this.f5895i = 8;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    j9 = j18;
                                                    j8 = j19;
                                                    j10 = j16;
                                                    th = th;
                                                    if (th instanceof M3.m.C1037b) {
                                                        V3.j[] jVarArr5 = new V3.j[1];
                                                        jVarArr5[c8] = N3.h.i(f.f5845p, this.f5897k.j());
                                                        V3.f.b(jVarArr5);
                                                    }
                                                    aVar = this.f5898l.f5856j;
                                                    fVar = this.f5898l;
                                                    this.f5896j = j8;
                                                    this.f5887a = j9;
                                                    this.f5888b = j10;
                                                    this.f5889c = th;
                                                    this.f5890d = aVar;
                                                    this.f5891e = fVar;
                                                    this.f5892f = null;
                                                    this.f5893g = null;
                                                    this.f5894h = null;
                                                    this.f5895i = 7;
                                                    if (aVar.b(null, this) != objF) {
                                                        fVar.f5861o = c.d.c((c.d) j10.f28779a, null, null, null, new d.a(th), 7, null);
                                                        fVar.Q();
                                                        G g14 = G.f1419a;
                                                        aVar.e(null);
                                                        C6.q.a aVar9 = C6.q.f1441b;
                                                        M3.m mVar6 = (M3.m) j9.f28779a;
                                                        this.f5896j = null;
                                                        this.f5887a = null;
                                                        this.f5888b = null;
                                                        this.f5889c = null;
                                                        this.f5890d = null;
                                                        this.f5891e = null;
                                                        this.f5895i = 8;
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                p098k7.a aVar10 = aVar4;
                                                aVar10.e(null);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            aVar4 = aVar3;
                                        }
                                    }
                                    break;
                                }
                                return objF;
                            case 1:
                                bVar = (b) this.f5891e;
                                f fVar8 = (f) this.f5890d;
                                p098k7.a aVar11 = (p098k7.a) this.f5889c;
                                j11 = (kotlin.jvm.internal.J) this.f5888b;
                                kotlin.jvm.internal.J j26 = (kotlin.jvm.internal.J) this.f5887a;
                                J j27 = (J) this.f5896j;
                                C6.r.b(obj);
                                fVar2 = fVar8;
                                j13 = j26;
                                j12 = j27;
                                aVar2 = aVar11;
                                j14 = j12;
                                if (N3.h.j(fVar2.f5861o)) {
                                    G g15 = G.f1419a;
                                    aVar2.e(null);
                                    return g15;
                                }
                                bVar2 = (b) fVar2.f5859m.get(P3.i.a(bVar.j()));
                                if (bVar2 == null) {
                                    break;
                                }
                                mVar = (M3.m) fVar2.f5860n.get(P3.i.a(bVar.j()));
                                if (mVar == null) {
                                    G g16 = G.f1419a;
                                    aVar2.e(null);
                                    return g16;
                                }
                                j13.f28779a = mVar;
                                strJ = bVar.j();
                                strE = bVar.e();
                                cryptoBox = fVar2.f5850d;
                                AppSettingsStore appSettingsStore2 = fVar2.f5848b;
                                this.f5896j = j14;
                                this.f5887a = j13;
                                this.f5888b = j11;
                                this.f5889c = aVar2;
                                this.f5890d = fVar2;
                                this.f5891e = cryptoBox;
                                this.f5892f = strE;
                                this.f5893g = strJ;
                                this.f5894h = j11;
                                this.f5895i = 2;
                                objKeyPair = appSettingsStore2.keyPair(this);
                                if (objKeyPair != objF) {
                                    f fVar9 = fVar2;
                                    j15 = j14;
                                    str = strJ;
                                    aVar3 = aVar2;
                                    fVar3 = fVar9;
                                    j16 = j11;
                                    str2 = strE;
                                    j17 = j16;
                                    String upperCase2 = Z6.w.I0(cryptoBox.getFingerprint(((CryptoBox.KeyPair) objKeyPair).getPublicKey()), new W6.i(0, 5)).toUpperCase(Locale.ROOT);
                                    kotlin.jvm.internal.t.f(upperCase2, "toUpperCase(...)");
                                    j18 = j13;
                                    f fVar10 = fVar3;
                                    j19 = j15;
                                    c8 = 0;
                                    aVar4 = aVar3;
                                    j17.f28779a = new c.d(str, str2, upperCase2, null, 8, null);
                                    fVar10.f5861o = (c) j16.f28779a;
                                    fVar10.Q();
                                    G g17 = G.f1419a;
                                    aVar4.e(null);
                                    mVar2 = (M3.m) j18.f28779a;
                                    this.f5896j = j19;
                                    this.f5887a = j18;
                                    this.f5888b = j16;
                                    this.f5889c = null;
                                    this.f5890d = null;
                                    this.f5891e = null;
                                    this.f5892f = null;
                                    this.f5893g = null;
                                    this.f5894h = null;
                                    this.f5895i = 3;
                                    if (mVar2.x(this) != objF) {
                                        j20 = j18;
                                        j8 = j19;
                                        j21 = j16;
                                        V3.j[] jVarArr6 = new V3.j[1];
                                        jVarArr6[c8] = N3.h.a(f.f5845p, this.f5897k.j());
                                        V3.f.b(jVarArr6);
                                        InterfaceC2260f interfaceC2260fM102getDevicesByWorkstationIDjCyGMI5 = this.f5898l.f5848b.m102getDevicesByWorkstationIDjCyGMI4(this.f5897k.j());
                                        this.f5896j = j8;
                                        this.f5887a = j20;
                                        this.f5888b = j21;
                                        this.f5895i = 4;
                                        objX = AbstractC2262h.x(interfaceC2260fM102getDevicesByWorkstationIDjCyGMI5, this);
                                        if (objX != objF) {
                                            j22 = j21;
                                            j9 = j20;
                                            if (((List) objX).isEmpty()) {
                                                j20 = j9;
                                                j21 = j22;
                                                aVar5 = this.f5898l.f5856j;
                                                fVar4 = this.f5898l;
                                                this.f5896j = j8;
                                                this.f5887a = j20;
                                                this.f5888b = j21;
                                                this.f5889c = aVar5;
                                                this.f5890d = fVar4;
                                                this.f5895i = 6;
                                            } else {
                                                V3.j[] jVarArr7 = new V3.j[1];
                                                jVarArr7[c8] = N3.h.d(f.f5845p, this.f5897k.j());
                                                V3.f.b(jVarArr7);
                                                mVar3 = (M3.m) j9.f28779a;
                                                this.f5896j = j8;
                                                this.f5887a = j9;
                                                this.f5888b = j22;
                                                this.f5895i = 5;
                                                if (mVar3.G("Stream Deck Mobile", true, this) != objF) {
                                                    j20 = j9;
                                                    j21 = j22;
                                                    aVar5 = this.f5898l.f5856j;
                                                    fVar4 = this.f5898l;
                                                    this.f5896j = j8;
                                                    this.f5887a = j20;
                                                    this.f5888b = j21;
                                                    this.f5889c = aVar5;
                                                    this.f5890d = fVar4;
                                                    this.f5895i = 6;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                return objF;
                            case 2:
                                j17 = (kotlin.jvm.internal.J) this.f5894h;
                                String str3 = (String) this.f5893g;
                                String str4 = (String) this.f5892f;
                                CryptoBox cryptoBox2 = (CryptoBox) this.f5891e;
                                f fVar11 = (f) this.f5890d;
                                p098k7.a aVar12 = (p098k7.a) this.f5889c;
                                kotlin.jvm.internal.J j28 = (kotlin.jvm.internal.J) this.f5888b;
                                kotlin.jvm.internal.J j29 = (kotlin.jvm.internal.J) this.f5887a;
                                J j30 = (J) this.f5896j;
                                C6.r.b(obj);
                                str = str3;
                                j13 = j29;
                                cryptoBox = cryptoBox2;
                                str2 = str4;
                                j16 = j28;
                                aVar3 = aVar12;
                                fVar3 = fVar11;
                                j15 = j30;
                                objKeyPair = obj;
                                String upperCase3 = Z6.w.I0(cryptoBox.getFingerprint(((CryptoBox.KeyPair) objKeyPair).getPublicKey()), new W6.i(0, 5)).toUpperCase(Locale.ROOT);
                                kotlin.jvm.internal.t.f(upperCase3, "toUpperCase(...)");
                                j18 = j13;
                                f fVar12 = fVar3;
                                j19 = j15;
                                c8 = 0;
                                aVar4 = aVar3;
                                j17.f28779a = new c.d(str, str2, upperCase3, null, 8, null);
                                fVar12.f5861o = (c) j16.f28779a;
                                fVar12.Q();
                                G g18 = G.f1419a;
                                aVar4.e(null);
                                mVar2 = (M3.m) j18.f28779a;
                                this.f5896j = j19;
                                this.f5887a = j18;
                                this.f5888b = j16;
                                this.f5889c = null;
                                this.f5890d = null;
                                this.f5891e = null;
                                this.f5892f = null;
                                this.f5893g = null;
                                this.f5894h = null;
                                this.f5895i = 3;
                                if (mVar2.x(this) != objF) {
                                    j20 = j18;
                                    j8 = j19;
                                    j21 = j16;
                                    V3.j[] jVarArr8 = new V3.j[1];
                                    jVarArr8[c8] = N3.h.a(f.f5845p, this.f5897k.j());
                                    V3.f.b(jVarArr8);
                                    InterfaceC2260f interfaceC2260fM102getDevicesByWorkstationIDjCyGMI6 = this.f5898l.f5848b.m102getDevicesByWorkstationIDjCyGMI4(this.f5897k.j());
                                    this.f5896j = j8;
                                    this.f5887a = j20;
                                    this.f5888b = j21;
                                    this.f5895i = 4;
                                    objX = AbstractC2262h.x(interfaceC2260fM102getDevicesByWorkstationIDjCyGMI6, this);
                                    if (objX != objF) {
                                        j22 = j21;
                                        j9 = j20;
                                        if (((List) objX).isEmpty()) {
                                            j20 = j9;
                                            j21 = j22;
                                            aVar5 = this.f5898l.f5856j;
                                            fVar4 = this.f5898l;
                                            this.f5896j = j8;
                                            this.f5887a = j20;
                                            this.f5888b = j21;
                                            this.f5889c = aVar5;
                                            this.f5890d = fVar4;
                                            this.f5895i = 6;
                                        } else {
                                            V3.j[] jVarArr9 = new V3.j[1];
                                            jVarArr9[c8] = N3.h.d(f.f5845p, this.f5897k.j());
                                            V3.f.b(jVarArr9);
                                            mVar3 = (M3.m) j9.f28779a;
                                            this.f5896j = j8;
                                            this.f5887a = j9;
                                            this.f5888b = j22;
                                            this.f5895i = 5;
                                            if (mVar3.G("Stream Deck Mobile", true, this) != objF) {
                                                j20 = j9;
                                                j21 = j22;
                                                aVar5 = this.f5898l.f5856j;
                                                fVar4 = this.f5898l;
                                                this.f5896j = j8;
                                                this.f5887a = j20;
                                                this.f5888b = j21;
                                                this.f5889c = aVar5;
                                                this.f5890d = fVar4;
                                                this.f5895i = 6;
                                            }
                                        }
                                    }
                                    break;
                                }
                                return objF;
                            case 3:
                                j21 = (kotlin.jvm.internal.J) this.f5888b;
                                j20 = (kotlin.jvm.internal.J) this.f5887a;
                                j8 = (J) this.f5896j;
                                C6.r.b(obj);
                                c8 = 0;
                                V3.j[] jVarArr10 = new V3.j[1];
                                jVarArr10[c8] = N3.h.a(f.f5845p, this.f5897k.j());
                                V3.f.b(jVarArr10);
                                InterfaceC2260f interfaceC2260fM102getDevicesByWorkstationIDjCyGMI7 = this.f5898l.f5848b.m102getDevicesByWorkstationIDjCyGMI4(this.f5897k.j());
                                this.f5896j = j8;
                                this.f5887a = j20;
                                this.f5888b = j21;
                                this.f5895i = 4;
                                objX = AbstractC2262h.x(interfaceC2260fM102getDevicesByWorkstationIDjCyGMI7, this);
                                if (objX != objF) {
                                    j22 = j21;
                                    j9 = j20;
                                    if (((List) objX).isEmpty()) {
                                        j20 = j9;
                                        j21 = j22;
                                        aVar5 = this.f5898l.f5856j;
                                        fVar4 = this.f5898l;
                                        this.f5896j = j8;
                                        this.f5887a = j20;
                                        this.f5888b = j21;
                                        this.f5889c = aVar5;
                                        this.f5890d = fVar4;
                                        this.f5895i = 6;
                                    } else {
                                        V3.j[] jVarArr11 = new V3.j[1];
                                        jVarArr11[c8] = N3.h.d(f.f5845p, this.f5897k.j());
                                        V3.f.b(jVarArr11);
                                        mVar3 = (M3.m) j9.f28779a;
                                        this.f5896j = j8;
                                        this.f5887a = j9;
                                        this.f5888b = j22;
                                        this.f5895i = 5;
                                        if (mVar3.G("Stream Deck Mobile", true, this) != objF) {
                                            j20 = j9;
                                            j21 = j22;
                                            aVar5 = this.f5898l.f5856j;
                                            fVar4 = this.f5898l;
                                            this.f5896j = j8;
                                            this.f5887a = j20;
                                            this.f5888b = j21;
                                            this.f5889c = aVar5;
                                            this.f5890d = fVar4;
                                            this.f5895i = 6;
                                        }
                                    }
                                    break;
                                }
                                return objF;
                            case 4:
                                j21 = (kotlin.jvm.internal.J) this.f5888b;
                                j20 = (kotlin.jvm.internal.J) this.f5887a;
                                j8 = (J) this.f5896j;
                                C6.r.b(obj);
                                objX = obj;
                                c8 = 0;
                                j22 = j21;
                                j9 = j20;
                                if (((List) objX).isEmpty()) {
                                    V3.j[] jVarArr12 = new V3.j[1];
                                    jVarArr12[c8] = N3.h.d(f.f5845p, this.f5897k.j());
                                    V3.f.b(jVarArr12);
                                    mVar3 = (M3.m) j9.f28779a;
                                    this.f5896j = j8;
                                    this.f5887a = j9;
                                    this.f5888b = j22;
                                    this.f5895i = 5;
                                    if (mVar3.G("Stream Deck Mobile", true, this) != objF) {
                                        j20 = j9;
                                        j21 = j22;
                                        aVar5 = this.f5898l.f5856j;
                                        fVar4 = this.f5898l;
                                        this.f5896j = j8;
                                        this.f5887a = j20;
                                        this.f5888b = j21;
                                        this.f5889c = aVar5;
                                        this.f5890d = fVar4;
                                        this.f5895i = 6;
                                    }
                                    break;
                                } else {
                                    j20 = j9;
                                    j21 = j22;
                                    aVar5 = this.f5898l.f5856j;
                                    fVar4 = this.f5898l;
                                    this.f5896j = j8;
                                    this.f5887a = j20;
                                    this.f5888b = j21;
                                    this.f5889c = aVar5;
                                    this.f5890d = fVar4;
                                    this.f5895i = 6;
                                    break;
                                }
                                return objF;
                            case 5:
                                j22 = (kotlin.jvm.internal.J) this.f5888b;
                                j9 = (kotlin.jvm.internal.J) this.f5887a;
                                j8 = (J) this.f5896j;
                                try {
                                    C6.r.b(obj);
                                    c8 = 0;
                                    j20 = j9;
                                    j21 = j22;
                                    aVar5 = this.f5898l.f5856j;
                                    fVar4 = this.f5898l;
                                    this.f5896j = j8;
                                    this.f5887a = j20;
                                    this.f5888b = j21;
                                    this.f5889c = aVar5;
                                    this.f5890d = fVar4;
                                    this.f5895i = 6;
                                } catch (Throwable th8) {
                                    th = th8;
                                    c8 = 0;
                                    j10 = j22;
                                    th = th;
                                    if (th instanceof M3.m.C1037b) {
                                        V3.j[] jVarArr13 = new V3.j[1];
                                        jVarArr13[c8] = N3.h.i(f.f5845p, this.f5897k.j());
                                        V3.f.b(jVarArr13);
                                    }
                                    aVar = this.f5898l.f5856j;
                                    fVar = this.f5898l;
                                    this.f5896j = j8;
                                    this.f5887a = j9;
                                    this.f5888b = j10;
                                    this.f5889c = th;
                                    this.f5890d = aVar;
                                    this.f5891e = fVar;
                                    this.f5892f = null;
                                    this.f5893g = null;
                                    this.f5894h = null;
                                    this.f5895i = 7;
                                    if (aVar.b(null, this) != objF) {
                                        fVar.f5861o = c.d.c((c.d) j10.f28779a, null, null, null, new d.a(th), 7, null);
                                        fVar.Q();
                                        G g19 = G.f1419a;
                                        aVar.e(null);
                                        C6.q.a aVar13 = C6.q.f1441b;
                                        M3.m mVar7 = (M3.m) j9.f28779a;
                                        this.f5896j = null;
                                        this.f5887a = null;
                                        this.f5888b = null;
                                        this.f5889c = null;
                                        this.f5890d = null;
                                        this.f5891e = null;
                                        this.f5895i = 8;
                                    }
                                }
                                break;
                            case 6:
                                fVar4 = (f) this.f5890d;
                                aVar5 = (p098k7.a) this.f5889c;
                                j21 = (kotlin.jvm.internal.J) this.f5888b;
                                j20 = (kotlin.jvm.internal.J) this.f5887a;
                                j8 = (J) this.f5896j;
                                C6.r.b(obj);
                                c8 = 0;
                                try {
                                    fVar4.f5861o = c.d.c((c.d) j21.f28779a, null, null, null, d.c.f5881a, 7, null);
                                    fVar4.Q();
                                    G g20 = G.f1419a;
                                    return G.f1419a;
                                } finally {
                                    aVar5.e(null);
                                }
                            case 7:
                                fVar = (f) this.f5891e;
                                aVar = (p098k7.a) this.f5890d;
                                th = (Throwable) this.f5889c;
                                j10 = (kotlin.jvm.internal.J) this.f5888b;
                                j9 = (kotlin.jvm.internal.J) this.f5887a;
                                C6.r.b(obj);
                                fVar.f5861o = c.d.c((c.d) j10.f28779a, null, null, null, new d.a(th), 7, null);
                                fVar.Q();
                                G g110 = G.f1419a;
                                aVar.e(null);
                                C6.q.a aVar14 = C6.q.f1441b;
                                M3.m mVar8 = (M3.m) j9.f28779a;
                                this.f5896j = null;
                                this.f5887a = null;
                                this.f5888b = null;
                                this.f5889c = null;
                                this.f5890d = null;
                                this.f5891e = null;
                                this.f5895i = 8;
                                break;
                            case 8:
                                C6.r.b(obj);
                                C6.q.b(G.f1419a);
                                return G.f1419a;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    c8 = 0;
                }
            } catch (Throwable th11) {
                C6.q.a aVar15 = C6.q.f1441b;
                C6.q.b(C6.r.a(th11));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5901c;

        public g(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return f.this.new g(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:39:0x00aa A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:7:0x0013, B:41:0x00ac, B:36:0x00a1, B:39:0x00aa), top: B:47:0x0009 }] */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        
            if (r3.y(r9) == r0) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1, types: [k7.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            p098k7.a aVar;
            f fVar;
            p098k7.a aVar2;
            M3.m.C1037b e8;
            ?? F8 = H6.c.f();
            int i8 = this.f5901c;
            try {
                try {
                    if (i8 == 0) {
                        C6.r.b(obj);
                        aVar = f.this.f5856j;
                        fVar = f.this;
                        this.f5899a = aVar;
                        this.f5900b = fVar;
                        this.f5901c = 1;
                        if (aVar.b(null, this) != F8) {
                        }
                        return F8;
                    }
                    if (i8 == 1) {
                        fVar = (f) this.f5900b;
                        p098k7.a aVar3 = (p098k7.a) this.f5899a;
                        C6.r.b(obj);
                        aVar = aVar3;
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (p098k7.a) this.f5899a;
                        try {
                            C6.r.b(obj);
                        } catch (M3.m.C1037b e9) {
                            e8 = e9;
                            if (e8.a() == Messages.Error.b.InvalidState) {
                                throw e8;
                            }
                        }
                    }
                    G g8 = G.f1419a;
                    aVar2.e(null);
                    return G.f1419a;
                    c cVar = fVar.f5861o;
                    c.d dVar = cVar instanceof c.d ? (c.d) cVar : null;
                    if (dVar == null) {
                        G g9 = G.f1419a;
                        aVar.e(null);
                        return g9;
                    }
                    V3.f.b(N3.h.c(f.f5845p, dVar.f()));
                    M3.m mVar = (M3.m) fVar.f5860n.get(P3.i.a(dVar.f()));
                    fVar.f5861o = null;
                    fVar.Q();
                    if (mVar != null) {
                        try {
                            this.f5899a = aVar;
                            this.f5900b = null;
                            this.f5901c = 2;
                        } catch (M3.m.C1037b e10) {
                            aVar2 = aVar;
                            e8 = e10;
                            if (e8.a() == Messages.Error.b.InvalidState) {
                                throw e8;
                            }
                        }
                    }
                    aVar2 = aVar;
                    G g10 = G.f1419a;
                    aVar2.e(null);
                    return G.f1419a;
                } catch (Throwable th) {
                    F8 = aVar;
                    th = th;
                    F8.e(null);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5908f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f5909g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f f5910h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(KnownHost.Device device, f fVar, G6.d dVar) {
            super(2, dVar);
            this.f5909g = device;
            this.f5910h = fVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new h(this.f5909g, this.f5910h, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((h) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0158  */
        /* JADX WARN: Code duplicated, block: B:60:0x0174  */
        /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v14 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            ?? r8;
            String strG;
            p098k7.a aVar;
            KnownHost.Device device;
            f fVar;
            Throwable th;
            KnownHost.Device device2;
            f fVar2;
            ?? r9;
            p098k7.a aVar2;
            f fVar3;
            kotlin.jvm.internal.J j8;
            KnownHost.Device device3;
            p098k7.a aVar3;
            String str;
            f fVar4;
            String str2;
            kotlin.jvm.internal.J j9;
            Object objF;
            String str3;
            KnownHost.Device device4;
            p098k7.a aVar4;
            f fVar5;
            KnownHost.Device device5;
            f fVar6;
            Object objF2 = H6.c.f();
            int i8 = this.f5908f;
            ?? r10 = 3;
            AbstractC2633k abstractC2633k = null;
            try {
                try {
                    try {
                        if (i8 == 0) {
                            C6.r.b(obj);
                            V3.f.b(N3.h.e(f.f5845p, P3.f.j(this.f5909g)));
                            kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
                            String strJ = P3.f.j(this.f5909g);
                            P3.i iVarA = strJ != null ? P3.i.a(strJ) : null;
                            if (iVarA == null) {
                                throw new IllegalArgumentException(WaYxBuDSBD.LukZXpemXGHjwSG);
                            }
                            strG = iVarA.g();
                            aVar2 = this.f5910h.f5856j;
                            f fVar7 = this.f5910h;
                            KnownHost.Device device6 = this.f5909g;
                            this.f5903a = j10;
                            this.f5904b = strG;
                            this.f5905c = aVar2;
                            this.f5906d = fVar7;
                            this.f5907e = device6;
                            this.f5908f = 1;
                            if (aVar2.b(null, this) != objF2) {
                                fVar3 = fVar7;
                                j8 = j10;
                                device3 = device6;
                            }
                            return objF2;
                        }
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 == 3) {
                                    String str4 = (String) this.f5903a;
                                    try {
                                        C6.r.b(obj);
                                        objF = obj;
                                        str3 = str4;
                                        device4 = (KnownHost.Device) objF;
                                        aVar4 = this.f5910h.f5856j;
                                        fVar5 = this.f5910h;
                                        this.f5903a = str3;
                                        this.f5904b = device4;
                                        this.f5905c = aVar4;
                                        this.f5906d = fVar5;
                                        this.f5908f = 4;
                                        if (aVar4.b(null, this) != objF2) {
                                            device5 = device4;
                                            fVar6 = fVar5;
                                            r10 = str3;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r8 = str4;
                                        aVar = this.f5910h.f5856j;
                                        device = this.f5909g;
                                        fVar = this.f5910h;
                                        this.f5903a = r8;
                                        this.f5904b = th;
                                        this.f5905c = aVar;
                                        this.f5906d = device;
                                        this.f5907e = fVar;
                                        this.f5908f = 5;
                                        if (aVar.b(null, this) != objF2) {
                                            th = th;
                                            device2 = device;
                                            fVar2 = fVar;
                                            r9 = r8;
                                            c.a aVar5 = new c.a(r9, device2, new d.a(th), abstractC2633k);
                                            fVar2.f5861o = aVar5;
                                            fVar2.Q();
                                            return aVar5;
                                        }
                                    }
                                    return objF2;
                                }
                                if (i8 != 4) {
                                    if (i8 != 5) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    fVar2 = (f) this.f5907e;
                                    device2 = (KnownHost.Device) this.f5906d;
                                    aVar = (p098k7.a) this.f5905c;
                                    th = (Throwable) this.f5904b;
                                    String str5 = (String) this.f5903a;
                                    C6.r.b(obj);
                                    r9 = str5;
                                    try {
                                        c.a aVar6 = new c.a(r9, device2, new d.a(th), abstractC2633k);
                                        fVar2.f5861o = aVar6;
                                        fVar2.Q();
                                        return aVar6;
                                    } finally {
                                        aVar.e(null);
                                    }
                                }
                                fVar6 = (f) this.f5906d;
                                aVar4 = (p098k7.a) this.f5905c;
                                device5 = (KnownHost.Device) this.f5904b;
                                String str6 = (String) this.f5903a;
                                C6.r.b(obj);
                                r10 = str6;
                                try {
                                    c.a aVar7 = new c.a(r10, device5, d.c.f5881a, abstractC2633k);
                                    fVar6.f5861o = aVar7;
                                    fVar6.Q();
                                    return aVar7;
                                } finally {
                                    aVar4.e(null);
                                }
                            }
                            device3 = (KnownHost.Device) this.f5907e;
                            fVar4 = (f) this.f5906d;
                            aVar3 = (p098k7.a) this.f5905c;
                            str = (String) this.f5904b;
                            j9 = (kotlin.jvm.internal.J) this.f5903a;
                            try {
                                C6.r.b(obj);
                                str2 = str;
                                try {
                                    fVar4.f5861o = new c.a(str2, device3, null, 4, null);
                                    fVar4.Q();
                                    G g8 = G.f1419a;
                                    try {
                                        aVar3.e(null);
                                        try {
                                            M3.m mVar = (M3.m) j9.f28779a;
                                            KnownHost.Device device7 = this.f5909g;
                                            this.f5903a = str2;
                                            this.f5904b = null;
                                            this.f5905c = null;
                                            this.f5906d = null;
                                            this.f5907e = null;
                                            this.f5908f = 3;
                                            objF = mVar.F(device7, false, this);
                                            if (objF != objF2) {
                                                str3 = str2;
                                                device4 = (KnownHost.Device) objF;
                                                aVar4 = this.f5910h.f5856j;
                                                fVar5 = this.f5910h;
                                                this.f5903a = str3;
                                                this.f5904b = device4;
                                                this.f5905c = aVar4;
                                                this.f5906d = fVar5;
                                                this.f5908f = 4;
                                                if (aVar4.b(null, this) != objF2) {
                                                    device5 = device4;
                                                    fVar6 = fVar5;
                                                    r10 = str3;
                                                    c.a aVar8 = new c.a(r10, device5, d.c.f5881a, abstractC2633k);
                                                    fVar6.f5861o = aVar8;
                                                    fVar6.Q();
                                                    return aVar8;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r8 = str2;
                                            aVar = this.f5910h.f5856j;
                                            device = this.f5909g;
                                            fVar = this.f5910h;
                                            this.f5903a = r8;
                                            this.f5904b = th;
                                            this.f5905c = aVar;
                                            this.f5906d = device;
                                            this.f5907e = fVar;
                                            this.f5908f = 5;
                                            if (aVar.b(null, this) != objF2) {
                                                th = th;
                                                device2 = device;
                                                fVar2 = fVar;
                                                r9 = r8;
                                                c.a aVar9 = new c.a(r9, device2, new d.a(th), abstractC2633k);
                                                fVar2.f5861o = aVar9;
                                                fVar2.Q();
                                                return aVar9;
                                            }
                                        }
                                        return objF2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        strG = str2;
                                        return new c.a(strG, this.f5909g, new d.a(th), abstractC2633k);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    str = str2;
                                    try {
                                        aVar3.e(null);
                                        throw th;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        strG = str;
                                        return new c.a(strG, this.f5909g, new d.a(th), abstractC2633k);
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                aVar3.e(null);
                                throw th;
                            }
                        }
                        device3 = (KnownHost.Device) this.f5907e;
                        fVar3 = (f) this.f5906d;
                        aVar2 = (p098k7.a) this.f5905c;
                        strG = (String) this.f5904b;
                        j8 = (kotlin.jvm.internal.J) this.f5903a;
                        C6.r.b(obj);
                        if (N3.h.j(fVar3.f5861o)) {
                            throw new IllegalStateException("A request is already pending");
                        }
                        Object obj2 = fVar3.f5860n.get(P3.i.a(P3.f.k(device3)));
                        if (obj2 == null) {
                            throw new IllegalStateException(("No open connection for workstation ID `" + strG + "`").toString());
                        }
                        j8.f28779a = obj2;
                        this.f5903a = j8;
                        this.f5904b = strG;
                        this.f5905c = aVar2;
                        this.f5906d = fVar3;
                        this.f5907e = device3;
                        this.f5908f = 2;
                        if (M3.n.b((M3.m) obj2, this) != objF2) {
                            fVar4 = fVar3;
                            aVar3 = aVar2;
                            str2 = strG;
                            j9 = j8;
                            fVar4.f5861o = new c.a(str2, device3, null, 4, null);
                            fVar4.Q();
                            G g9 = G.f1419a;
                            aVar3.e(null);
                            M3.m mVar2 = (M3.m) j9.f28779a;
                            KnownHost.Device device8 = this.f5909g;
                            this.f5903a = str2;
                            this.f5904b = null;
                            this.f5905c = null;
                            this.f5906d = null;
                            this.f5907e = null;
                            this.f5908f = 3;
                            objF = mVar2.F(device8, false, this);
                            if (objF != objF2) {
                                str3 = str2;
                                device4 = (KnownHost.Device) objF;
                                aVar4 = this.f5910h.f5856j;
                                fVar5 = this.f5910h;
                                this.f5903a = str3;
                                this.f5904b = device4;
                                this.f5905c = aVar4;
                                this.f5906d = fVar5;
                                this.f5908f = 4;
                                if (aVar4.b(null, this) != objF2) {
                                    device5 = device4;
                                    fVar6 = fVar5;
                                    r10 = str3;
                                    c.a aVar10 = new c.a(r10, device5, d.c.f5881a, abstractC2633k);
                                    fVar6.f5861o = aVar10;
                                    fVar6.Q();
                                    return aVar10;
                                }
                            }
                        }
                        return objF2;
                    } catch (Throwable th8) {
                        th = th8;
                        aVar3 = aVar2;
                        str = strG;
                        aVar3.e(null);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    r8 = r10;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f5916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f5918h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f f5919i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(KnownHost.Device device, f fVar, G6.d dVar) {
            super(2, dVar);
            this.f5918h = device;
            this.f5919i = fVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new i(this.f5918h, this.f5919i, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((i) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x011b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0128 A[Catch: all -> 0x01fb, TryCatch #7 {all -> 0x01fb, blocks: (B:49:0x011e, B:51:0x0128, B:53:0x013a, B:90:0x0200, B:91:0x021f, B:92:0x0220, B:93:0x0227), top: B:117:0x011e }] */
        /* JADX WARN: Code duplicated, block: B:53:0x013a A[Catch: all -> 0x01fb, TRY_LEAVE, TryCatch #7 {all -> 0x01fb, blocks: (B:49:0x011e, B:51:0x0128, B:53:0x013a, B:90:0x0200, B:91:0x021f, B:92:0x0220, B:93:0x0227), top: B:117:0x011e }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0155  */
        /* JADX WARN: Code duplicated, block: B:62:0x0184  */
        /* JADX WARN: Code duplicated, block: B:77:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:90:0x0200 A[Catch: all -> 0x01fb, TRY_ENTER, TryCatch #7 {all -> 0x01fb, blocks: (B:49:0x011e, B:51:0x0128, B:53:0x013a, B:90:0x0200, B:91:0x021f, B:92:0x0220, B:93:0x0227), top: B:117:0x011e }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0220 A[Catch: all -> 0x01fb, TryCatch #7 {all -> 0x01fb, blocks: (B:49:0x011e, B:51:0x0128, B:53:0x013a, B:90:0x0200, B:91:0x021f, B:92:0x0220, B:93:0x0227), top: B:117:0x011e }] */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x019c, code lost:
        
            if (r3.b(null, r11) == r1) goto L76;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:90:0x0200, please report this as an issue */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            Throwable th2;
            String str;
            String str2;
            String str3;
            String str4;
            Throwable th3;
            p098k7.a aVar;
            f fVar;
            p098k7.a aVar2;
            kotlin.jvm.internal.J j8;
            String strG;
            String strG2;
            p098k7.a aVar3;
            f fVar2;
            KnownHost.Device device;
            kotlin.jvm.internal.J j9;
            f fVar3;
            p098k7.a aVar4;
            Throwable th4;
            String str5;
            Object obj2;
            String str6;
            kotlin.jvm.internal.J j10;
            M3.m mVar;
            p098k7.a aVar5;
            f fVar4;
            Object objF = H6.c.f();
            AbstractC2633k abstractC2633k = null;
            try {
                try {
                    switch (this.f5917g) {
                        case 0:
                            C6.r.b(obj);
                            j8 = new kotlin.jvm.internal.J();
                            String strJ = P3.f.j(this.f5918h);
                            P3.i iVarA = strJ != null ? P3.i.a(strJ) : null;
                            if (iVarA == null) {
                                throw new IllegalArgumentException("Workstation ID is required");
                            }
                            strG = iVarA.g();
                            String strH = P3.f.h(this.f5918h);
                            P3.b bVarA = strH != null ? P3.b.a(strH) : null;
                            if (bVarA == null) {
                                throw new IllegalArgumentException("Device ID is required");
                            }
                            strG2 = bVarA.g();
                            Q qL = this.f5919i.L(this.f5918h);
                            this.f5911a = j8;
                            this.f5912b = strG;
                            this.f5913c = strG2;
                            this.f5917g = 1;
                            if (qL.Q0(this) != objF) {
                                aVar3 = this.f5919i.f5856j;
                                fVar2 = this.f5919i;
                                device = this.f5918h;
                                this.f5911a = j8;
                                this.f5912b = strG;
                                this.f5913c = strG2;
                                this.f5914d = aVar3;
                                this.f5915e = fVar2;
                                this.f5916f = device;
                                this.f5917g = 2;
                                if (aVar3.b(null, this) != objF) {
                                    j9 = j8;
                                    fVar3 = fVar2;
                                    aVar4 = aVar3;
                                    try {
                                        if (N3.h.j(fVar3.f5861o)) {
                                            throw new IllegalStateException("A request is already pending");
                                        }
                                        obj2 = fVar3.f5860n.get(P3.i.a(P3.f.k(device)));
                                        if (obj2 == null) {
                                            throw new IllegalStateException(("No open connection for workstation ID `" + strG + "`").toString());
                                        }
                                        j9.f28779a = obj2;
                                        this.f5911a = j9;
                                        this.f5912b = strG;
                                        this.f5913c = strG2;
                                        this.f5914d = aVar4;
                                        this.f5915e = fVar3;
                                        this.f5916f = null;
                                        this.f5917g = 3;
                                        if (M3.n.e((M3.m) obj2, this) != objF) {
                                            String str7 = strG;
                                            str6 = strG2;
                                            str3 = str7;
                                            j10 = j9;
                                            try {
                                                fVar3.f5861o = new c.b(str3, str6, null, 4, null);
                                                fVar3.Q();
                                                G g8 = G.f1419a;
                                                try {
                                                    aVar4.e(null);
                                                    try {
                                                        mVar = (M3.m) j10.f28779a;
                                                        this.f5911a = str3;
                                                        this.f5912b = str6;
                                                        this.f5913c = null;
                                                        this.f5914d = null;
                                                        this.f5915e = null;
                                                        this.f5917g = 4;
                                                        if (mVar.H(this) != objF) {
                                                            str4 = str6;
                                                            aVar5 = this.f5919i.f5856j;
                                                            fVar4 = this.f5919i;
                                                            this.f5911a = str3;
                                                            this.f5912b = str4;
                                                            this.f5913c = aVar5;
                                                            this.f5914d = fVar4;
                                                            this.f5917g = 5;
                                                        }
                                                        break;
                                                    } catch (Throwable th5) {
                                                        th3 = th5;
                                                        str4 = str6;
                                                        aVar = this.f5919i.f5856j;
                                                        fVar = this.f5919i;
                                                        this.f5911a = str3;
                                                        this.f5912b = str4;
                                                        this.f5913c = th3;
                                                        this.f5914d = aVar;
                                                        this.f5915e = fVar;
                                                        this.f5917g = 6;
                                                        if (aVar.b(null, this) != objF) {
                                                            aVar2 = aVar;
                                                            try {
                                                                c.b bVar = new c.b(str3, str4, new d.a(th3), abstractC2633k);
                                                                fVar.f5861o = bVar;
                                                                fVar.Q();
                                                                return bVar;
                                                            } finally {
                                                                aVar2.e(null);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    String str8 = str6;
                                                    str = str3;
                                                    str2 = str8;
                                                    return new c.b(str, str2, new d.a(th), abstractC2633k);
                                                }
                                            } catch (Throwable th7) {
                                                th4 = th7;
                                                str5 = str6;
                                                try {
                                                    aVar4.e(null);
                                                    throw th4;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    str = str3;
                                                    str2 = str5;
                                                    return new c.b(str, str2, new d.a(th), abstractC2633k);
                                                }
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th4 = th9;
                                        str5 = strG2;
                                        str3 = strG;
                                        aVar4.e(null);
                                        throw th4;
                                    }
                                }
                            }
                            return objF;
                        case 1:
                            strG2 = (String) this.f5913c;
                            strG = (String) this.f5912b;
                            j8 = (kotlin.jvm.internal.J) this.f5911a;
                            C6.r.b(obj);
                            aVar3 = this.f5919i.f5856j;
                            fVar2 = this.f5919i;
                            device = this.f5918h;
                            this.f5911a = j8;
                            this.f5912b = strG;
                            this.f5913c = strG2;
                            this.f5914d = aVar3;
                            this.f5915e = fVar2;
                            this.f5916f = device;
                            this.f5917g = 2;
                            if (aVar3.b(null, this) != objF) {
                                j9 = j8;
                                fVar3 = fVar2;
                                aVar4 = aVar3;
                                if (N3.h.j(fVar3.f5861o)) {
                                    throw new IllegalStateException("A request is already pending");
                                }
                                obj2 = fVar3.f5860n.get(P3.i.a(P3.f.k(device)));
                                if (obj2 == null) {
                                    throw new IllegalStateException(("No open connection for workstation ID `" + strG + "`").toString());
                                }
                                j9.f28779a = obj2;
                                this.f5911a = j9;
                                this.f5912b = strG;
                                this.f5913c = strG2;
                                this.f5914d = aVar4;
                                this.f5915e = fVar3;
                                this.f5916f = null;
                                this.f5917g = 3;
                                if (M3.n.e((M3.m) obj2, this) != objF) {
                                    String str9 = strG;
                                    str6 = strG2;
                                    str3 = str9;
                                    j10 = j9;
                                    fVar3.f5861o = new c.b(str3, str6, null, 4, null);
                                    fVar3.Q();
                                    G g9 = G.f1419a;
                                    aVar4.e(null);
                                    mVar = (M3.m) j10.f28779a;
                                    this.f5911a = str3;
                                    this.f5912b = str6;
                                    this.f5913c = null;
                                    this.f5914d = null;
                                    this.f5915e = null;
                                    this.f5917g = 4;
                                    if (mVar.H(this) != objF) {
                                        str4 = str6;
                                        aVar5 = this.f5919i.f5856j;
                                        fVar4 = this.f5919i;
                                        this.f5911a = str3;
                                        this.f5912b = str4;
                                        this.f5913c = aVar5;
                                        this.f5914d = fVar4;
                                        this.f5917g = 5;
                                    }
                                }
                                break;
                            }
                            return objF;
                        case 2:
                            KnownHost.Device device2 = (KnownHost.Device) this.f5916f;
                            f fVar5 = (f) this.f5915e;
                            p098k7.a aVar6 = (p098k7.a) this.f5914d;
                            strG2 = (String) this.f5913c;
                            strG = (String) this.f5912b;
                            j9 = (kotlin.jvm.internal.J) this.f5911a;
                            C6.r.b(obj);
                            device = device2;
                            fVar3 = fVar5;
                            aVar4 = aVar6;
                            if (N3.h.j(fVar3.f5861o)) {
                                throw new IllegalStateException("A request is already pending");
                            }
                            obj2 = fVar3.f5860n.get(P3.i.a(P3.f.k(device)));
                            if (obj2 == null) {
                                throw new IllegalStateException(("No open connection for workstation ID `" + strG + "`").toString());
                            }
                            j9.f28779a = obj2;
                            this.f5911a = j9;
                            this.f5912b = strG;
                            this.f5913c = strG2;
                            this.f5914d = aVar4;
                            this.f5915e = fVar3;
                            this.f5916f = null;
                            this.f5917g = 3;
                            if (M3.n.e((M3.m) obj2, this) != objF) {
                                String str10 = strG;
                                str6 = strG2;
                                str3 = str10;
                                j10 = j9;
                                fVar3.f5861o = new c.b(str3, str6, null, 4, null);
                                fVar3.Q();
                                G g10 = G.f1419a;
                                aVar4.e(null);
                                mVar = (M3.m) j10.f28779a;
                                this.f5911a = str3;
                                this.f5912b = str6;
                                this.f5913c = null;
                                this.f5914d = null;
                                this.f5915e = null;
                                this.f5917g = 4;
                                if (mVar.H(this) != objF) {
                                    str4 = str6;
                                    aVar5 = this.f5919i.f5856j;
                                    fVar4 = this.f5919i;
                                    this.f5911a = str3;
                                    this.f5912b = str4;
                                    this.f5913c = aVar5;
                                    this.f5914d = fVar4;
                                    this.f5917g = 5;
                                }
                                break;
                            }
                            return objF;
                        case 3:
                            fVar3 = (f) this.f5915e;
                            aVar4 = (p098k7.a) this.f5914d;
                            str5 = (String) this.f5913c;
                            str3 = (String) this.f5912b;
                            kotlin.jvm.internal.J j11 = (kotlin.jvm.internal.J) this.f5911a;
                            try {
                                C6.r.b(obj);
                                j10 = j11;
                                str6 = str5;
                                fVar3.f5861o = new c.b(str3, str6, null, 4, null);
                                fVar3.Q();
                                G g11 = G.f1419a;
                                aVar4.e(null);
                                mVar = (M3.m) j10.f28779a;
                                this.f5911a = str3;
                                this.f5912b = str6;
                                this.f5913c = null;
                                this.f5914d = null;
                                this.f5915e = null;
                                this.f5917g = 4;
                                if (mVar.H(this) != objF) {
                                    str4 = str6;
                                    aVar5 = this.f5919i.f5856j;
                                    fVar4 = this.f5919i;
                                    this.f5911a = str3;
                                    this.f5912b = str4;
                                    this.f5913c = aVar5;
                                    this.f5914d = fVar4;
                                    this.f5917g = 5;
                                    break;
                                }
                                return objF;
                            } catch (Throwable th10) {
                                th4 = th10;
                                aVar4.e(null);
                                throw th4;
                            }
                        case 4:
                            String str11 = (String) this.f5912b;
                            String str12 = (String) this.f5911a;
                            try {
                                C6.r.b(obj);
                                str3 = str12;
                                str4 = str11;
                                aVar5 = this.f5919i.f5856j;
                                fVar4 = this.f5919i;
                                this.f5911a = str3;
                                this.f5912b = str4;
                                this.f5913c = aVar5;
                                this.f5914d = fVar4;
                                this.f5917g = 5;
                            } catch (Throwable th11) {
                                th2 = th11;
                                str3 = str12;
                                str4 = str11;
                                th3 = th2;
                                aVar = this.f5919i.f5856j;
                                fVar = this.f5919i;
                                this.f5911a = str3;
                                this.f5912b = str4;
                                this.f5913c = th3;
                                this.f5914d = aVar;
                                this.f5915e = fVar;
                                this.f5917g = 6;
                                if (aVar.b(null, this) != objF) {
                                    aVar2 = aVar;
                                    c.b bVar2 = new c.b(str3, str4, new d.a(th3), abstractC2633k);
                                    fVar.f5861o = bVar2;
                                    fVar.Q();
                                    return bVar2;
                                }
                            }
                            break;
                        case 5:
                            fVar4 = (f) this.f5914d;
                            aVar5 = (p098k7.a) this.f5913c;
                            str4 = (String) this.f5912b;
                            str3 = (String) this.f5911a;
                            C6.r.b(obj);
                            try {
                                c.b bVar3 = new c.b(str3, str4, d.c.f5881a, abstractC2633k);
                                fVar4.f5861o = bVar3;
                                fVar4.Q();
                                return bVar3;
                            } finally {
                                aVar5.e(null);
                            }
                        case 6:
                            fVar = (f) this.f5915e;
                            aVar2 = (p098k7.a) this.f5914d;
                            th3 = (Throwable) this.f5913c;
                            str4 = (String) this.f5912b;
                            str3 = (String) this.f5911a;
                            C6.r.b(obj);
                            c.b bVar4 = new c.b(str3, str4, new d.a(th3), abstractC2633k);
                            fVar.f5861o = bVar4;
                            fVar.Q();
                            return bVar4;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th12) {
                    th2 = th12;
                    th3 = th2;
                    aVar = this.f5919i.f5856j;
                    fVar = this.f5919i;
                    this.f5911a = str3;
                    this.f5912b = str4;
                    this.f5913c = th3;
                    this.f5914d = aVar;
                    this.f5915e = fVar;
                    this.f5917g = 6;
                    if (aVar.b(null, this) != objF) {
                        aVar2 = aVar;
                        c.b bVar5 = new c.b(str3, str4, new d.a(th3), abstractC2633k);
                        fVar.f5861o = bVar5;
                        fVar.Q();
                        return bVar5;
                    }
                    return objF;
                }
            } catch (Throwable th13) {
                th = th13;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5922c;

        public j(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return f.this.new j(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((j) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            p098k7.a aVar;
            f fVar;
            Object objF = H6.c.f();
            int i8 = this.f5922c;
            if (i8 == 0) {
                C6.r.b(obj);
                aVar = f.this.f5856j;
                f fVar2 = f.this;
                this.f5920a = aVar;
                this.f5921b = fVar2;
                this.f5922c = 1;
                if (aVar.b(null, this) == objF) {
                    return objF;
                }
                fVar = fVar2;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (f) this.f5921b;
                aVar = (p098k7.a) this.f5920a;
                C6.r.b(obj);
            }
            try {
                c cVar = fVar.f5861o;
                if ((cVar != null ? cVar.a() : null) instanceof d.a) {
                    fVar.f5861o = null;
                    fVar.Q();
                }
                G g8 = G.f1419a;
                return G.f1419a;
            } finally {
                aVar.e(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5927d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5929f;

        public k(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5927d = obj;
            this.f5929f |= Integer.MIN_VALUE;
            return f.this.E(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l implements InterfaceC2261g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M3.m f5931b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends kotlin.jvm.internal.u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ M3.m f5932a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(M3.m mVar) {
                super(2);
                this.f5932a = mVar;
            }

            public final b b(String str, b bVar) {
                String str2;
                b bVarC;
                kotlin.jvm.internal.t.g(str, "<anonymous parameter 0>");
                String strH = this.f5932a.J().h();
                if (strH == null || Z6.w.b0(strH)) {
                    strH = null;
                }
                if (strH != null) {
                    str2 = strH;
                } else {
                    String strE = bVar != null ? bVar.e() : null;
                    if (strE == null) {
                        strH = "<null>";
                        str2 = strH;
                    } else {
                        str2 = strE;
                    }
                }
                return (bVar == null || (bVarC = b.c(bVar, null, str2, null, true, 5, null)) == null) ? new b(this.f5932a.L(), str2, null, true, 4, null) : bVarC;
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((P3.i) obj).g(), (b) obj2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f5933a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f5934b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f5935c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f5936d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f5938f;

            public b(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f5936d = obj;
                this.f5938f |= Integer.MIN_VALUE;
                return l.this.emit(null, this);
            }
        }

        public l(M3.m mVar) {
            this.f5931b = mVar;
        }

        public static final b g(Q6.o tmp0, Object obj, Object obj2) {
            kotlin.jvm.internal.t.g(tmp0, "$tmp0");
            return (b) tmp0.invoke(obj, obj2);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2261g
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object emit(M3.g gVar, G6.d dVar) {
            b bVar;
            p098k7.a aVar;
            f fVar;
            M3.m mVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i8 = bVar.f5938f;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    bVar.f5938f = i8 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f5936d;
            Object objF = H6.c.f();
            int i9 = bVar.f5938f;
            try {
                if (i9 == 0) {
                    C6.r.b(obj);
                    if (gVar instanceof M3.g.f ? true : gVar instanceof M3.g.e) {
                        p098k7.a aVar2 = f.this.f5856j;
                        f fVar2 = f.this;
                        M3.m mVar2 = this.f5931b;
                        bVar.f5933a = aVar2;
                        bVar.f5934b = fVar2;
                        bVar.f5935c = mVar2;
                        bVar.f5938f = 1;
                        if (aVar2.b(null, bVar) == objF) {
                            return objF;
                        }
                        aVar = aVar2;
                        fVar = fVar2;
                        mVar = mVar2;
                    } else if (gVar instanceof M3.g.C0186g) {
                        f.this.f5851e.m(this.f5931b);
                    }
                    return G.f1419a;
                }
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (M3.m) bVar.f5935c;
                fVar = (f) bVar.f5934b;
                aVar = (p098k7.a) bVar.f5933a;
                C6.r.b(obj);
                Map map = fVar.f5859m;
                P3.i iVarA = P3.i.a(mVar.L());
                final a aVar3 = new a(mVar);
                map.compute(iVarA, new BiFunction() { // from class: N3.g
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj2, Object obj3) {
                        return f.l.g(aVar3, obj2, obj3);
                    }
                });
                fVar.Q();
                G g8 = G.f1419a;
                return G.f1419a;
            } finally {
                aVar.e(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends kotlin.jvm.internal.u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f5939a = new m();

        public m() {
            super(2);
        }

        public final b b(String str, b v8) {
            kotlin.jvm.internal.t.g(str, "<anonymous parameter 0>");
            kotlin.jvm.internal.t.g(v8, "v");
            return b.c(v8, null, null, null, false, 7, null);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((P3.i) obj).g(), (b) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5943d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5945f;

        public n(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5943d = obj;
            this.f5945f |= Integer.MIN_VALUE;
            return f.this.G(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends kotlin.jvm.internal.u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f5946a = new o();

        public o() {
            super(2);
        }

        public final b b(String str, b bVar) {
            kotlin.jvm.internal.t.g(str, "<anonymous parameter 0>");
            if (bVar != null) {
                return b.c(bVar, null, null, null, false, 7, null);
            }
            return null;
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((P3.i) obj).g(), (b) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5948b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5950a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5951b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List f5952c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f f5953d;

            /* JADX INFO: renamed from: N3.f$p$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0221a extends I6.l implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f5954a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f5955b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ N3.p f5956c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0221a(f fVar, N3.p pVar, G6.d dVar) {
                    super(2, dVar);
                    this.f5955b = fVar;
                    this.f5956c = pVar;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new C0221a(this.f5955b, this.f5956c, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((C0221a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f5954a;
                    if (i8 == 0) {
                        C6.r.b(obj);
                        f fVar = this.f5955b;
                        N3.p pVar = this.f5956c;
                        this.f5954a = 1;
                        if (fVar.O(pVar, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, f fVar, G6.d dVar) {
                super(2, dVar);
                this.f5952c = list;
                this.f5953d = fVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f5952c, this.f5953d, dVar);
                aVar.f5951b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f5950a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                J j8 = (J) this.f5951b;
                Iterator it = this.f5952c.iterator();
                while (it.hasNext()) {
                    AbstractC1789i.d(j8, null, null, new C0221a(this.f5953d, (N3.p) it.next(), null), 3, null);
                }
                return G.f1419a;
            }
        }

        public p(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            p pVar = f.this.new p(dVar);
            pVar.f5948b = obj;
            return pVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, G6.d dVar) {
            return ((p) create(list, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0077  */
        /* JADX WARN: Code duplicated, block: B:23:0x0089  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
        
            if (p017b7.U.a(500, r10) == r0) goto L29;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c7 -> B:7:0x0018). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            List list2;
            Z2.j jVar;
            String str;
            String strC;
            Z2.p pVar;
            a aVar;
            Object objF = H6.c.f();
            int i8 = this.f5947a;
            if (i8 == 0) {
                C6.r.b(obj);
                list = (List) this.f5948b;
                if (list.isEmpty()) {
                    return G.f1419a;
                }
                Z2.j jVar2 = f.f5846q;
                String str2 = "---> Scheduling " + list.size() + " hosts for reachability check";
                String strC2 = jVar2.c();
                Z2.p pVar2 = Z2.p.Info;
                if (jVar2.a().a().compareTo(pVar2) <= 0) {
                    jVar2.b(pVar2, strC2, null, str2);
                }
                if (AbstractC1823z0.q(getContext())) {
                    return G.f1419a;
                }
                aVar = new a(list, f.this, null);
                this.f5948b = list;
                this.f5947a = 1;
                if (K.f(aVar, this) != objF) {
                    list2 = list;
                    jVar = f.f5846q;
                    str = "---> Rescheduling " + list2.size() + " hosts for reachability check";
                    strC = jVar.c();
                    pVar = Z2.p.Debug;
                    if (jVar.a().a().compareTo(pVar) <= 0) {
                        jVar.b(pVar, strC, null, str);
                    }
                    this.f5948b = list2;
                    this.f5947a = 2;
                }
                return objF;
            }
            if (i8 == 1) {
                list2 = (List) this.f5948b;
                C6.r.b(obj);
                jVar = f.f5846q;
                str = "---> Rescheduling " + list2.size() + " hosts for reachability check";
                strC = jVar.c();
                pVar = Z2.p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, str);
                }
                this.f5948b = list2;
                this.f5947a = 2;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.f5948b;
                C6.r.b(obj);
            }
            list = list2;
            if (AbstractC1823z0.q(getContext())) {
                return G.f1419a;
            }
            aVar = new a(list, f.this, null);
            this.f5948b = list;
            this.f5947a = 1;
            if (K.f(aVar, this) != objF) {
                list2 = list;
                jVar = f.f5846q;
                str = "---> Rescheduling " + list2.size() + " hosts for reachability check";
                strC = jVar.c();
                pVar = Z2.p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, str);
                }
                this.f5948b = list2;
                this.f5947a = 2;
            }
            return objF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f5957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f5958b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f5959a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f5960b;

            /* JADX INFO: renamed from: N3.f$q$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0222a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f5961a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f5962b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f5963c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Object f5965e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Object f5966f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public Object f5967g;

                public C0222a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f5961a = obj;
                    this.f5962b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g, f fVar) {
                this.f5959a = interfaceC2261g;
                this.f5960b = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0121, code lost:
            
                if (r8.emit(r6, r2) == r3) goto L36;
             */
            @Override // p044e7.InterfaceC2261g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, G6.d dVar) {
                C0222a c0222a;
                InterfaceC2261g interfaceC2261g;
                p098k7.a aVar;
                AppSettings appSettings;
                a aVar2;
                b bVar;
                if (dVar instanceof C0222a) {
                    c0222a = (C0222a) dVar;
                    int i8 = c0222a.f5962b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0222a.f5962b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0222a = new C0222a(dVar);
                    }
                } else {
                    c0222a = new C0222a(dVar);
                }
                Object obj2 = c0222a.f5961a;
                Object objF = H6.c.f();
                int i9 = c0222a.f5962b;
                try {
                    if (i9 != 0) {
                        if (i9 == 1) {
                            aVar = (p098k7.a) c0222a.f5967g;
                            appSettings = (AppSettings) c0222a.f5966f;
                            interfaceC2261g = (InterfaceC2261g) c0222a.f5965e;
                            aVar2 = (a) c0222a.f5963c;
                            C6.r.b(obj2);
                        } else {
                            if (i9 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C6.r.b(obj2);
                        }
                        return G.f1419a;
                    }
                    C6.r.b(obj2);
                    interfaceC2261g = this.f5959a;
                    AppSettings appSettings2 = (AppSettings) obj;
                    aVar = this.f5960b.f5856j;
                    c0222a.f5963c = this;
                    c0222a.f5965e = interfaceC2261g;
                    c0222a.f5966f = appSettings2;
                    c0222a.f5967g = aVar;
                    c0222a.f5962b = 1;
                    if (aVar.b(null, c0222a) != objF) {
                        appSettings = appSettings2;
                        aVar2 = this;
                    }
                    return objF;
                    List<KnownHost> knownHostsList = appSettings.getKnownHostsList();
                    kotlin.jvm.internal.t.f(knownHostsList, "getKnownHostsList(...)");
                    ArrayList arrayList = new ArrayList(C0938s.y(knownHostsList, 10));
                    for (KnownHost knownHost : knownHostsList) {
                        Map map = aVar2.f5960b.f5859m;
                        kotlin.jvm.internal.t.d(knownHost);
                        b bVar2 = (b) map.get(P3.i.a(P3.f.f(knownHost)));
                        if (bVar2 != null) {
                            String displayName = knownHost.getDisplayName();
                            kotlin.jvm.internal.t.f(displayName, "getDisplayName(...)");
                            bVar = b.c(bVar2, null, displayName, knownHost, false, 9, null);
                            if (bVar == null) {
                                String strF = P3.f.f(knownHost);
                                String displayName2 = knownHost.getDisplayName();
                                kotlin.jvm.internal.t.f(displayName2, "getDisplayName(...)");
                                bVar = new b(strF, displayName2, knownHost, false, 8, null);
                            }
                        } else {
                            String strF2 = P3.f.f(knownHost);
                            String displayName3 = knownHost.getDisplayName();
                            kotlin.jvm.internal.t.f(displayName3, "getDisplayName(...)");
                            bVar = new b(strF2, displayName3, knownHost, false, 8, null);
                        }
                        aVar2.f5960b.f5859m.put(P3.i.a(P3.f.f(knownHost)), bVar);
                        String strF3 = P3.f.f(knownHost);
                        String displayName4 = knownHost.getDisplayName();
                        kotlin.jvm.internal.t.f(displayName4, "getDisplayName(...)");
                        arrayList.add(new N3.p(strF3, displayName4, C0937q.e(knownHost.getLastEndpoint()), null));
                    }
                    aVar2.f5960b.Q();
                    aVar.e(null);
                    c0222a.f5963c = null;
                    c0222a.f5965e = null;
                    c0222a.f5966f = null;
                    c0222a.f5967g = null;
                    c0222a.f5962b = 2;
                } catch (Throwable th) {
                    aVar.e(null);
                    throw th;
                }
            }
        }

        public q(InterfaceC2260f interfaceC2260f, f fVar) {
            this.f5957a = interfaceC2260f;
            this.f5958b = fVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f5957a.collect(new a(interfaceC2261g, this.f5958b), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f5973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5974g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f5975h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f f5976i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(KnownHost.Device device, f fVar, G6.d dVar) {
            super(2, dVar);
            this.f5975h = device;
            this.f5976i = fVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new r(this.f5975h, this.f5976i, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((r) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:58:0x0170  */
        /* JADX WARN: Code duplicated, block: B:62:0x018b  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.jvm.internal.J] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v16 */
        /* JADX WARN: Type inference failed for: r5v17 */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v22 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v8, types: [kotlin.jvm.internal.J] */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            ?? r8;
            ?? r9;
            String strG;
            ?? r10;
            Throwable th;
            p098k7.a aVar;
            f fVar;
            ?? r11;
            ?? r12;
            p098k7.a aVar2;
            KnownHost.Device device;
            String str;
            f fVar2;
            p098k7.a aVar3;
            String str2;
            String str3;
            ?? r13;
            String str4;
            M3.m mVar;
            KnownHost.Device device2;
            String str5;
            String str6;
            p098k7.a aVar4;
            f fVar3;
            p098k7.a aVar5;
            f fVar4;
            Object objF = H6.c.f();
            int i8 = this.f5974g;
            ?? r14 = 3;
            ?? r15 = 2;
            AbstractC2633k abstractC2633k = null;
            try {
                try {
                    try {
                        if (i8 == 0) {
                            C6.r.b(obj);
                            V3.f.b(N3.h.h(f.f5845p, this.f5975h));
                            kotlin.jvm.internal.J j8 = new kotlin.jvm.internal.J();
                            String strJ = P3.f.j(this.f5975h);
                            P3.i iVarA = strJ != null ? P3.i.a(strJ) : null;
                            if (iVarA == null) {
                                throw new IllegalArgumentException("Workstation ID is required");
                            }
                            strG = iVarA.g();
                            String strH = P3.f.h(this.f5975h);
                            P3.b bVarA = strH != null ? P3.b.a(strH) : null;
                            if (bVarA == null) {
                                throw new IllegalArgumentException("Device ID is required");
                            }
                            String strG2 = bVarA.g();
                            aVar2 = this.f5976i.f5856j;
                            f fVar5 = this.f5976i;
                            device = this.f5975h;
                            this.f5968a = j8;
                            this.f5969b = strG;
                            this.f5970c = strG2;
                            this.f5971d = aVar2;
                            this.f5972e = fVar5;
                            this.f5973f = device;
                            this.f5974g = 1;
                            if (aVar2.b(null, this) != objF) {
                                str = strG2;
                                r10 = j8;
                                fVar2 = fVar5;
                            }
                            return objF;
                        }
                        if (i8 != 1) {
                            if (i8 == 2) {
                                fVar2 = (f) this.f5972e;
                                aVar3 = (p098k7.a) this.f5971d;
                                str = (String) this.f5970c;
                                str2 = (String) this.f5969b;
                                kotlin.jvm.internal.J j9 = (kotlin.jvm.internal.J) this.f5968a;
                                try {
                                    C6.r.b(obj);
                                    str3 = str;
                                    r13 = j9;
                                    str4 = str2;
                                    try {
                                        fVar2.f5861o = new c.C0219c(str4, str3, null, 4, null);
                                        fVar2.Q();
                                        G g8 = G.f1419a;
                                        try {
                                            aVar3.e(null);
                                            try {
                                                mVar = (M3.m) r13.f28779a;
                                                device2 = this.f5975h;
                                                this.f5968a = str4;
                                                this.f5969b = str3;
                                                this.f5970c = null;
                                                this.f5971d = null;
                                                this.f5972e = null;
                                                this.f5974g = 3;
                                                if (mVar.U(device2, this) != objF) {
                                                    str5 = str4;
                                                    str6 = str3;
                                                    aVar4 = this.f5976i.f5856j;
                                                    fVar3 = this.f5976i;
                                                    this.f5968a = str5;
                                                    this.f5969b = str6;
                                                    this.f5970c = aVar4;
                                                    this.f5971d = fVar3;
                                                    this.f5974g = 4;
                                                    if (aVar4.b(null, this) != objF) {
                                                        aVar5 = aVar4;
                                                        fVar4 = fVar3;
                                                        r14 = str6;
                                                        r15 = str5;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r9 = str4;
                                                r8 = str3;
                                                p098k7.a aVar6 = this.f5976i.f5856j;
                                                f fVar6 = this.f5976i;
                                                this.f5968a = r9;
                                                this.f5969b = r8;
                                                this.f5970c = th;
                                                this.f5971d = aVar6;
                                                this.f5972e = fVar6;
                                                this.f5974g = 5;
                                                if (aVar6.b(null, this) != objF) {
                                                    th = th;
                                                    aVar = aVar6;
                                                    fVar = fVar6;
                                                    r12 = r8;
                                                    r11 = r9;
                                                    c.C0219c c0219c = new c.C0219c(r11, r12, new d.a(th), abstractC2633k);
                                                    fVar.f5861o = c0219c;
                                                    fVar.Q();
                                                    return c0219c;
                                                }
                                            }
                                            return objF;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            String str7 = str3;
                                            strG = str4;
                                            r10 = str7;
                                            return new c.C0219c(strG, r10, new d.a(th), abstractC2633k);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str2 = str4;
                                        str = str3;
                                        try {
                                            aVar3.e(null);
                                            throw th;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            r10 = str;
                                            strG = str2;
                                            return new c.C0219c(strG, r10, new d.a(th), abstractC2633k);
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    aVar3.e(null);
                                    throw th;
                                }
                            }
                            if (i8 == 3) {
                                String str8 = (String) this.f5969b;
                                String str9 = (String) this.f5968a;
                                C6.r.b(obj);
                                str6 = str8;
                                str5 = str9;
                                aVar4 = this.f5976i.f5856j;
                                fVar3 = this.f5976i;
                                this.f5968a = str5;
                                this.f5969b = str6;
                                this.f5970c = aVar4;
                                this.f5971d = fVar3;
                                this.f5974g = 4;
                                if (aVar4.b(null, this) != objF) {
                                    aVar5 = aVar4;
                                    fVar4 = fVar3;
                                    r14 = str6;
                                    r15 = str5;
                                }
                                return objF;
                            }
                            if (i8 != 4) {
                                if (i8 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                fVar = (f) this.f5972e;
                                aVar = (p098k7.a) this.f5971d;
                                th = (Throwable) this.f5970c;
                                String str10 = (String) this.f5969b;
                                String str11 = (String) this.f5968a;
                                C6.r.b(obj);
                                r12 = str10;
                                r11 = str11;
                                try {
                                    c.C0219c c0219c2 = new c.C0219c(r11, r12, new d.a(th), abstractC2633k);
                                    fVar.f5861o = c0219c2;
                                    fVar.Q();
                                    return c0219c2;
                                } finally {
                                    aVar.e(null);
                                }
                            }
                            fVar4 = (f) this.f5971d;
                            aVar5 = (p098k7.a) this.f5970c;
                            String str12 = (String) this.f5969b;
                            String str13 = (String) this.f5968a;
                            C6.r.b(obj);
                            r14 = str12;
                            r15 = str13;
                            try {
                                c.C0219c c0219c3 = new c.C0219c(r15, r14, d.c.f5881a, abstractC2633k);
                                fVar4.f5861o = c0219c3;
                                fVar4.Q();
                                return c0219c3;
                            } finally {
                                aVar5.e(null);
                            }
                        }
                        KnownHost.Device device3 = (KnownHost.Device) this.f5973f;
                        f fVar7 = (f) this.f5972e;
                        aVar2 = (p098k7.a) this.f5971d;
                        String str14 = (String) this.f5970c;
                        strG = (String) this.f5969b;
                        kotlin.jvm.internal.J j10 = (kotlin.jvm.internal.J) this.f5968a;
                        C6.r.b(obj);
                        device = device3;
                        fVar2 = fVar7;
                        str = str14;
                        r10 = j10;
                        if (N3.h.j(fVar2.f5861o)) {
                            throw new IllegalStateException("A request is already pending");
                        }
                        Object obj2 = fVar2.f5860n.get(P3.i.a(P3.f.k(device)));
                        if (obj2 == null) {
                            throw new IllegalStateException(("No open connection for workstation ID `" + strG + "`").toString());
                        }
                        r10.f28779a = obj2;
                        this.f5968a = r10;
                        this.f5969b = strG;
                        this.f5970c = str;
                        this.f5971d = aVar2;
                        this.f5972e = fVar2;
                        this.f5973f = null;
                        this.f5974g = 2;
                        if (M3.n.b((M3.m) obj2, this) != objF) {
                            String str15 = strG;
                            str3 = str;
                            r13 = r10;
                            str4 = str15;
                            aVar3 = aVar2;
                            fVar2.f5861o = new c.C0219c(str4, str3, null, 4, null);
                            fVar2.Q();
                            G g9 = G.f1419a;
                            aVar3.e(null);
                            mVar = (M3.m) r13.f28779a;
                            device2 = this.f5975h;
                            this.f5968a = str4;
                            this.f5969b = str3;
                            this.f5970c = null;
                            this.f5971d = null;
                            this.f5972e = null;
                            this.f5974g = 3;
                            if (mVar.U(device2, this) != objF) {
                                str5 = str4;
                                str6 = str3;
                                aVar4 = this.f5976i.f5856j;
                                fVar3 = this.f5976i;
                                this.f5968a = str5;
                                this.f5969b = str6;
                                this.f5970c = aVar4;
                                this.f5971d = fVar3;
                                this.f5974g = 4;
                                if (aVar4.b(null, this) != objF) {
                                    aVar5 = aVar4;
                                    fVar4 = fVar3;
                                    r14 = str6;
                                    r15 = str5;
                                    c.C0219c c0219c4 = new c.C0219c(r15, r14, d.c.f5881a, abstractC2633k);
                                    fVar4.f5861o = c0219c4;
                                    fVar4.Q();
                                    return c0219c4;
                                }
                            }
                        }
                        return objF;
                    } catch (Throwable th7) {
                        th = th7;
                        aVar3 = aVar2;
                        str2 = strG;
                        aVar3.e(null);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r8 = r14;
                    r9 = r15;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5979c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5981a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5982b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f5983c;

            /* JADX INFO: renamed from: N3.f$s$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0223a extends I6.l implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f5984a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f5985b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0223a(f fVar, G6.d dVar) {
                    super(2, dVar);
                    this.f5985b = fVar;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new C0223a(this.f5985b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((C0223a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f5984a;
                    if (i8 == 0) {
                        C6.r.b(obj);
                        f fVar = this.f5985b;
                        this.f5984a = 1;
                        if (fVar.J(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    return G.f1419a;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends I6.l implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f5986a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f5987b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f f5988c;

                /* JADX INFO: renamed from: N3.f$s$a$b$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0224a extends I6.l implements Q6.p {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f5989a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public /* synthetic */ Object f5990b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public /* synthetic */ Object f5991c;

                    public C0224a(G6.d dVar) {
                        super(3, dVar);
                    }

                    @Override // Q6.p
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(List list, List list2, G6.d dVar) {
                        C0224a c0224a = new C0224a(dVar);
                        c0224a.f5990b = list;
                        c0224a.f5991c = list2;
                        return c0224a.invokeSuspend(G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        H6.c.f();
                        if (this.f5989a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                        return N3.q.a((List) this.f5990b, (List) this.f5991c);
                    }
                }

                /* JADX INFO: renamed from: N3.f$s$a$b$b, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public /* synthetic */ class C0225b implements InterfaceC2261g, InterfaceC2636n {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ f f5992a;

                    public C0225b(f fVar) {
                        this.f5992a = fVar;
                    }

                    @Override // kotlin.jvm.internal.InterfaceC2636n
                    public final InterfaceC0919h a() {
                        return new C2639q(2, this.f5992a, f.class, "updateReachabilityCheckQueue", "updateReachabilityCheckQueue(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    }

                    public final boolean equals(Object obj) {
                        if ((obj instanceof InterfaceC2261g) && (obj instanceof InterfaceC2636n)) {
                            return kotlin.jvm.internal.t.c(a(), ((InterfaceC2636n) obj).a());
                        }
                        return false;
                    }

                    @Override // p044e7.InterfaceC2261g
                    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List list, G6.d dVar) {
                        Object objR = this.f5992a.R(list, dVar);
                        return objR == H6.c.f() ? objR : G.f1419a;
                    }

                    public final int hashCode() {
                        return a().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(f fVar, G6.d dVar) {
                    super(2, dVar);
                    this.f5988c = fVar;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new b(this.f5988c, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
                
                    if (r6.collect(r3, r5) == r0) goto L20;
                 */
                @Override // I6.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    InterfaceC2260f interfaceC2260f;
                    Object objF = H6.c.f();
                    int i8 = this.f5987b;
                    if (i8 == 0) {
                        C6.r.b(obj);
                        f fVar = this.f5988c;
                        this.f5987b = 1;
                        obj = fVar.K(this);
                        if (obj != objF) {
                        }
                        return objF;
                    }
                    if (i8 == 1) {
                        C6.r.b(obj);
                    } else if (i8 == 2) {
                        interfaceC2260f = (InterfaceC2260f) this.f5986a;
                        C6.r.b(obj);
                        InterfaceC2260f interfaceC2260fP = AbstractC2262h.p(AbstractC2262h.k(interfaceC2260f, (InterfaceC2260f) obj, new C0224a(null)));
                        C0225b c0225b = new C0225b(this.f5988c);
                        this.f5986a = null;
                        this.f5987b = 3;
                    } else {
                        if (i8 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    return G.f1419a;
                    interfaceC2260f = (InterfaceC2260f) obj;
                    f fVar2 = this.f5988c;
                    this.f5986a = interfaceC2260f;
                    this.f5987b = 2;
                    obj = fVar2.I(this);
                    if (obj != objF) {
                        InterfaceC2260f interfaceC2260fP2 = AbstractC2262h.p(AbstractC2262h.k(interfaceC2260f, (InterfaceC2260f) obj, new C0224a(null)));
                        C0225b c0225b2 = new C0225b(this.f5988c);
                        this.f5986a = null;
                        this.f5987b = 3;
                    }
                    return objF;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, G6.d dVar) {
                super(2, dVar);
                this.f5983c = fVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f5983c, dVar);
                aVar.f5982b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f5981a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                J j8 = (J) this.f5982b;
                AbstractC1789i.d(j8, null, null, new C0223a(this.f5983c, null), 3, null);
                return AbstractC1789i.d(j8, null, null, new b(this.f5983c, null), 3, null);
            }
        }

        public s(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return f.this.new s(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((s) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        
            if (p017b7.K.f(r7, r6) == r0) goto L22;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            f fVar;
            p098k7.a aVar;
            Object objF = H6.c.f();
            int i8 = this.f5979c;
            try {
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            aVar = (p098k7.a) this.f5978b;
                            fVar = (f) this.f5977a;
                            C6.r.b(obj);
                        } else {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C6.r.b(obj);
                        }
                        return G.f1419a;
                    }
                    C6.r.b(obj);
                    fVar = f.this;
                    aVar = fVar.f5856j;
                    this.f5977a = fVar;
                    this.f5978b = aVar;
                    this.f5979c = 1;
                    if (aVar.b(null, this) != objF) {
                    }
                    return objF;
                    p044e7.x xVar = fVar.f5857k;
                    xVar.setValue(e.a.f5882a);
                    G g8 = G.f1419a;
                    aVar.e(null);
                    a aVar2 = new a(f.this, null);
                    this.f5977a = null;
                    this.f5978b = null;
                    this.f5979c = 2;
                } catch (Throwable th) {
                    aVar.e(null);
                    throw th;
                }
            } catch (Throwable th2) {
                if (!(th2 instanceof CancellationException)) {
                    V3.f.b(new V3.g.c(th2));
                    Z2.j jVar = f.f5846q;
                    String strC = jVar.c();
                    Z2.p pVar = Z2.p.Error;
                    if (jVar.a().a().compareTo(pVar) <= 0) {
                        jVar.b(pVar, strC, th2, "start failed");
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class t extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5996d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5998f;

        public t(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5996d = obj;
            this.f5998f |= Integer.MIN_VALUE;
            return f.this.N(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class u extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f6000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f6001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f6002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f6003e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6005g;

        public u(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f6003e = obj;
            this.f6005g |= Integer.MIN_VALUE;
            return f.this.O(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class v extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6006a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ M3.m f6008c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(M3.m mVar, G6.d dVar) {
            super(2, dVar);
            this.f6008c = mVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return f.this.new v(this.f6008c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((v) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f6006a;
            if (i8 == 0) {
                C6.r.b(obj);
                f fVar = f.this;
                M3.m mVar = this.f6008c;
                this.f6006a = 1;
                if (fVar.E(mVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class w extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f6009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f6010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6011c;

        public w(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return f.this.new w(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((w) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            p098k7.a aVar;
            f fVar;
            Object value;
            Object objF = H6.c.f();
            int i8 = this.f6011c;
            if (i8 == 0) {
                C6.r.b(obj);
                aVar = f.this.f5856j;
                f fVar2 = f.this;
                this.f6009a = aVar;
                this.f6010b = fVar2;
                this.f6011c = 1;
                if (aVar.b(null, this) == objF) {
                    return objF;
                }
                fVar = fVar2;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (f) this.f6010b;
                aVar = (p098k7.a) this.f6009a;
                C6.r.b(obj);
            }
            try {
                fVar.f5857k.setValue(e.b.f5883a);
                fVar.f5859m.clear();
                for (M3.m mVar : fVar.f5860n.values()) {
                    if (fVar.f5851e.d() != mVar) {
                        M3.m.A(mVar, null, 1, null);
                    }
                }
                fVar.f5860n.clear();
                p044e7.x xVar = fVar.f5858l;
                do {
                    value = xVar.getValue();
                } while (!xVar.b(value, D6.r.n()));
                fVar.f5861o = null;
                G g8 = G.f1419a;
                return G.f1419a;
            } finally {
                aVar.e(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class x extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f6013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f6014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f6015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f6016d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6018f;

        public x(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f6016d = obj;
            this.f6018f |= Integer.MIN_VALUE;
            return f.this.R(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class y implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(((N3.p) obj).c()), Integer.valueOf(((N3.p) obj2).c()));
        }
    }

    public f(N3.b discoveryFlow, AppSettingsStore store, M3.o connectionFactory, CryptoBox cryptoBox, M3.p connectionHolder, G6.g coroutineContext, int i8) {
        kotlin.jvm.internal.t.g(discoveryFlow, "discoveryFlow");
        kotlin.jvm.internal.t.g(store, "store");
        kotlin.jvm.internal.t.g(connectionFactory, "connectionFactory");
        kotlin.jvm.internal.t.g(cryptoBox, "cryptoBox");
        kotlin.jvm.internal.t.g(connectionHolder, "connectionHolder");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        this.f5847a = discoveryFlow;
        this.f5848b = store;
        this.f5849c = connectionFactory;
        this.f5850d = cryptoBox;
        this.f5851e = connectionHolder;
        this.f5852f = i8;
        this.f5853g = p098k7.f.b(i8, 0, 2, null);
        this.f5854h = new AtomicBoolean(false);
        this.f5855i = K.a(coroutineContext.P1(S0.a((InterfaceC1815v0) coroutineContext.A(InterfaceC1815v0.f15985O))).P1(new I("DiscoveryService")));
        this.f5856j = p098k7.c.b(false, 1, null);
        this.f5857k = O.a(e.b.f5883a);
        this.f5858l = O.a(D6.r.n());
        this.f5859m = new LinkedHashMap();
        this.f5860n = new LinkedHashMap();
    }

    public static final b F(Q6.o tmp0, Object obj, Object obj2) {
        kotlin.jvm.internal.t.g(tmp0, "$tmp0");
        return (b) tmp0.invoke(obj, obj2);
    }

    public static final b H(Q6.o tmp0, Object obj, Object obj2) {
        kotlin.jvm.internal.t.g(tmp0, "$tmp0");
        return (b) tmp0.invoke(obj, obj2);
    }

    public final void A() {
        AbstractC1789i.d(this.f5855i, null, null, new j(null), 3, null);
    }

    public final e B() {
        return (e) this.f5857k.getValue();
    }

    public final M C() {
        return this.f5857k;
    }

    public final Map D(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Endpoint endpointA = P3.c.a(((N3.p) obj).e());
            Endpoint.Source source = endpointA != null ? endpointA.getSource() : null;
            if (source == null) {
                source = Endpoint.Source.UNRECOGNIZED;
            } else {
                kotlin.jvm.internal.t.d(source);
            }
            Object arrayList = linkedHashMap.get(source);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(source, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(L.d(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Integer.valueOf(((List) entry.getValue()).size()));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[Catch: all -> 0x0098, TryCatch #2 {all -> 0x0098, blocks: (B:27:0x0082, B:29:0x0094, B:32:0x009a), top: B:43:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r8.collect(r2, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(M3.m mVar, G6.d dVar) {
        k kVar;
        f fVar;
        p098k7.a aVar;
        M3.m mVar2;
        p098k7.a aVar2;
        f fVar2;
        M3.m mVar3;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i8 = kVar.f5929f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                kVar.f5929f = i8 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object obj = kVar.f5927d;
        Object objF = H6.c.f();
        int i9 = kVar.f5929f;
        if (i9 == 0) {
            C6.r.b(obj);
            try {
                InterfaceC2260f interfaceC2260fF = M3.n.f(mVar);
                l lVar = new l(mVar);
                kVar.f5924a = this;
                kVar.f5925b = mVar;
                kVar.f5929f = 1;
            } catch (Throwable unused) {
                fVar = this;
                AbstractC1823z0.l(kVar.getContext());
                aVar = fVar.f5856j;
                kVar.f5924a = fVar;
                kVar.f5925b = mVar;
                kVar.f5926c = aVar;
                kVar.f5929f = 2;
                if (aVar.b(null, kVar) != objF) {
                    mVar2 = mVar;
                    aVar2 = aVar;
                    fVar2 = fVar;
                    mVar3 = (M3.m) fVar2.f5860n.remove(P3.i.a(mVar2.L()));
                    if (mVar3 != null) {
                        M3.m.A(mVar3, null, 1, null);
                    }
                    Map map = fVar2.f5859m;
                    P3.i iVarA = P3.i.a(mVar2.L());
                    final m mVar4 = m.f5939a;
                    map.computeIfPresent(iVarA, new BiFunction() { // from class: N3.d
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj2, Object obj3) {
                            return f.F(mVar4, obj2, obj3);
                        }
                    });
                    fVar2.Q();
                    G g8 = G.f1419a;
                    return G.f1419a;
                }
                return objF;
            }
        } else if (i9 == 1) {
            mVar = (M3.m) kVar.f5925b;
            fVar = (f) kVar.f5924a;
            try {
                C6.r.b(obj);
            } catch (Throwable unused2) {
                AbstractC1823z0.l(kVar.getContext());
                aVar = fVar.f5856j;
                kVar.f5924a = fVar;
                kVar.f5925b = mVar;
                kVar.f5926c = aVar;
                kVar.f5929f = 2;
                if (aVar.b(null, kVar) != objF) {
                    mVar2 = mVar;
                    aVar2 = aVar;
                    fVar2 = fVar;
                    mVar3 = (M3.m) fVar2.f5860n.remove(P3.i.a(mVar2.L()));
                    if (mVar3 != null) {
                        M3.m.A(mVar3, null, 1, null);
                    }
                    Map map2 = fVar2.f5859m;
                    P3.i iVarA2 = P3.i.a(mVar2.L());
                    final Q6.o mVar5 = m.f5939a;
                    map2.computeIfPresent(iVarA2, new BiFunction() { // from class: N3.d
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj2, Object obj3) {
                            return f.F(mVar5, obj2, obj3);
                        }
                    });
                    fVar2.Q();
                    G g9 = G.f1419a;
                }
                return objF;
            }
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (p098k7.a) kVar.f5926c;
            mVar2 = (M3.m) kVar.f5925b;
            fVar2 = (f) kVar.f5924a;
            C6.r.b(obj);
            try {
                mVar3 = (M3.m) fVar2.f5860n.remove(P3.i.a(mVar2.L()));
                if (mVar3 != null) {
                    M3.m.A(mVar3, null, 1, null);
                }
                Map map3 = fVar2.f5859m;
                P3.i iVarA3 = P3.i.a(mVar2.L());
                final Q6.o mVar6 = m.f5939a;
                map3.computeIfPresent(iVarA3, new BiFunction() { // from class: N3.d
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj2, Object obj3) {
                        return f.F(mVar6, obj2, obj3);
                    }
                });
                fVar2.Q();
                G g10 = G.f1419a;
            } finally {
                aVar2.e(null);
            }
        }
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(M3.m mVar, G6.d dVar) {
        n nVar;
        f fVar;
        p098k7.a aVar;
        M3.m mVar2;
        p098k7.a aVar2;
        f fVar2;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i8 = nVar.f5945f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                nVar.f5945f = i8 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object obj = nVar.f5943d;
        Object objF = H6.c.f();
        int i9 = nVar.f5945f;
        if (i9 == 0) {
            C6.r.b(obj);
            try {
                nVar.f5940a = this;
                nVar.f5941b = mVar;
                nVar.f5945f = 1;
                return M3.n.d(mVar, nVar) == objF ? objF : mVar;
            } catch (Throwable unused) {
                fVar = this;
                aVar = fVar.f5856j;
                nVar.f5940a = fVar;
                nVar.f5941b = mVar;
                nVar.f5942c = aVar;
                nVar.f5945f = 2;
                if (aVar.b(null, nVar) != objF) {
                    mVar2 = mVar;
                    aVar2 = aVar;
                    fVar2 = fVar;
                    Map map = fVar2.f5859m;
                    P3.i iVarA = P3.i.a(mVar2.L());
                    final o oVar = o.f5946a;
                    map.compute(iVarA, new BiFunction() { // from class: N3.e
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj2, Object obj3) {
                            return f.H(oVar, obj2, obj3);
                        }
                    });
                    fVar2.Q();
                    G g8 = G.f1419a;
                    return null;
                }
            }
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (p098k7.a) nVar.f5942c;
                mVar2 = (M3.m) nVar.f5941b;
                fVar2 = (f) nVar.f5940a;
                C6.r.b(obj);
                try {
                    Map map2 = fVar2.f5859m;
                    P3.i iVarA2 = P3.i.a(mVar2.L());
                    final Q6.o oVar2 = o.f5946a;
                    map2.compute(iVarA2, new BiFunction() { // from class: N3.e
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj2, Object obj3) {
                            return f.H(oVar2, obj2, obj3);
                        }
                    });
                    fVar2.Q();
                    G g9 = G.f1419a;
                    return null;
                } finally {
                    aVar2.e(null);
                }
            }
            mVar = (M3.m) nVar.f5941b;
            fVar = (f) nVar.f5940a;
            try {
                C6.r.b(obj);
                return mVar;
            } catch (Throwable unused2) {
            }
        }
        aVar = fVar.f5856j;
        nVar.f5940a = fVar;
        nVar.f5941b = mVar;
        nVar.f5942c = aVar;
        nVar.f5945f = 2;
        if (aVar.b(null, nVar) != objF) {
            mVar2 = mVar;
            aVar2 = aVar;
            fVar2 = fVar;
            Map map3 = fVar2.f5859m;
            P3.i iVarA3 = P3.i.a(mVar2.L());
            final Q6.o oVar3 = o.f5946a;
            map3.compute(iVarA3, new BiFunction() { // from class: N3.e
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    return f.H(oVar3, obj2, obj3);
                }
            });
            fVar2.Q();
            G g10 = G.f1419a;
            return null;
        }
    }

    public final Object I(G6.d dVar) {
        return AbstractC2262h.p(this.f5847a.a());
    }

    public final Object J(G6.d dVar) {
        Object objJ = AbstractC2262h.j(this.f5858l, new p(null), dVar);
        return objJ == H6.c.f() ? objJ : G.f1419a;
    }

    public final Object K(G6.d dVar) {
        return new q(AbstractC2262h.p(this.f5848b.getData()), this);
    }

    public final Q L(KnownHost.Device device) {
        kotlin.jvm.internal.t.g(device, "device");
        return AbstractC1789i.b(this.f5855i, null, null, new r(device, this, null), 3, null);
    }

    public final void M() {
        if (this.f5854h.compareAndSet(false, true)) {
            Z2.j jVar = f5846q;
            String strC = jVar.c();
            Z2.p pVar = Z2.p.Debug;
            if (jVar.a().a().compareTo(pVar) <= 0) {
                jVar.b(pVar, strC, null, "start");
            }
            V3.f.b(N3.h.f(f5845p));
            AbstractC1789i.d(this.f5855i, null, null, new s(null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(N3.p pVar, G6.d dVar) {
        t tVar;
        p098k7.a aVar;
        f fVar;
        if (dVar instanceof t) {
            tVar = (t) dVar;
            int i8 = tVar.f5998f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                tVar.f5998f = i8 - Integer.MIN_VALUE;
            } else {
                tVar = new t(dVar);
            }
        } else {
            tVar = new t(dVar);
        }
        Object obj = tVar.f5996d;
        Object objF = H6.c.f();
        int i9 = tVar.f5998f;
        try {
            if (i9 == 0) {
                C6.r.b(obj);
                AbstractC1823z0.l(tVar.getContext());
                aVar = this.f5856j;
                tVar.f5993a = this;
                tVar.f5994b = pVar;
                tVar.f5995c = aVar;
                tVar.f5998f = 1;
                if (aVar.b(null, tVar) != objF) {
                    fVar = this;
                }
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return obj;
            }
            p098k7.a aVar2 = (p098k7.a) tVar.f5995c;
            N3.p pVar2 = (N3.p) tVar.f5994b;
            fVar = (f) tVar.f5993a;
            C6.r.b(obj);
            aVar = aVar2;
            pVar = pVar2;
            if (fVar.f5860n.containsKey(P3.i.a(pVar.f()))) {
                aVar.e(null);
                return null;
            }
            M3.m mVarA = fVar.f5849c.a(pVar.f(), null);
            mVarA.T();
            aVar.e(null);
            tVar.f5993a = null;
            tVar.f5994b = null;
            tVar.f5995c = null;
            tVar.f5998f = 2;
            Object objG = fVar.G(mVarA, tVar);
            return objG == objF ? objF : objG;
        } catch (Throwable th) {
            aVar.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: CancellationException -> 0x0057, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0057, blocks: (B:41:0x00e6, B:44:0x00fa, B:45:0x00fe, B:19:0x0053, B:30:0x0086, B:33:0x008c, B:35:0x00be, B:36:0x00c1, B:46:0x00ff, B:48:0x0131, B:27:0x0079, B:40:0x00d7), top: B:58:0x0024, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: CancellationException -> 0x0057, TryCatch #1 {CancellationException -> 0x0057, blocks: (B:41:0x00e6, B:44:0x00fa, B:45:0x00fe, B:19:0x0053, B:30:0x0086, B:33:0x008c, B:35:0x00be, B:36:0x00c1, B:46:0x00ff, B:48:0x0131, B:27:0x0079, B:40:0x00d7), top: B:58:0x0024, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff A[Catch: CancellationException -> 0x0057, TryCatch #1 {CancellationException -> 0x0057, blocks: (B:41:0x00e6, B:44:0x00fa, B:45:0x00fe, B:19:0x0053, B:30:0x0086, B:33:0x008c, B:35:0x00be, B:36:0x00c1, B:46:0x00ff, B:48:0x0131, B:27:0x0079, B:40:0x00d7), top: B:58:0x0024, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0131 A[Catch: CancellationException -> 0x0057, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0057, blocks: (B:41:0x00e6, B:44:0x00fa, B:45:0x00fe, B:19:0x0053, B:30:0x0086, B:33:0x008c, B:35:0x00be, B:36:0x00c1, B:46:0x00ff, B:48:0x0131, B:27:0x0079, B:40:0x00d7), top: B:58:0x0024, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x008c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00ff, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [N3.f] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [N3.f] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [N3.f] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [N3.f] */
    public final Object O(N3.p pVar, G6.d dVar) {
        u uVar;
        ?? r8;
        f fVar;
        f fVar2;
        M3.m mVar;
        Z2.j jVar;
        String str;
        String strC;
        Z2.p pVar2;
        Z2.j jVar2;
        String str2;
        String strC2;
        Z2.p pVar3;
        p098k7.a aVar;
        M3.m mVar2;
        N3.p pVar4;
        p098k7.a aVar2;
        ?? r9;
        if (dVar instanceof u) {
            uVar = (u) dVar;
            int i8 = uVar.f6005g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                uVar.f6005g = i8 - Integer.MIN_VALUE;
            } else {
                uVar = new u(dVar);
            }
        } else {
            uVar = new u(dVar);
        }
        Object objN = uVar.f6003e;
        Object objF = H6.c.f();
        ?? r10 = uVar.f6005g;
        try {
            if (r10 == 0) {
                C6.r.b(objN);
                p098k7.d dVar2 = this.f5853g;
                uVar.f5999a = this;
                uVar.f6000b = pVar;
                uVar.f6005g = 1;
                if (dVar2.d(uVar) != objF) {
                    fVar = this;
                }
                return objF;
            }
            if (r10 == 1) {
                pVar = (N3.p) uVar.f6000b;
                f fVar3 = (f) uVar.f5999a;
                C6.r.b(objN);
                fVar = fVar3;
            } else {
                if (r10 == 2) {
                    pVar = (N3.p) uVar.f6000b;
                    f fVar4 = (f) uVar.f5999a;
                    C6.r.b(objN);
                    fVar2 = fVar4;
                    mVar = (M3.m) objN;
                    if (mVar != null) {
                        jVar2 = f5846q;
                        str2 = "--> finished reachability check for " + P3.i.f(pVar.f()) + ": Connection established";
                        strC2 = jVar2.c();
                        pVar3 = Z2.p.Info;
                        if (jVar2.a().a().compareTo(pVar3) <= 0) {
                            jVar2.b(pVar3, strC2, null, str2);
                        }
                        aVar = fVar2.f5856j;
                        uVar.f5999a = fVar2;
                        uVar.f6000b = pVar;
                        uVar.f6001c = mVar;
                        uVar.f6002d = aVar;
                        uVar.f6005g = 3;
                        if (aVar.b(null, uVar) != objF) {
                            mVar2 = mVar;
                            pVar4 = pVar;
                            aVar2 = aVar;
                            r10 = fVar2;
                            r10.f5860n.put(P3.i.a(pVar4.f()), mVar2);
                            G g8 = G.f1419a;
                            aVar2.e(null);
                            AbstractC1789i.d(r10.f5855i, null, null, new v(mVar2, null), 3, null);
                            r9 = r10;
                        }
                        return objF;
                    }
                    jVar = f5846q;
                    str = "--> finished reachability check for " + P3.i.f(pVar.f()) + ": Nothing found";
                    strC = jVar.c();
                    pVar2 = Z2.p.Debug;
                    if (jVar.a().a().compareTo(pVar2) <= 0) {
                        r9 = fVar2;
                        jVar.b(pVar2, strC, null, str);
                        r9 = fVar2;
                    }
                    r9 = fVar2;
                    r8 = r9;
                    r8.f5853g.a();
                    return G.f1419a;
                }
                if (r10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (p098k7.a) uVar.f6002d;
                mVar2 = (M3.m) uVar.f6001c;
                N3.p pVar5 = (N3.p) uVar.f6000b;
                r8 = (f) uVar.f5999a;
                try {
                    C6.r.b(objN);
                    pVar4 = pVar5;
                    r10 = r8;
                    try {
                        r10.f5860n.put(P3.i.a(pVar4.f()), mVar2);
                        G g9 = G.f1419a;
                        aVar2.e(null);
                        AbstractC1789i.d(r10.f5855i, null, null, new v(mVar2, null), 3, null);
                        r9 = r10;
                        r9 = fVar2;
                        r8 = r9;
                        r8.f5853g.a();
                        return G.f1419a;
                    } catch (Throwable th) {
                        aVar2.e(null);
                        throw th;
                    }
                } catch (CancellationException unused) {
                    r8.f5853g.a();
                }
            }
            uVar.f5999a = fVar;
            uVar.f6000b = pVar;
            uVar.f6005g = 2;
            objN = fVar.N(pVar, uVar);
            fVar2 = fVar;
            if (objN != objF) {
                mVar = (M3.m) objN;
                if (mVar != null) {
                    jVar2 = f5846q;
                    str2 = "--> finished reachability check for " + P3.i.f(pVar.f()) + ": Connection established";
                    strC2 = jVar2.c();
                    pVar3 = Z2.p.Info;
                    if (jVar2.a().a().compareTo(pVar3) <= 0) {
                        jVar2.b(pVar3, strC2, null, str2);
                    }
                    aVar = fVar2.f5856j;
                    uVar.f5999a = fVar2;
                    uVar.f6000b = pVar;
                    uVar.f6001c = mVar;
                    uVar.f6002d = aVar;
                    uVar.f6005g = 3;
                    if (aVar.b(null, uVar) != objF) {
                        mVar2 = mVar;
                        pVar4 = pVar;
                        aVar2 = aVar;
                        r10 = fVar2;
                        r10.f5860n.put(P3.i.a(pVar4.f()), mVar2);
                        G g10 = G.f1419a;
                        aVar2.e(null);
                        AbstractC1789i.d(r10.f5855i, null, null, new v(mVar2, null), 3, null);
                        r9 = r10;
                    }
                } else {
                    jVar = f5846q;
                    str = "--> finished reachability check for " + P3.i.f(pVar.f()) + ": Nothing found";
                    strC = jVar.c();
                    pVar2 = Z2.p.Debug;
                    if (jVar.a().a().compareTo(pVar2) <= 0) {
                        r9 = fVar2;
                        jVar.b(pVar2, strC, null, str);
                        r9 = fVar2;
                    }
                }
                r9 = fVar2;
                r8 = r9;
                r8.f5853g.a();
                return G.f1419a;
            }
            return objF;
        } catch (CancellationException unused2) {
            r8 = r10;
        }
    }

    public final void Q() {
        if (this.f5859m.isEmpty()) {
            p044e7.x xVar = this.f5857k;
            xVar.setValue(e.a.f5882a);
            return;
        }
        p044e7.x xVar2 = this.f5857k;
        Collection collectionValues = this.f5859m.values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            if (((b) obj).s()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C6.o oVar = new C6.o(arrayList, arrayList2);
        List list = (List) oVar.a();
        List list2 = (List) oVar.b();
        List listI0 = z.I0(list);
        List listH0 = z.H0(list2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listH0) {
            if (((b) obj2).t()) {
                arrayList3.add(obj2);
            }
        }
        xVar2.setValue(new e.c(listI0, arrayList3, this.f5861o));
    }

    public final Q w(b host) {
        kotlin.jvm.internal.t.g(host, "host");
        return AbstractC1789i.b(this.f5855i, null, null, new C0220f(host, this, null), 3, null);
    }

    public final void x() {
        AbstractC1789i.d(this.f5855i, null, null, new g(null), 3, null);
    }

    public final Q y(KnownHost.Device device) {
        kotlin.jvm.internal.t.g(device, "device");
        return AbstractC1789i.b(this.f5855i, null, null, new h(device, this, null), 3, null);
    }

    public final Q z(KnownHost.Device device) {
        kotlin.jvm.internal.t.g(device, "device");
        return AbstractC1789i.b(this.f5855i, null, null, new i(device, this, null), 3, null);
    }

    public final void P() {
        if (this.f5854h.compareAndSet(true, false)) {
            Z2.j jVar = f5846q;
            String strC = jVar.c();
            Z2.p pVar = Z2.p.Debug;
            if (jVar.a().a().compareTo(pVar) <= 0) {
                jVar.b(pVar, strC, null, QhsKALGiniuQ.eBefTzpIUE);
            }
            V3.f.b(N3.h.g(f5845p, z.R0(this.f5859m.values())));
            InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) this.f5855i.getCoroutineContext().A(InterfaceC1815v0.f15985O);
            if (interfaceC1815v0 != null) {
                B0.i(interfaceC1815v0, null, 1, null);
            }
            AbstractC1789i.d(this.f5855i, null, null, new w(null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object R(List list, G6.d dVar) {
        x xVar;
        List<N3.p> list2;
        p098k7.a aVar;
        f fVar;
        Object value;
        List listJ0;
        List listE;
        C6.o oVarA;
        if (dVar instanceof x) {
            xVar = (x) dVar;
            int i8 = xVar.f6018f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                xVar.f6018f = i8 - Integer.MIN_VALUE;
            } else {
                xVar = new x(dVar);
            }
        } else {
            xVar = new x(dVar);
        }
        Object obj = xVar.f6016d;
        Object objF = H6.c.f();
        int i9 = xVar.f6018f;
        if (i9 == 0) {
            C6.r.b(obj);
            if (list.isEmpty()) {
                return G.f1419a;
            }
            p098k7.a aVar2 = this.f5856j;
            xVar.f6013a = this;
            list2 = list;
            xVar.f6014b = list2;
            xVar.f6015c = aVar2;
            xVar.f6018f = 1;
            if (aVar2.b(null, xVar) == objF) {
                return objF;
            }
            aVar = aVar2;
            fVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p098k7.a) xVar.f6015c;
            list2 = (List) xVar.f6014b;
            fVar = (f) xVar.f6013a;
            C6.r.b(obj);
        }
        try {
            p044e7.x xVar2 = fVar.f5858l;
            do {
                value = xVar2.getValue();
                List list3 = (List) value;
                LinkedHashMap linkedHashMap = new LinkedHashMap(W6.n.d(L.d(C0938s.y(list3, 10)), 16));
                for (Object obj2 : list3) {
                    linkedHashMap.put(P3.i.a(((N3.p) obj2).f()), obj2);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (!linkedHashMap.containsKey(P3.i.a(((N3.p) obj3).f()))) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (N3.p pVar : list2) {
                    N3.p pVar2 = (N3.p) linkedHashMap.get(P3.i.a(pVar.f()));
                    if (pVar2 == null || ((listE = pVar.e()) != null && listE.isEmpty())) {
                        oVarA = null;
                        break;
                    }
                    Iterator it = listE.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            oVarA = null;
                            break;
                        }
                        if (!pVar2.e().contains((Endpoint) it.next())) {
                            oVarA = C6.v.a(P3.i.a(pVar2.f()), N3.p.b(pVar2, null, null, P3.c.c(pVar.e(), pVar2.e()), 3, null));
                            break;
                        }
                    }
                    if (oVarA != null) {
                        arrayList2.add(oVarA);
                    }
                }
                Map mapT = D6.M.t(arrayList2);
                ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    N3.p pVar3 = (N3.p) mapT.get(entry.getKey());
                    if (pVar3 == null) {
                        pVar3 = (N3.p) entry.getValue();
                    }
                    arrayList3.add(pVar3);
                }
                listJ0 = z.J0(z.B0(arrayList3, arrayList), new y());
                Z2.j jVar = f5846q;
                String str = cFAYKUlMj.ZNOrzYxazkoJsA + arrayList.size() + " new and " + mapT.values().size() + " updated connections for reachability check, " + fVar.D(listJ0);
                String strC = jVar.c();
                Z2.p pVar4 = Z2.p.Debug;
                if (jVar.a().a().compareTo(pVar4) <= 0) {
                    jVar.b(pVar4, strC, null, str);
                }
            } while (!xVar2.b(value, listJ0));
            G g8 = G.f1419a;
            return G.f1419a;
        } finally {
            aVar.e(null);
        }
    }

    public /* synthetic */ f(N3.b bVar, AppSettingsStore appSettingsStore, M3.o oVar, CryptoBox cryptoBox, M3.p pVar, G6.g gVar, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(bVar, appSettingsStore, oVar, cryptoBox, pVar, gVar, (i9 & 64) != 0 ? 20 : i8);
    }
}
