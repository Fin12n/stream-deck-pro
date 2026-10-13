package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: kotlin.jvm.internal.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2628f implements X6.c, Serializable {
    public static final Object NO_RECEIVER = a.f28803a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient X6.c reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.f$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28803a = new a();
    }

    public AbstractC2628f() {
        this(NO_RECEIVER);
    }

    @Override // X6.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // X6.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public X6.c compute() {
        X6.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        X6.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    public abstract X6.c computeReflected();

    @Override // X6.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // X6.c
    public String getName() {
        return this.name;
    }

    public X6.g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? K.c(cls) : K.b(cls);
    }

    @Override // X6.c
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public X6.c getReflected() {
        X6.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new P6.b();
    }

    @Override // X6.c
    public X6.m getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // X6.c
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // X6.c
    public X6.p getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // X6.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // X6.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // X6.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public AbstractC2628f(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC2628f(Object obj, Class cls, String str, String str2, boolean z8) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z8;
    }
}
