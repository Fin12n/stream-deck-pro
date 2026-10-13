package V2;

import I0.j;
import I0.l;
import Q6.k;
import Q6.o;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3182v;
import p215z0.B0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f10575a = AbstractC3182v.e(a.f10576a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10576a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return g.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10577a = new b();

        public b() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(l listSaver, V2.b navigator) {
            t.g(listSaver, "$this$listSaver");
            t.g(navigator, "navigator");
            return navigator.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I0.d f10579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V2.c f10580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ V2.b f10581d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, I0.d dVar, V2.c cVar, V2.b bVar) {
            super(1);
            this.f10578a = str;
            this.f10579b = dVar;
            this.f10580c = cVar;
            this.f10581d = bVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V2.b invoke(List items) {
            t.g(items, "items");
            return new V2.b(items, this.f10578a, this.f10579b, this.f10580c, this.f10581d);
        }
    }

    public static final e b() {
        return new e() { // from class: V2.f
            @Override // V2.e
            public final j a(List list, String str, I0.d dVar, c cVar, b bVar) {
                return g.c(list, str, dVar, cVar, bVar);
            }
        };
    }

    public static final B0 d() {
        return f10575a;
    }

    public static final j c(List list, String key, I0.d stateHolder, V2.c disposeBehavior, V2.b bVar) {
        t.g(list, ZWZaxQrCHfNe.NBVoZMfozG);
        t.g(key, "key");
        t.g(stateHolder, "stateHolder");
        t.g(disposeBehavior, "disposeBehavior");
        return I0.a.a(b.f10577a, new c(key, stateHolder, disposeBehavior, bVar));
    }
}
