package p195w4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f37115b;

    public w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f37115b = bArr;
    }

    @Override // p195w4.v
    public final byte[] P() {
        return this.f37115b;
    }
}
