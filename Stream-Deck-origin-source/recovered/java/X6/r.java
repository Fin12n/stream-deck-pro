package X6;

import D6.C0938s;
import D6.z;
import Z6.v;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12062a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12062a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b extends C2639q implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12063a = new b();

        public b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class p8) {
            t.g(p8, "p0");
            return p8.getComponentType();
        }
    }

    public static final Type b(m mVar, boolean z8) {
        f fVarF = mVar.f();
        if (!(fVarF instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + mVar);
        }
        d dVar = (d) fVarF;
        Class clsB = z8 ? P6.a.b(dVar) : P6.a.a(dVar);
        List listE = mVar.e();
        if (listE.isEmpty()) {
            return clsB;
        }
        if (!clsB.isArray()) {
            return d(clsB, listE);
        }
        if (clsB.getComponentType().isPrimitive()) {
            return clsB;
        }
        n nVar = (n) z.G0(listE);
        if (nVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + mVar);
        }
        o oVarA = nVar.a();
        m mVarB = nVar.b();
        int i8 = oVarA == null ? -1 : a.f12062a[oVarA.ordinal()];
        if (i8 == -1 || i8 == 1) {
            return clsB;
        }
        if (i8 != 2 && i8 != 3) {
            throw new C6.m();
        }
        t.d(mVarB);
        Type typeC = c(mVarB, false, 1, null);
        return typeC instanceof Class ? clsB : new X6.a(typeC);
    }

    public static /* synthetic */ Type c(m mVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return b(mVar, z8);
    }

    public static final Type d(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f((n) it.next()));
            }
            return new q(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(C0938s.y(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f((n) it2.next()));
            }
            return new q(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeD = d(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(C0938s.y(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(f((n) it3.next()));
        }
        return new q(cls, typeD, arrayList3);
    }

    public static final Type f(n nVar) {
        o oVarD = nVar.d();
        if (oVarD == null) {
            return s.f12064c.a();
        }
        m mVarC = nVar.c();
        t.d(mVarC);
        int i8 = a.f12062a[oVarD.ordinal()];
        if (i8 == 1) {
            return new s(null, b(mVarC, true));
        }
        if (i8 == 2) {
            return b(mVarC, true);
        }
        if (i8 == 3) {
            return new s(b(mVarC, true), null);
        }
        throw new C6.m();
    }

    public static final String g(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            Y6.g gVarF = Y6.l.f(type, b.f12063a);
            name = ((Class) Y6.n.r(gVarF)).getName() + v.z("[]", Y6.n.i(gVarF));
        } else {
            name = cls.getName();
        }
        t.d(name);
        return name;
    }

    public static final Type e(m mVar) {
        t.g(mVar, jULK.itonNUOlCkSfWCn);
        return c(mVar, false, 1, null);
    }
}
