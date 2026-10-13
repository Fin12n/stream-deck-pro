package p215z0;

/* JADX INFO: renamed from: z0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3157i {
    public static final int a(InterfaceC3163l interfaceC3163l, int i8) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(524444915, i8, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int I8 = interfaceC3163l.I();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return I8;
    }

    public static final D0 b(InterfaceC3163l interfaceC3163l, int i8) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(394957799, i8, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        D0 d0B = interfaceC3163l.b();
        if (d0B == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        interfaceC3163l.B(d0B);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return d0B;
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final AbstractC3173q d(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1165786124);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1165786124, i8, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        AbstractC3173q abstractC3173qJ = interfaceC3163l.J();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return abstractC3173qJ;
    }
}
