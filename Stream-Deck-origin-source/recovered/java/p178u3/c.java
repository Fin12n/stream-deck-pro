package p178u3;

import N3.m;
import N3.r;
import com.elgato.vsd2.Messages;
import kotlin.jvm.internal.t;
import p194w3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34498a;

        static {
            int[] iArr = new int[Messages.Error.b.values().length];
            try {
                iArr[Messages.Error.b.DeviceNotFound.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Messages.Error.b.DeviceNameAlreadyTaken.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Messages.Error.b.ResourceLimitReached.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Messages.Error.b.AuthenticationRejected.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Messages.Error.b.Cancelled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Messages.Error.b.InvalidState.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Messages.Error.b.UNRECOGNIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f34498a = iArr;
        }
    }

    public static final int a(m.c cVar) {
        t.g(cVar, "<this>");
        if (t.c(cVar, m.c.b.f6114a)) {
            return b.f37019f1;
        }
        if (t.c(cVar, m.c.a.f6113a)) {
            return b.f37022g1;
        }
        if (t.c(cVar, m.c.C0230c.f6115a)) {
            return b.f37025h1;
        }
        throw new C6.m();
    }

    public static final int b(r.b.C0236b c0236b) {
        t.g(c0236b, "<this>");
        return d(c0236b.a().a());
    }

    public static final int c(r.b bVar) {
        t.g(bVar, "<this>");
        if (bVar instanceof r.b.C0236b) {
            return b((r.b.C0236b) bVar);
        }
        if (bVar instanceof r.b.c) {
            return b.f36985S;
        }
        throw new C6.m();
    }

    public static final int d(Messages.Error.b bVar) {
        t.g(bVar, "<this>");
        switch (a.f34498a[bVar.ordinal()]) {
            case 1:
                return b.f36976P;
            case 2:
                return b.f36973O;
            case 3:
                return b.f36982R;
            case 4:
                return b.f36967M;
            case 5:
                return b.f36970N;
            case 6:
                return b.f36979Q;
            case 7:
                return b.f36985S;
            default:
                throw new C6.m();
        }
    }
}
