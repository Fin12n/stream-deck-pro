package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1721d implements InterfaceC1730m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultLifecycleObserver f15282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1730m f15283b;

    /* JADX INFO: renamed from: androidx.lifecycle.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15284a;

        static {
            int[] iArr = new int[AbstractC1726i.a.values().length];
            try {
                iArr[AbstractC1726i.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1726i.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1726i.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1726i.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1726i.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1726i.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1726i.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f15284a = iArr;
        }
    }

    public C1721d(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC1730m interfaceC1730m) {
        kotlin.jvm.internal.t.g(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f15282a = defaultLifecycleObserver;
        this.f15283b = interfaceC1730m;
    }

    @Override // androidx.lifecycle.InterfaceC1730m
    public void j(InterfaceC1733p source, AbstractC1726i.a event) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(event, "event");
        switch (a.f15284a[event.ordinal()]) {
            case 1:
                this.f15282a.onCreate(source);
                break;
            case 2:
                this.f15282a.onStart(source);
                break;
            case 3:
                this.f15282a.onResume(source);
                break;
            case 4:
                this.f15282a.onPause(source);
                break;
            case 5:
                this.f15282a.onStop(source);
                break;
            case 6:
                this.f15282a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1730m interfaceC1730m = this.f15283b;
        if (interfaceC1730m != null) {
            interfaceC1730m.j(source, event);
        }
    }
}
