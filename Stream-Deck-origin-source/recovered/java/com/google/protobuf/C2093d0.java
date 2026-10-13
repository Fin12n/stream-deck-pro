package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2093d0 extends AbstractC2097h.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f19271e;

    public C2093d0(ByteBuffer byteBuffer) {
        A.b(byteBuffer, "buffer");
        this.f19271e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // com.google.protobuf.AbstractC2097h
    public void F(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f19271e.slice());
    }

    @Override // com.google.protobuf.AbstractC2097h
    public void G(byte[] bArr, int i8, int i9, int i10) {
        ByteBuffer byteBufferSlice = this.f19271e.slice();
        C.b(byteBufferSlice, i8);
        byteBufferSlice.get(bArr, i9, i10);
    }

    @Override // com.google.protobuf.AbstractC2097h
    public byte H(int i8) {
        return t(i8);
    }

    @Override // com.google.protobuf.AbstractC2097h
    public boolean I() {
        return A0.r(this.f19271e);
    }

    @Override // com.google.protobuf.AbstractC2097h
    public AbstractC2098i L() {
        return AbstractC2098i.k(this.f19271e, true);
    }

    @Override // com.google.protobuf.AbstractC2097h
    public int M(int i8, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + this.f19271e.get(i11);
        }
        return i8;
    }

    @Override // com.google.protobuf.AbstractC2097h
    public AbstractC2097h O(int i8, int i9) {
        try {
            return new C2093d0(Z(i8, i9));
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e9) {
            throw new ArrayIndexOutOfBoundsException(e9.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC2097h
    public String S(Charset charset) {
        byte[] bArrP;
        int length;
        int iArrayOffset;
        if (this.f19271e.hasArray()) {
            bArrP = this.f19271e.array();
            iArrayOffset = this.f19271e.arrayOffset() + this.f19271e.position();
            length = this.f19271e.remaining();
        } else {
            bArrP = P();
            length = bArrP.length;
            iArrayOffset = 0;
        }
        return new String(bArrP, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.AbstractC2097h
    public void Y(AbstractC2096g abstractC2096g) {
        abstractC2096g.a(this.f19271e.slice());
    }

    public final ByteBuffer Z(int i8, int i9) {
        if (i8 < this.f19271e.position() || i9 > this.f19271e.limit() || i8 > i9) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        ByteBuffer byteBufferSlice = this.f19271e.slice();
        C.b(byteBufferSlice, i8 - this.f19271e.position());
        C.a(byteBufferSlice, i9 - this.f19271e.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.AbstractC2097h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2097h)) {
            return false;
        }
        AbstractC2097h abstractC2097h = (AbstractC2097h) obj;
        if (size() != abstractC2097h.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof C2093d0 ? this.f19271e.equals(((C2093d0) obj).f19271e) : this.f19271e.equals(abstractC2097h.o());
    }

    @Override // com.google.protobuf.AbstractC2097h
    public ByteBuffer o() {
        return this.f19271e.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC2097h
    public int size() {
        return this.f19271e.remaining();
    }

    @Override // com.google.protobuf.AbstractC2097h
    public byte t(int i8) {
        try {
            return this.f19271e.get(i8);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e9) {
            throw new ArrayIndexOutOfBoundsException(e9.getMessage());
        }
    }
}
