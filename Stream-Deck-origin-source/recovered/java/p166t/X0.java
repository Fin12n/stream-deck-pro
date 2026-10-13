package p166t;

import A.AbstractC0890p0;
import A.AbstractC0902w;
import H.C0970b0;
import H.J;
import androidx.lifecycle.AbstractC1737u;
import androidx.lifecycle.x;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0970b0 f33567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f33568b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33569a;

        static {
            int[] iArr = new int[J.a.values().length];
            f33569a = iArr;
            try {
                iArr[J.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33569a[J.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33569a[J.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33569a[J.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33569a[J.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33569a[J.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33569a[J.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33569a[J.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public X0(C0970b0 c0970b0) {
        this.f33567a = c0970b0;
        x xVar = new x();
        this.f33568b = xVar;
        xVar.k(AbstractC0902w.a(AbstractC0902w.b.CLOSED));
    }

    public AbstractC1737u a() {
        return this.f33568b;
    }

    public final AbstractC0902w b() {
        return this.f33567a.c() ? AbstractC0902w.a(AbstractC0902w.b.OPENING) : AbstractC0902w.a(AbstractC0902w.b.PENDING_OPEN);
    }

    public void c(J.a aVar, AbstractC0902w.a aVar2) {
        AbstractC0902w abstractC0902wB;
        if (aVar2 == null || aVar2.d() != 8) {
            switch (a.f33569a[aVar.ordinal()]) {
                case 1:
                    abstractC0902wB = b();
                    break;
                case 2:
                    abstractC0902wB = AbstractC0902w.b(AbstractC0902w.b.OPENING, aVar2);
                    break;
                case 3:
                case 4:
                    abstractC0902wB = AbstractC0902w.b(AbstractC0902w.b.OPEN, aVar2);
                    break;
                case 5:
                case 6:
                    abstractC0902wB = AbstractC0902w.b(AbstractC0902w.b.CLOSING, aVar2);
                    break;
                case 7:
                case 8:
                    abstractC0902wB = AbstractC0902w.b(AbstractC0902w.b.CLOSED, aVar2);
                    break;
                default:
                    throw new IllegalStateException("Unknown internal camera state: " + aVar);
            }
        } else {
            abstractC0902wB = AbstractC0902w.b(AbstractC0902w.b.CLOSED, aVar2);
        }
        AbstractC0890p0.a("CameraStateMachine", "New public camera state " + abstractC0902wB + " from " + aVar + " and " + aVar2);
        if (Objects.equals((AbstractC0902w) this.f33568b.e(), abstractC0902wB)) {
            return;
        }
        AbstractC0890p0.a("CameraStateMachine", "Publishing new public camera state " + abstractC0902wB);
        this.f33568b.k(abstractC0902wB);
    }
}
