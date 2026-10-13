package I6;

import kotlin.jvm.internal.InterfaceC2637o;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends j implements InterfaceC2637o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3793a;

    public k(int i8, G6.d<Object> dVar) {
        super(dVar);
        this.f3793a = i8;
    }

    @Override // kotlin.jvm.internal.InterfaceC2637o
    public int getArity() {
        return this.f3793a;
    }

    @Override // I6.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strG = K.g(this);
        t.f(strG, "renderLambdaToString(...)");
        return strG;
    }

    public k(int i8) {
        this(i8, null);
    }
}
