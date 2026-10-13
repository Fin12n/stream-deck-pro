package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u implements InterfaceC2637o, Serializable {
    private final int arity;

    public u(int i8) {
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.InterfaceC2637o
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strH = K.h(this);
        t.f(strH, "renderLambdaToString(...)");
        return strH;
    }
}
