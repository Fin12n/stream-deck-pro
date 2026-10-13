package P3;

import C6.m;
import D6.z;
import com.elgato.streamdeck.vsd2.Endpoint;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8879a;

        static {
            int[] iArr = new int[Endpoint.Source.values().length];
            try {
                iArr[Endpoint.Source.BONJOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Endpoint.Source.CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Endpoint.Source.STATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Endpoint.Source.ELGATO_DISCOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Endpoint.Source.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8879a = iArr;
        }
    }

    public static final Endpoint a(List list) {
        Object obj;
        t.g(list, "<this>");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Endpoint.Source source = ((Endpoint) next).getSource();
                t.f(source, "getSource(...)");
                int iB = b(source);
                do {
                    Object next2 = it.next();
                    Endpoint.Source source2 = ((Endpoint) next2).getSource();
                    t.f(source2, "getSource(...)");
                    int iB2 = b(source2);
                    if (iB > iB2) {
                        next = next2;
                        iB = iB2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Endpoint) obj;
    }

    public static final List c(List list, List other) {
        t.g(list, "<this>");
        t.g(other, "other");
        ArrayList arrayList = new ArrayList();
        for (Object obj : other) {
            if (!list.contains((Endpoint) obj)) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty() ? z.B0(list, arrayList) : list;
    }

    public static final int b(Endpoint.Source source) {
        t.g(source, ajyWhveMDgQ.izpucVQffRokVY);
        int i8 = a.f8879a[source.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 == 4) {
            return 10;
        }
        if (i8 == 5) {
            return 100;
        }
        throw new m();
    }
}
