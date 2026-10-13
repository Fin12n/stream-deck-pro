package Z2;

import D6.C0937q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class j extends Z2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12858c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12859b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends j {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ void f(a aVar, String str, Throwable th, Function0 function0, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                th = null;
            }
            aVar.e(str, th, function0);
        }

        public static /* synthetic */ void h(a aVar, String str, Throwable th, Function0 function0, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                th = null;
            }
            aVar.g(str, th, function0);
        }

        @Override // Z2.j
        public String c() {
            return e.a();
        }

        public final void e(String tag, Throwable th, Function0 message) {
            t.g(tag, "tag");
            t.g(message, "message");
            p pVarA = a().a();
            p pVar = p.Debug;
            if (pVarA.compareTo(pVar) <= 0) {
                String str = (String) message.invoke();
                if (a().a().compareTo(pVar) <= 0) {
                    b(pVar, tag, th, str);
                }
            }
        }

        public final void g(String tag, Throwable th, Function0 message) {
            t.g(tag, "tag");
            t.g(message, "message");
            p pVarA = a().a();
            p pVar = p.Warn;
            if (pVarA.compareTo(pVar) <= 0) {
                String str = (String) message.invoke();
                if (a().a().compareTo(pVar) <= 0) {
                    b(pVar, tag, th, str);
                }
            }
        }

        public a() {
            super(g.a(C0937q.e(o.b(null, 1, null))), "");
        }
    }

    public /* synthetic */ j(k kVar, String str, int i8, AbstractC2633k abstractC2633k) {
        this(kVar, (i8 & 2) != 0 ? "" : str);
    }

    public String c() {
        return this.f12859b;
    }

    public final j d(String tag) {
        t.g(tag, "tag");
        return new j(a(), tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k config, String tag) {
        super(config);
        t.g(config, "config");
        t.g(tag, "tag");
        this.f12859b = tag;
    }
}
