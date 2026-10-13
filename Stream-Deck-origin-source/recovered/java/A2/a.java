package A2;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0001a f474c = new C0001a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f476b;

    /* JADX INFO: renamed from: A2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0001a {
        public /* synthetic */ C0001a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final void a(i iVar, int i8, Object obj) {
            if (obj == null) {
                iVar.l1(i8);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.E0(i8, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.c0(i8, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.c0(i8, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.v0(i8, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.v0(i8, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.v0(i8, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.v0(i8, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.N(i8, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.v0(i8, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i8 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] objArr) {
            t.g(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i8 = 0;
            while (i8 < length) {
                Object obj = objArr[i8];
                i8++;
                a(statement, i8, obj);
            }
        }

        public C0001a() {
        }
    }

    public a(String query, Object[] objArr) {
        t.g(query, "query");
        this.f475a = query;
        this.f476b = objArr;
    }

    @Override // A2.j
    public void b(i statement) {
        t.g(statement, "statement");
        f474c.b(statement, this.f476b);
    }

    @Override // A2.j
    public String c() {
        return this.f475a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        t.g(query, "query");
    }
}
