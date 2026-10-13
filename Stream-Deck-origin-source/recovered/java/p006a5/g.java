package p006a5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b8 : bArr) {
            int i8 = b8 & 255;
            sb.append("0123456789abcdef".charAt(i8 / 16));
            sb.append("0123456789abcdef".charAt(i8 % 16));
        }
        return sb.toString();
    }
}
