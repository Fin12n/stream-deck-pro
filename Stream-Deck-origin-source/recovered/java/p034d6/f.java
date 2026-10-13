package p034d6;

import D6.z;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum f {
    READ(1),
    f19867g(4),
    ACCEPT(16),
    CONNECT(8);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19862b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f[] f19863c = values();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f19864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f19865e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19871a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final f[] a() {
            return f.f19863c;
        }

        public final int[] b() {
            return f.f19864d;
        }

        public a() {
        }
    }

    f(int i8) {
        this.f19871a = i8;
    }

    public final int d() {
        return this.f19871a;
    }

    static {
        f[] fVarArrValues = values();
        ArrayList arrayList = new ArrayList(fVarArrValues.length);
        for (f fVar : fVarArrValues) {
            arrayList.add(Integer.valueOf(fVar.f19871a));
        }
        f19864d = z.Q0(arrayList);
        f19865e = values().length;
    }
}
