package p062g7;

import C6.C0918g;
import C6.G;
import G6.g;
import Q6.k;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.u;
import p017b7.H;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f23878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f23879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f23880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, Object obj, g gVar) {
            super(1);
            this.f23878a = kVar;
            this.f23879b = obj;
            this.f23880c = gVar;
        }

        public final void b(Throwable th) throws IllegalAccessException, InvocationTargetException {
            y.b(this.f23878a, this.f23879b, this.f23880c);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    public static final k a(k kVar, Object obj, g gVar) {
        return new a(kVar, obj, gVar);
    }

    public static final void b(k kVar, Object obj, g gVar) throws IllegalAccessException, InvocationTargetException {
        P pC = c(kVar, obj, null);
        if (pC != null) {
            H.a(gVar, pC);
        }
    }

    public static final P c(k kVar, Object obj, P p8) throws IllegalAccessException, InvocationTargetException {
        try {
            kVar.invoke(obj);
            return p8;
        } catch (Throwable th) {
            if (p8 != null && p8.getCause() != th) {
                C0918g.a(p8, th);
                return p8;
            }
            return new P("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ P d(k kVar, Object obj, P p8, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            p8 = null;
        }
        return c(kVar, obj, p8);
    }
}
