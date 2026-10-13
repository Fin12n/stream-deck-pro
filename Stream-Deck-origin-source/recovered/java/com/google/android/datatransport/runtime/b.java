package com.google.android.datatransport.runtime;

import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f17803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p032d4.d f17804c;

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0423b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f17806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p032d4.d f17807c;

        @Override // com.google.android.datatransport.runtime.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f17805a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.e.a
        public e.a c(byte[] bArr) {
            this.f17806b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.e.a
        public e.a d(p032d4.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f17807c = dVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.e.a
        public e a() {
            String str = "";
            if (this.f17805a == null) {
                str = " backendName";
            }
            if (this.f17807c == null) {
                str = str + uYOhHhTXuF.aSta;
            }
            if (str.isEmpty()) {
                return new b(this.f17805a, this.f17806b, this.f17807c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    @Override // com.google.android.datatransport.runtime.e
    public String b() {
        return this.f17802a;
    }

    @Override // com.google.android.datatransport.runtime.e
    public byte[] c() {
        return this.f17803b;
    }

    @Override // com.google.android.datatransport.runtime.e
    public p032d4.d d() {
        return this.f17804c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f17802a.equals(eVar.b())) {
                if (Arrays.equals(this.f17803b, eVar instanceof b ? ((b) eVar).f17803b : eVar.c()) && this.f17804c.equals(eVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f17802a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f17803b)) * 1000003) ^ this.f17804c.hashCode();
    }

    public b(String str, byte[] bArr, p032d4.d dVar) {
        this.f17802a = str;
        this.f17803b = bArr;
        this.f17804c = dVar;
    }
}
