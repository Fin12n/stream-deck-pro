package io.ktor.utils.io;

import C6.G;
import D6.C0934n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p017b7.D;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f25563a = d(Throwable.class, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReentrantReadWriteLock f25564b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f25565c = new WeakHashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f25566a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f25566a = constructor;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e8) {
            Object objB;
            kotlin.jvm.internal.t.g(e8, "e");
            try {
                C6.q.a aVar = C6.q.f1441b;
                Object objNewInstance = this.f25566a.newInstance(e8.getMessage(), e8);
                kotlin.jvm.internal.t.e(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                objB = C6.q.b((Throwable) objNewInstance);
            } catch (Throwable th) {
                C6.q.a aVar2 = C6.q.f1441b;
                objB = C6.q.b(C6.r.a(th));
            }
            if (C6.q.g(objB)) {
                objB = null;
            }
            return (Throwable) objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f25567a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f25567a = constructor;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e8) {
            Object objB;
            kotlin.jvm.internal.t.g(e8, "e");
            try {
                C6.q.a aVar = C6.q.f1441b;
                Object objNewInstance = this.f25567a.newInstance(e8);
                kotlin.jvm.internal.t.e(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                objB = C6.q.b((Throwable) objNewInstance);
            } catch (Throwable th) {
                C6.q.a aVar2 = C6.q.f1441b;
                objB = C6.q.b(C6.r.a(th));
            }
            if (C6.q.g(objB)) {
                objB = null;
            }
            return (Throwable) objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f25568a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f25568a = constructor;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e8) {
            Object objB;
            kotlin.jvm.internal.t.g(e8, "e");
            try {
                C6.q.a aVar = C6.q.f1441b;
                Object objNewInstance = this.f25568a.newInstance(e8.getMessage());
                kotlin.jvm.internal.t.e(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th = (Throwable) objNewInstance;
                th.initCause(e8);
                objB = C6.q.b(th);
            } catch (Throwable th2) {
                C6.q.a aVar2 = C6.q.f1441b;
                objB = C6.q.b(C6.r.a(th2));
            }
            if (C6.q.g(objB)) {
                objB = null;
            }
            return (Throwable) objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f25569a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f25569a = constructor;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e8) {
            Object objB;
            kotlin.jvm.internal.t.g(e8, "e");
            try {
                C6.q.a aVar = C6.q.f1441b;
                Object objNewInstance = this.f25569a.newInstance(null);
                kotlin.jvm.internal.t.e(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th = (Throwable) objNewInstance;
                th.initCause(e8);
                objB = C6.q.b(th);
            } catch (Throwable th2) {
                C6.q.a aVar2 = C6.q.f1441b;
                objB = C6.q.b(C6.r.a(th2));
            }
            return (Throwable) (C6.q.g(objB) ? null : objB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f25570a = new f();

        public f() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable it) {
            kotlin.jvm.internal.t.g(it, "it");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f25571a = new g();

        public g() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable it) {
            kotlin.jvm.internal.t.g(it, "it");
            return null;
        }
    }

    public static final Q6.k a(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length != 1) {
            if (length == 2 && kotlin.jvm.internal.t.c(parameterTypes[0], String.class) && kotlin.jvm.internal.t.c(parameterTypes[1], Throwable.class)) {
                return new a(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (kotlin.jvm.internal.t.c(cls, Throwable.class)) {
            return new b(constructor);
        }
        if (kotlin.jvm.internal.t.c(cls, String.class)) {
            return new c(constructor);
        }
        return null;
    }

    public static final int b(Class cls, int i8) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            kotlin.jvm.internal.t.f(declaredFields, "declaredFields");
            int i9 = 0;
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i9++;
                }
            }
            i8 += i9;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i8;
    }

    public static /* synthetic */ int c(Class cls, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return b(cls, i8);
    }

    public static final int d(Class cls, int i8) {
        Object objB;
        P6.a.c(cls);
        try {
            C6.q.a aVar = C6.q.f1441b;
            objB = C6.q.b(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th) {
            C6.q.a aVar2 = C6.q.f1441b;
            objB = C6.q.b(C6.r.a(th));
        }
        Integer numValueOf = Integer.valueOf(i8);
        if (C6.q.g(objB)) {
            objB = numValueOf;
        }
        return ((Number) objB).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable e(Throwable exception, Throwable cause) {
        Object objB;
        kotlin.jvm.internal.t.g(exception, "exception");
        kotlin.jvm.internal.t.g(cause, "cause");
        if (exception instanceof D) {
            try {
                C6.q.a aVar = C6.q.f1441b;
                objB = C6.q.b(((D) exception).a());
            } catch (Throwable th) {
                C6.q.a aVar2 = C6.q.f1441b;
                objB = C6.q.b(C6.r.a(th));
            }
            return (Throwable) (C6.q.g(objB) ? null : objB);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f25564b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            Q6.k kVar = (Q6.k) f25565c.get(exception.getClass());
            lock.unlock();
            if (kVar != null) {
                return (Throwable) kVar.invoke(exception);
            }
            int i8 = 0;
            if (f25563a != d(exception.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i9 = 0; i9 < readHoldCount; i9++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f25565c.put(exception.getClass(), f.f25570a);
                    G g8 = G.f1419a;
                    while (i8 < readHoldCount) {
                        lock2.lock();
                        i8++;
                    }
                    return null;
                } finally {
                    while (i8 < readHoldCount) {
                        lock2.lock();
                        i8++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = exception.getClass().getConstructors();
            kotlin.jvm.internal.t.f(constructors, "exception.javaClass.constructors");
            Q6.k kVarA = null;
            for (Constructor constructor : C0934n.o0(constructors, new e())) {
                kotlin.jvm.internal.t.f(constructor, vHKCAgr.dBZeeV);
                kVarA = a(constructor);
                if (kVarA != null) {
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f25564b;
            ReentrantReadWriteLock.ReadLock lock3 = reentrantReadWriteLock2.readLock();
            int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i10 = 0; i10 < readHoldCount2; i10++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
            writeLock2.lock();
            try {
                f25565c.put(exception.getClass(), kVarA == null ? g.f25571a : kVarA);
                G g9 = G.f1419a;
                while (i8 < readHoldCount2) {
                    lock3.lock();
                    i8++;
                }
                writeLock2.unlock();
                if (kVarA != null) {
                    return (Throwable) kVarA.invoke(cause);
                }
                return null;
            } catch (Throwable th2) {
                while (i8 < readHoldCount2) {
                    lock3.lock();
                    i8++;
                }
                writeLock2.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }
}
