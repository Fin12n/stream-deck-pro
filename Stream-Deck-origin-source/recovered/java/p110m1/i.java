package p110m1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f29516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f29517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29518c;

    public i(Function0 function0, Function0 function1, boolean z8) {
        this.f29516a = function0;
        this.f29517b = function1;
        this.f29518c = z8;
    }

    public final Function0 a() {
        return this.f29517b;
    }

    public final boolean b() {
        return this.f29518c;
    }

    public final Function0 c() {
        return this.f29516a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f29516a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f29517b.invoke()).floatValue() + ", reverseScrolling=" + this.f29518c + ')';
    }

    public /* synthetic */ i(Function0 function0, Function0 function1, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this(function0, function1, (i8 & 4) != 0 ? false : z8);
    }
}
