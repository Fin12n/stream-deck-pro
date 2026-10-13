package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2086a implements T {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class AbstractC0427a implements T.a {
        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        public static u0 newUninitializedMessageException(T t8) {
            return new u0(t8);
        }

        public final String b(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract AbstractC0427a mo110clone();

        public abstract AbstractC0427a internalMergeFrom(AbstractC2086a abstractC2086a);

        public boolean mergeDelimitedFrom(InputStream inputStream, C2106q c2106q) throws IOException {
            int i8 = inputStream.read();
            if (i8 == -1) {
                return false;
            }
            mergeFrom((InputStream) new C0428a(inputStream, AbstractC2098i.C(i8, inputStream)), c2106q);
            return true;
        }

        @Override // com.google.protobuf.T.a
        public abstract AbstractC0427a mergeFrom(AbstractC2098i abstractC2098i, C2106q c2106q);

        public static void a(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + QhsKALGiniuQ.SyaBDsbpd;
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            A.a(iterable);
            if (!(iterable instanceof H)) {
                if (iterable instanceof h0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    a(iterable, list);
                    return;
                }
            }
            List listR = ((H) iterable).r();
            H h8 = (H) list;
            int size = list.size();
            for (Object obj : listR) {
                if (obj == null) {
                    String str = "Element at index " + (h8.size() - size) + " is null.";
                    for (int size2 = h8.size() - 1; size2 >= size; size2--) {
                        h8.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC2097h) {
                    h8.k((AbstractC2097h) obj);
                } else {
                    h8.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0428a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19263a;

            public C0428a(InputStream inputStream, int i8) {
                super(inputStream);
                this.f19263a = i8;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f19263a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f19263a <= 0) {
                    return -1;
                }
                int i8 = super.read();
                if (i8 >= 0) {
                    this.f19263a--;
                }
                return i8;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j8) {
                int iSkip = (int) super.skip(Math.min(j8, this.f19263a));
                if (iSkip >= 0) {
                    this.f19263a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i8, int i9) throws IOException {
                int i10 = this.f19263a;
                if (i10 <= 0) {
                    return -1;
                }
                int i11 = super.read(bArr, i8, Math.min(i9, i10));
                if (i11 >= 0) {
                    this.f19263a -= i11;
                }
                return i11;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, C2106q.b());
        }

        public AbstractC0427a mergeFrom(AbstractC2098i abstractC2098i) {
            return mergeFrom(abstractC2098i, C2106q.b());
        }

        public AbstractC0427a mergeFrom(AbstractC2097h abstractC2097h) throws B {
            try {
                AbstractC2098i abstractC2098iL = abstractC2097h.L();
                mergeFrom(abstractC2098iL);
                abstractC2098iL.a(0);
                return this;
            } catch (B e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException(b("ByteString"), e9);
            }
        }

        @Override // com.google.protobuf.T.a
        public AbstractC0427a mergeFrom(AbstractC2097h abstractC2097h, C2106q c2106q) throws B {
            try {
                AbstractC2098i abstractC2098iL = abstractC2097h.L();
                mergeFrom(abstractC2098iL, c2106q);
                abstractC2098iL.a(0);
                return this;
            } catch (B e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException(b("ByteString"), e9);
            }
        }

        public AbstractC0427a mergeFrom(byte[] bArr) {
            return m108mergeFrom(bArr, 0, bArr.length);
        }

        /* JADX INFO: renamed from: mergeFrom */
        public AbstractC0427a m108mergeFrom(byte[] bArr, int i8, int i9) throws B {
            try {
                AbstractC2098i abstractC2098iM = AbstractC2098i.m(bArr, i8, i9);
                mergeFrom(abstractC2098iM);
                abstractC2098iM.a(0);
                return this;
            } catch (B e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException(b("byte array"), e9);
            }
        }

        public AbstractC0427a mergeFrom(byte[] bArr, C2106q c2106q) {
            return m109mergeFrom(bArr, 0, bArr.length, c2106q);
        }

        /* JADX INFO: renamed from: mergeFrom */
        public AbstractC0427a m109mergeFrom(byte[] bArr, int i8, int i9, C2106q c2106q) throws B {
            try {
                AbstractC2098i abstractC2098iM = AbstractC2098i.m(bArr, i8, i9);
                mergeFrom(abstractC2098iM, c2106q);
                abstractC2098iM.a(0);
                return this;
            } catch (B e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException(b("byte array"), e9);
            }
        }

        public AbstractC0427a mergeFrom(InputStream inputStream) {
            AbstractC2098i abstractC2098iH = AbstractC2098i.h(inputStream);
            mergeFrom(abstractC2098iH);
            abstractC2098iH.a(0);
            return this;
        }

        public AbstractC0427a mergeFrom(InputStream inputStream, C2106q c2106q) {
            AbstractC2098i abstractC2098iH = AbstractC2098i.h(inputStream);
            mergeFrom(abstractC2098iH, c2106q);
            abstractC2098iH.a(0);
            return this;
        }

        @Override // com.google.protobuf.T.a
        public AbstractC0427a mergeFrom(T t8) {
            if (getDefaultInstanceForType().getClass().isInstance(t8)) {
                return internalMergeFrom((AbstractC2086a) t8);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0427a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC2097h abstractC2097h) {
        if (!abstractC2097h.I()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(n0 n0Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iH = n0Var.h(this);
        setMemoizedSerializedSize(iH);
        return iH;
    }

    public u0 newUninitializedMessageException() {
        return new u0(this);
    }

    public void setMemoizedSerializedSize(int i8) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            AbstractC2100k abstractC2100kG0 = AbstractC2100k.g0(bArr);
            writeTo(abstractC2100kG0);
            abstractC2100kG0.d();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException(a("byte array"), e8);
        }
    }

    @Override // com.google.protobuf.T
    public AbstractC2097h toByteString() {
        try {
            AbstractC2097h.C0429h c0429hK = AbstractC2097h.K(getSerializedSize());
            writeTo(c0429hK.b());
            return c0429hK.a();
        } catch (IOException e8) {
            throw new RuntimeException(a("ByteString"), e8);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        AbstractC2100k abstractC2100kF0 = AbstractC2100k.f0(outputStream, AbstractC2100k.J(AbstractC2100k.X(serializedSize) + serializedSize));
        abstractC2100kF0.Y0(serializedSize);
        writeTo(abstractC2100kF0);
        abstractC2100kF0.c0();
    }

    public void writeTo(OutputStream outputStream) {
        AbstractC2100k abstractC2100kF0 = AbstractC2100k.f0(outputStream, AbstractC2100k.J(getSerializedSize()));
        writeTo(abstractC2100kF0);
        abstractC2100kF0.c0();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0427a.addAll((Iterable) iterable, (List) list);
    }
}
