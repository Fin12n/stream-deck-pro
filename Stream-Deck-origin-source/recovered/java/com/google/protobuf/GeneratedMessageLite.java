package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractC2086a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected w0 unknownFields = w0.c();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19174a;

        static {
            int[] iArr = new int[C0.c.values().length];
            f19174a = iArr;
            try {
                iArr[C0.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19174a[C0.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b extends AbstractC2086a.AbstractC0427a {
        private final GeneratedMessageLite defaultInstance;
        protected GeneratedMessageLite instance;

        public b(GeneratedMessageLite generatedMessageLite) {
            this.defaultInstance = generatedMessageLite;
            if (generatedMessageLite.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = e();
        }

        public static void d(Object obj, Object obj2) {
            j0.a().d(obj).a(obj, obj2);
        }

        private GeneratedMessageLite e() {
            return this.defaultInstance.newMutableInstance();
        }

        public final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        public void copyOnWriteInternal() {
            GeneratedMessageLite generatedMessageLiteE = e();
            d(generatedMessageLiteE, this.instance);
            this.instance = generatedMessageLiteE;
        }

        @Override // com.google.protobuf.U
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.T.a
        public final GeneratedMessageLite build() {
            GeneratedMessageLite generatedMessageLiteBuildPartial = buildPartial();
            if (generatedMessageLiteBuildPartial.isInitialized()) {
                return generatedMessageLiteBuildPartial;
            }
            throw AbstractC2086a.AbstractC0427a.newUninitializedMessageException(generatedMessageLiteBuildPartial);
        }

        @Override // com.google.protobuf.T.a
        public GeneratedMessageLite buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
        public final b m107clear() {
            if (this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = e();
            return this;
        }

        @Override // com.google.protobuf.U
        public GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.AbstractC2086a.AbstractC0427a
        public b internalMergeFrom(GeneratedMessageLite generatedMessageLite) {
            return mergeFrom(generatedMessageLite);
        }

        @Override // com.google.protobuf.AbstractC2086a.AbstractC0427a
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public b mo110clone() {
            b bVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            bVarNewBuilderForType.instance = buildPartial();
            return bVarNewBuilderForType;
        }

        public b mergeFrom(GeneratedMessageLite generatedMessageLite) {
            if (getDefaultInstanceForType().equals(generatedMessageLite)) {
                return this;
            }
            copyOnWrite();
            d(this.instance, generatedMessageLite);
            return this;
        }

        @Override // com.google.protobuf.AbstractC2086a.AbstractC0427a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public b m109mergeFrom(byte[] bArr, int i8, int i9, C2106q c2106q) throws B {
            copyOnWrite();
            try {
                j0.a().d(this.instance).f(this.instance, bArr, i8, i8 + i9, new AbstractC2094e.b(c2106q));
                return this;
            } catch (B e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
            } catch (IndexOutOfBoundsException unused) {
                throw B.n();
            }
        }

        @Override // com.google.protobuf.AbstractC2086a.AbstractC0427a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public b m108mergeFrom(byte[] bArr, int i8, int i9) {
            return m109mergeFrom(bArr, i8, i9, C2106q.b());
        }

        @Override // com.google.protobuf.AbstractC2086a.AbstractC0427a, com.google.protobuf.T.a
        public b mergeFrom(AbstractC2098i abstractC2098i, C2106q c2106q) throws IOException {
            copyOnWrite();
            try {
                j0.a().d(this.instance).e(this.instance, C2099j.Q(abstractC2098i), c2106q);
                return this;
            } catch (RuntimeException e8) {
                if (e8.getCause() instanceof IOException) {
                    throw ((IOException) e8.getCause());
                }
                throw e8;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends AbstractC2088b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeneratedMessageLite f19175b;

        public c(GeneratedMessageLite generatedMessageLite) {
            this.f19175b = generatedMessageLite;
        }

        @Override // com.google.protobuf.g0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite b(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return GeneratedMessageLite.parsePartialFrom(this.f19175b, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements C2110v.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final A.d f19176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0.b f19178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19180e;

        public d(A.d dVar, int i8, C0.b bVar, boolean z8, boolean z9) {
            this.f19176a = dVar;
            this.f19177b = i8;
            this.f19178c = bVar;
            this.f19179d = z8;
            this.f19180e = z9;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f19177b - dVar.f19177b;
        }

        public A.d b() {
            return this.f19176a;
        }

        @Override // com.google.protobuf.C2110v.b
        public boolean g() {
            return this.f19179d;
        }

        @Override // com.google.protobuf.C2110v.b
        public int getNumber() {
            return this.f19177b;
        }

        @Override // com.google.protobuf.C2110v.b
        public C0.b h() {
            return this.f19178c;
        }

        @Override // com.google.protobuf.C2110v.b
        public T.a i(T.a aVar, T t8) {
            return ((b) aVar).mergeFrom((GeneratedMessageLite) t8);
        }

        @Override // com.google.protobuf.C2110v.b
        public C0.c n() {
            return this.f19178c.a();
        }

        @Override // com.google.protobuf.C2110v.b
        public boolean q() {
            return this.f19180e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e extends AbstractC2104o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f19181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f19182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f19183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f19184d;

        public e(T t8, Object obj, T t9, d dVar, Class cls) {
            if (t8 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (dVar.h() == C0.b.f19077m && t9 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f19181a = t8;
            this.f19182b = obj;
            this.f19183c = t9;
            this.f19184d = dVar;
        }

        public Object b(Object obj) {
            if (!this.f19184d.g()) {
                return h(obj);
            }
            if (this.f19184d.n() != C0.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(h(it.next()));
            }
            return arrayList;
        }

        public T c() {
            return this.f19181a;
        }

        public C0.b d() {
            return this.f19184d.h();
        }

        public T e() {
            return this.f19183c;
        }

        public int f() {
            return this.f19184d.getNumber();
        }

        public boolean g() {
            return this.f19184d.f19179d;
        }

        public Object h(Object obj) {
            return this.f19184d.n() == C0.c.ENUM ? this.f19184d.f19176a.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        public Object i(Object obj) {
            return this.f19184d.n() == C0.c.ENUM ? Integer.valueOf(((A.c) obj).getNumber()) : obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static e b(AbstractC2104o abstractC2104o) {
        if (abstractC2104o.a()) {
            return (e) abstractC2104o;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    public static GeneratedMessageLite c(GeneratedMessageLite generatedMessageLite) throws B {
        if (generatedMessageLite == null || generatedMessageLite.isInitialized()) {
            return generatedMessageLite;
        }
        throw generatedMessageLite.newUninitializedMessageException().a().k(generatedMessageLite);
    }

    public static A.a emptyBooleanList() {
        return C2095f.u();
    }

    public static A.b emptyDoubleList() {
        return C2102m.u();
    }

    public static A.f emptyFloatList() {
        return C2112x.u();
    }

    public static A.g emptyIntList() {
        return C2114z.t();
    }

    public static A.i emptyLongList() {
        return J.u();
    }

    public static <E> A.j emptyProtobufList() {
        return k0.o();
    }

    public static GeneratedMessageLite f(GeneratedMessageLite generatedMessageLite, InputStream inputStream, C2106q c2106q) throws B {
        try {
            int i8 = inputStream.read();
            if (i8 == -1) {
                return null;
            }
            AbstractC2098i abstractC2098iH = AbstractC2098i.h(new AbstractC2086a.AbstractC0427a.C0428a(inputStream, AbstractC2098i.C(i8, inputStream)));
            GeneratedMessageLite partialFrom = parsePartialFrom(generatedMessageLite, abstractC2098iH, c2106q);
            try {
                abstractC2098iH.a(0);
                return partialFrom;
            } catch (B e8) {
                throw e8.k(partialFrom);
            }
        } catch (B e9) {
            if (e9.a()) {
                throw new B((IOException) e9);
            }
            throw e9;
        } catch (IOException e10) {
            throw new B(e10);
        }
    }

    public static GeneratedMessageLite g(GeneratedMessageLite generatedMessageLite, AbstractC2097h abstractC2097h, C2106q c2106q) throws B {
        AbstractC2098i abstractC2098iL = abstractC2097h.L();
        GeneratedMessageLite partialFrom = parsePartialFrom(generatedMessageLite, abstractC2098iL, c2106q);
        try {
            abstractC2098iL.a(0);
            return partialFrom;
        } catch (B e8) {
            throw e8.k(partialFrom);
        }
    }

    public static <T extends GeneratedMessageLite> T getDefaultInstance(Class<T> cls) {
        T t8 = (T) defaultInstanceMap.get(cls);
        if (t8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t8 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (t8 != null) {
            return t8;
        }
        T t9 = (T) ((GeneratedMessageLite) z0.l(cls)).getDefaultInstanceForType();
        if (t9 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t9);
        return t9;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e8);
        }
    }

    public static GeneratedMessageLite h(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i8, int i9, C2106q c2106q) throws B {
        GeneratedMessageLite generatedMessageLiteNewMutableInstance = generatedMessageLite.newMutableInstance();
        try {
            n0 n0VarD = j0.a().d(generatedMessageLiteNewMutableInstance);
            n0VarD.f(generatedMessageLiteNewMutableInstance, bArr, i8, i8 + i9, new AbstractC2094e.b(c2106q));
            n0VarD.c(generatedMessageLiteNewMutableInstance);
            return generatedMessageLiteNewMutableInstance;
        } catch (B e8) {
            B b8 = e8;
            if (b8.a()) {
                b8 = new B((IOException) b8);
            }
            throw b8.k(generatedMessageLiteNewMutableInstance);
        } catch (u0 e9) {
            throw e9.a().k(generatedMessageLiteNewMutableInstance);
        } catch (IOException e10) {
            if (e10.getCause() instanceof B) {
                throw ((B) e10.getCause());
            }
            throw new B(e10).k(generatedMessageLiteNewMutableInstance);
        } catch (IndexOutOfBoundsException unused) {
            throw B.n().k(generatedMessageLiteNewMutableInstance);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static A.g mutableCopy(A.g gVar) {
        int size = gVar.size();
        return gVar.a(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(T t8, String str, Object[] objArr) {
        return new l0(t8, str, objArr);
    }

    public static <ContainingType extends T, Type> e newRepeatedGeneratedExtension(ContainingType containingtype, T t8, A.d dVar, int i8, C0.b bVar, boolean z8, Class cls) {
        return new e(containingtype, Collections.EMPTY_LIST, t8, new d(dVar, i8, bVar, true, z8), cls);
    }

    public static <ContainingType extends T, Type> e newSingularGeneratedExtension(ContainingType containingtype, Type type, T t8, A.d dVar, int i8, C0.b bVar, Class cls) {
        return new e(containingtype, type, t8, new d(dVar, i8, bVar, false, false), cls);
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t8, InputStream inputStream) {
        return (T) c(f(t8, inputStream, C2106q.b()));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, ByteBuffer byteBuffer, C2106q c2106q) {
        return (T) c(parseFrom(t8, AbstractC2098i.j(byteBuffer), c2106q));
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t8, AbstractC2098i abstractC2098i, C2106q c2106q) throws B {
        T t9 = (T) t8.newMutableInstance();
        try {
            n0 n0VarD = j0.a().d(t9);
            n0VarD.e(t9, C2099j.Q(abstractC2098i), c2106q);
            n0VarD.c(t9);
            return t9;
        } catch (B e8) {
            e = e8;
            if (e.a()) {
                e = new B((IOException) e);
            }
            throw e.k(t9);
        } catch (u0 e9) {
            throw e9.a().k(t9);
        } catch (IOException e10) {
            if (e10.getCause() instanceof B) {
                throw ((B) e10.getCause());
            }
            throw new B(e10).k(t9);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof B) {
                throw ((B) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends GeneratedMessageLite> void registerDefaultInstance(Class<T> cls, T t8) {
        t8.markImmutable();
        defaultInstanceMap.put(cls, t8);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(f.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        return j0.a().d(this).j(this);
    }

    public final <MessageType extends GeneratedMessageLite, BuilderType extends b> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(f.NEW_BUILDER);
    }

    public final int d(n0 n0Var) {
        return n0Var == null ? j0.a().d(this).h(this) : n0Var.h(this);
    }

    public Object dynamicMethod(f fVar, Object obj) {
        return dynamicMethod(fVar, obj, null);
    }

    public abstract Object dynamicMethod(f fVar, Object obj, Object obj2);

    public final void e() {
        if (this.unknownFields == w0.c()) {
            this.unknownFields = w0.o();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return j0.a().d(this).g(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC2086a
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.T
    public final g0 getParserForType() {
        return (g0) dynamicMethod(f.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC2086a
    public int getSerializedSize(n0 n0Var) {
        if (!isMutable()) {
            if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return getMemoizedSerializedSize();
            }
            int iD = d(n0Var);
            setMemoizedSerializedSize(iD);
            return iD;
        }
        int iD2 = d(n0Var);
        if (iD2 >= 0) {
            return iD2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iD2);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.U
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        j0.a().d(this).c(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i8, AbstractC2097h abstractC2097h) {
        e();
        this.unknownFields.l(i8, abstractC2097h);
    }

    public final void mergeUnknownFields(w0 w0Var) {
        this.unknownFields = w0.n(this.unknownFields, w0Var);
    }

    public void mergeVarintField(int i8, int i9) {
        e();
        this.unknownFields.m(i8, i9);
    }

    public GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(f.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i8, AbstractC2098i abstractC2098i) {
        if (C0.b(i8) == 4) {
            return false;
        }
        e();
        return this.unknownFields.i(i8, abstractC2098i);
    }

    public void setMemoizedHashCode(int i8) {
        this.memoizedHashCode = i8;
    }

    @Override // com.google.protobuf.AbstractC2086a
    public void setMemoizedSerializedSize(int i8) {
        if (i8 >= 0) {
            this.memoizedSerializedSize = (i8 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i8);
        }
    }

    public String toString() {
        return V.f(this, super.toString());
    }

    @Override // com.google.protobuf.T
    public void writeTo(AbstractC2100k abstractC2100k) {
        j0.a().d(this).b(this, C2101l.P(abstractC2100k));
    }

    public static final <T extends GeneratedMessageLite> boolean isInitialized(T t8, boolean z8) {
        byte bByteValue = ((Byte) t8.dynamicMethod(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = j0.a().d(t8).d(t8);
        if (z8) {
            t8.dynamicMethod(f.SET_MEMOIZED_IS_INITIALIZED, zD ? t8 : null);
        }
        return zD;
    }

    public final <MessageType extends GeneratedMessageLite, BuilderType extends b> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((GeneratedMessageLite) messagetype);
    }

    public Object dynamicMethod(f fVar) {
        return dynamicMethod(fVar, null, null);
    }

    @Override // com.google.protobuf.U
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(f.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.T
    public final b newBuilderForType() {
        return (b) dynamicMethod(f.NEW_BUILDER);
    }

    @Override // com.google.protobuf.T
    public final b toBuilder() {
        return ((b) dynamicMethod(f.NEW_BUILDER)).mergeFrom(this);
    }

    public static A.i mutableCopy(A.i iVar) {
        int size = iVar.size();
        return iVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, ByteBuffer byteBuffer) {
        return (T) parseFrom(t8, byteBuffer, C2106q.b());
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t8, InputStream inputStream, C2106q c2106q) {
        return (T) c(f(t8, inputStream, c2106q));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, AbstractC2097h abstractC2097h) {
        return (T) c(parseFrom(t8, abstractC2097h, C2106q.b()));
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite implements U {
        protected C2110v extensions = C2110v.h();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f19170a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry f19171b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f19172c;

            public /* synthetic */ a(ExtendableMessage extendableMessage, boolean z8, a aVar) {
                this(z8);
            }

            public a(boolean z8) {
                Iterator itW = ExtendableMessage.this.extensions.w();
                this.f19170a = itW;
                if (itW.hasNext()) {
                    this.f19171b = (Map.Entry) itW.next();
                }
                this.f19172c = z8;
            }
        }

        private void eagerlyMergeMessageSetExtension(AbstractC2098i abstractC2098i, e eVar, C2106q c2106q, int i8) {
            parseExtension(abstractC2098i, c2106q, eVar, C0.c(i8, 2), i8);
        }

        private void mergeMessageSetExtensionFromBytes(AbstractC2097h abstractC2097h, C2106q c2106q, e eVar) {
            T t8 = (T) this.extensions.i(eVar.f19184d);
            T.a builder = t8 != null ? t8.toBuilder() : null;
            if (builder == null) {
                builder = eVar.e().newBuilderForType();
            }
            builder.mergeFrom(abstractC2097h, c2106q);
            ensureExtensionsAreMutable().C(eVar.f19184d, eVar.i(builder.build()));
        }

        private <MessageType extends T> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC2098i abstractC2098i, C2106q c2106q) {
            int iK = 0;
            AbstractC2097h abstractC2097hR = null;
            e eVarA = null;
            while (true) {
                int iJ = abstractC2098i.J();
                if (iJ == 0) {
                    break;
                }
                if (iJ == C0.f19064c) {
                    iK = abstractC2098i.K();
                    if (iK != 0) {
                        eVarA = c2106q.a(messagetype, iK);
                    }
                } else if (iJ == C0.f19065d) {
                    if (iK == 0 || eVarA == null) {
                        abstractC2097hR = abstractC2098i.r();
                    } else {
                        eagerlyMergeMessageSetExtension(abstractC2098i, eVarA, c2106q, iK);
                        abstractC2097hR = null;
                    }
                } else if (!abstractC2098i.M(iJ)) {
                    break;
                }
            }
            abstractC2098i.a(C0.f19063b);
            if (abstractC2097hR == null || iK == 0) {
                return;
            }
            if (eVarA != null) {
                mergeMessageSetExtensionFromBytes(abstractC2097hR, c2106q, eVarA);
            } else {
                mergeLengthDelimitedField(iK, abstractC2097hR);
            }
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0008  */
        private boolean parseExtension(AbstractC2098i abstractC2098i, C2106q c2106q, e eVar, int i8, int i9) {
            boolean z8;
            boolean z9;
            Object objBuild;
            T t8;
            int iB = C0.b(i8);
            if (eVar == null) {
                z9 = true;
                z8 = false;
            } else if (iB == C2110v.o(eVar.f19184d.h(), false)) {
                z9 = false;
                z8 = false;
            } else {
                d dVar = eVar.f19184d;
                if (dVar.f19179d && dVar.f19178c.c() && iB == C2110v.o(eVar.f19184d.h(), true)) {
                    z8 = true;
                    z9 = false;
                } else {
                    z9 = true;
                    z8 = false;
                }
            }
            if (z9) {
                return parseUnknownField(i8, abstractC2098i);
            }
            ensureExtensionsAreMutable();
            if (z8) {
                int iP = abstractC2098i.p(abstractC2098i.B());
                if (eVar.f19184d.h() == C0.b.f19080p) {
                    while (abstractC2098i.e() > 0) {
                        A.c cVarFindValueByNumber = eVar.f19184d.b().findValueByNumber(abstractC2098i.t());
                        if (cVarFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.a(eVar.f19184d, eVar.i(cVarFindValueByNumber));
                    }
                } else {
                    while (abstractC2098i.e() > 0) {
                        this.extensions.a(eVar.f19184d, C2110v.B(abstractC2098i, eVar.f19184d.h(), false));
                    }
                }
                abstractC2098i.o(iP);
            } else {
                int i10 = a.f19174a[eVar.f19184d.n().ordinal()];
                if (i10 == 1) {
                    T.a builder = (eVar.f19184d.g() || (t8 = (T) this.extensions.i(eVar.f19184d)) == null) ? null : t8.toBuilder();
                    if (builder == null) {
                        builder = eVar.e().newBuilderForType();
                    }
                    if (eVar.f19184d.h() == C0.b.f19076l) {
                        abstractC2098i.x(eVar.f(), builder, c2106q);
                    } else {
                        abstractC2098i.A(builder, c2106q);
                    }
                    objBuild = builder.build();
                } else if (i10 != 2) {
                    objBuild = C2110v.B(abstractC2098i, eVar.f19184d.h(), false);
                } else {
                    int iT = abstractC2098i.t();
                    A.c cVarFindValueByNumber2 = eVar.f19184d.b().findValueByNumber(iT);
                    if (cVarFindValueByNumber2 == null) {
                        mergeVarintField(i9, iT);
                        return true;
                    }
                    objBuild = cVarFindValueByNumber2;
                }
                if (eVar.f19184d.g()) {
                    this.extensions.a(eVar.f19184d, eVar.i(objBuild));
                } else {
                    this.extensions.C(eVar.f19184d, eVar.i(objBuild));
                }
            }
            return true;
        }

        private void verifyExtensionContainingType(e eVar) {
            if (eVar.c() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public C2110v ensureExtensionsAreMutable() {
            if (this.extensions.r()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.s();
        }

        public int extensionsSerializedSize() {
            return this.extensions.n();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.j();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.U
        public /* bridge */ /* synthetic */ T getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public final <Type> Type getExtension(AbstractC2104o abstractC2104o) {
            e eVarB = GeneratedMessageLite.b(abstractC2104o);
            verifyExtensionContainingType(eVarB);
            Object objI = this.extensions.i(eVarB.f19184d);
            return objI == null ? (Type) eVarB.f19182b : (Type) eVarB.b(objI);
        }

        public final <Type> int getExtensionCount(AbstractC2104o abstractC2104o) {
            e eVarB = GeneratedMessageLite.b(abstractC2104o);
            verifyExtensionContainingType(eVarB);
            return this.extensions.m(eVarB.f19184d);
        }

        public final <Type> boolean hasExtension(AbstractC2104o abstractC2104o) {
            e eVarB = GeneratedMessageLite.b(abstractC2104o);
            verifyExtensionContainingType(eVarB);
            return this.extensions.p(eVarB.f19184d);
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.r()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.y(messagetype.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.T
        public /* bridge */ /* synthetic */ T.a newBuilderForType() {
            return super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new a(this, false, null);
        }

        public ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new a(this, true, null);
        }

        public <MessageType extends T> boolean parseUnknownField(MessageType messagetype, AbstractC2098i abstractC2098i, C2106q c2106q, int i8) {
            int iA = C0.a(i8);
            return parseExtension(abstractC2098i, c2106q, c2106q.a(messagetype, iA), i8, iA);
        }

        public <MessageType extends T> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC2098i abstractC2098i, C2106q c2106q, int i8) {
            if (i8 != C0.f19062a) {
                return C0.b(i8) == 2 ? parseUnknownField(messagetype, abstractC2098i, c2106q, i8) : abstractC2098i.M(i8);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, abstractC2098i, c2106q);
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.T
        public /* bridge */ /* synthetic */ T.a toBuilder() {
            return super.toBuilder();
        }

        public final <Type> Type getExtension(AbstractC2104o abstractC2104o, int i8) {
            e eVarB = GeneratedMessageLite.b(abstractC2104o);
            verifyExtensionContainingType(eVarB);
            return (Type) eVarB.h(this.extensions.l(eVarB.f19184d, i8));
        }
    }

    public static A.f mutableCopy(A.f fVar) {
        int size = fVar.size();
        return fVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, AbstractC2097h abstractC2097h, C2106q c2106q) {
        return (T) c(g(t8, abstractC2097h, c2106q));
    }

    public static A.b mutableCopy(A.b bVar) {
        int size = bVar.size();
        return bVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, byte[] bArr) {
        return (T) c(h(t8, bArr, 0, bArr.length, C2106q.b()));
    }

    @Override // com.google.protobuf.T
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static A.a mutableCopy(A.a aVar) {
        int size = aVar.size();
        return aVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, byte[] bArr, C2106q c2106q) {
        return (T) c(h(t8, bArr, 0, bArr.length, c2106q));
    }

    public static <E> A.j mutableCopy(A.j jVar) {
        int size = jVar.size();
        return jVar.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, InputStream inputStream) {
        return (T) c(parsePartialFrom(t8, AbstractC2098i.h(inputStream), C2106q.b()));
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t8, AbstractC2098i abstractC2098i) {
        return (T) parsePartialFrom(t8, abstractC2098i, C2106q.b());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, InputStream inputStream, C2106q c2106q) {
        return (T) c(parsePartialFrom(t8, AbstractC2098i.h(inputStream), c2106q));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, AbstractC2098i abstractC2098i) {
        return (T) parseFrom(t8, abstractC2098i, C2106q.b());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t8, AbstractC2098i abstractC2098i, C2106q c2106q) {
        return (T) c(parsePartialFrom(t8, abstractC2098i, c2106q));
    }
}
