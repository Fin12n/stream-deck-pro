package p040e3;

import Q6.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p058g3.e;
import p130o3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f20720c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f20721a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.f20721a = obj;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b it) {
            t.g(it, "it");
            return this.f20721a;
        }
    }

    public p(Object obj, e keyPath, k callback) {
        t.g(keyPath, "keyPath");
        t.g(callback, "callback");
        this.f20718a = obj;
        this.f20719b = keyPath;
        this.f20720c = callback;
    }

    public final k a() {
        return this.f20720c;
    }

    public final e b() {
        return this.f20719b;
    }

    public final Object c() {
        return this.f20718a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(Object obj, e keyPath, Object obj2) {
        this(obj, keyPath, (k) new a(obj2));
        t.g(keyPath, "keyPath");
    }
}
