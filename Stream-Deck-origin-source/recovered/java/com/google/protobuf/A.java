package com.google.protobuf;

import T0.Vl.PCRzgdeK;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f19047a = Charset.forName(PCRzgdeK.bdteqPRv);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f19048b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f19049c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f19050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f19051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2098i f19052f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a extends j {
        @Override // com.google.protobuf.A.j
        a a(int i8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b extends j {
        @Override // com.google.protobuf.A.j
        b a(int i8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        int getNumber();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
        c findValueByNumber(int i8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
        boolean isInRange(int i8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface f extends j {
        @Override // com.google.protobuf.A.j
        f a(int i8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface g extends j {
        @Override // com.google.protobuf.A.j
        g a(int i8);

        int getInt(int i8);

        int h(int i8, int i9);

        void l(int i8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class h extends AbstractList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f19053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f19054b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public interface a {
            Object a(Object obj);
        }

        public h(List<Object> list, a aVar) {
            this.f19053a = list;
            this.f19054b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i8) {
            return this.f19054b.a(this.f19053a.get(i8));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19053a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface i extends j {
        @Override // com.google.protobuf.A.j
        i a(int i8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface j extends List, RandomAccess {
        boolean C();

        j a(int i8);

        void g();
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i8, int i9) {
        int i10 = i(i9, bArr, i8, i9);
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public static int f(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return A0.s(bArr);
    }

    public static Object h(Object obj, Object obj2) {
        return ((T) obj).toBuilder().mergeFrom((T) obj2).buildPartial();
    }

    public static int i(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f19048b);
    }

    static {
        byte[] bArr = new byte[0];
        f19050d = bArr;
        f19051e = ByteBuffer.wrap(bArr);
        f19052f = AbstractC2098i.l(bArr);
    }
}
