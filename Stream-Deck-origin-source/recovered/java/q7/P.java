package q7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class P extends C2874y0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f32054m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(String name, K generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(generatedSerializer, "generatedSerializer");
        this.f32054m = true;
    }

    @Override // q7.C2874y0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        o7.f fVar = (o7.f) obj;
        if (!kotlin.jvm.internal.t.c(a(), fVar.a())) {
            return false;
        }
        P p8 = (P) obj;
        if (!p8.isInline() || !Arrays.equals(p(), p8.p()) || f() != fVar.f()) {
            return false;
        }
        int iF = f();
        for (int i8 = 0; i8 < iF; i8++) {
            if (!kotlin.jvm.internal.t.c(i(i8).a(), fVar.i(i8).a()) || !kotlin.jvm.internal.t.c(i(i8).e(), fVar.i(i8).e())) {
                return false;
            }
        }
        return true;
    }

    @Override // q7.C2874y0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // q7.C2874y0, o7.f
    public boolean isInline() {
        return this.f32054m;
    }
}
