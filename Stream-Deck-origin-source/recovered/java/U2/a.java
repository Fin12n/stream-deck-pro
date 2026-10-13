package U2;

import D6.C0934n;
import D6.w;
import D6.z;
import J0.v;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.InterfaceC3164l0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f10164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f10165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f10166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1 f10167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f10168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1 f10169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1 f10170g;

    /* JADX INFO: renamed from: U2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0285a extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0285a(int i8) {
            super(0);
            this.f10172b = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(a.this.f().size() > this.f10172b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(a.this.f().isEmpty());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            return a.this.f().F();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return z.u0(a.this.f());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(a.this.f().size());
        }
    }

    public a(List<Object> items, int i8) {
        t.g(items, "items");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Min size " + i8 + " is less than zero").toString());
        }
        if (items.size() < i8) {
            throw new IllegalArgumentException((yOZfxp.bjsFxiNi + items.size() + " is less than the min size " + i8).toString());
        }
        this.f10164a = g1.s(items);
        this.f10165b = g1.i(U2.c.Idle, g1.k());
        this.f10166c = g1.d(new c());
        this.f10167d = g1.d(new d());
        this.f10168e = g1.d(new e());
        this.f10169f = g1.d(new b());
        this.f10170g = g1.d(new C0285a(i8));
    }

    public void a() {
        j(U2.c.Idle);
    }

    public boolean b() {
        return ((Boolean) this.f10170g.getValue()).booleanValue();
    }

    public List c() {
        return (List) this.f10166c.getValue();
    }

    public U2.c d() {
        return (U2.c) this.f10165b.getValue();
    }

    public Object e() {
        return this.f10167d.getValue();
    }

    public final v f() {
        return this.f10164a;
    }

    public boolean g() {
        if (!b()) {
            return false;
        }
        w.O(this.f10164a);
        j(U2.c.Pop);
        return true;
    }

    public void h(Object obj) {
        this.f10164a.add(obj);
        j(U2.c.Push);
    }

    public void i(Object obj) {
        this.f10164a.clear();
        this.f10164a.add(obj);
        j(U2.c.Replace);
    }

    public final void j(U2.c cVar) {
        this.f10165b.setValue(cVar);
    }

    public /* synthetic */ a(List list, int i8, int i9, AbstractC2633k abstractC2633k) {
        this((List<Object>) list, (i9 & 2) != 0 ? 0 : i8);
    }

    public /* synthetic */ a(Object[] objArr, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(objArr, (i9 & 2) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Object[] items, int i8) {
        this((List<Object>) C0934n.r0(items), i8);
        t.g(items, "items");
    }
}
