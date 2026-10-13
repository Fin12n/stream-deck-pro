package p185v2;

import M6.eLZq.eGwOBWCdOTaKus;
import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f35092a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f35093b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) {
        c.h(inputStream);
        int iJ = c.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            c.j(inputStream);
            for (int iJ2 = c.j(inputStream); iJ2 > 0; iJ2--) {
                c.h(inputStream);
            }
            iJ--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, l.f35094a)) {
            N(outputStream, bVarArr);
            return true;
        }
        if (Arrays.equals(bArr, l.f35095b)) {
            M(outputStream, bVarArr);
            return true;
        }
        if (Arrays.equals(bArr, l.f35097d)) {
            K(outputStream, bVarArr);
            return true;
        }
        if (Arrays.equals(bArr, l.f35096c)) {
            L(outputStream, bVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, l.f35098e)) {
            return false;
        }
        J(outputStream, bVarArr);
        return true;
    }

    public static void C(OutputStream outputStream, b bVar) throws IOException {
        int[] iArr = bVar.f35075h;
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            c.p(outputStream, i10 - i9);
            i8++;
            i9 = i10;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f35092a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, b bVar) throws IOException {
        I(outputStream, bVar);
        C(outputStream, bVar);
        H(outputStream, bVar);
    }

    public static void G(OutputStream outputStream, b bVar, String str) throws IOException {
        c.p(outputStream, c.k(str));
        c.p(outputStream, bVar.f35072e);
        c.q(outputStream, bVar.f35073f);
        c.q(outputStream, bVar.f35070c);
        c.q(outputStream, bVar.f35074g);
        c.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, b bVar) throws IOException {
        byte[] bArr = new byte[k(bVar.f35074g)];
        for (Map.Entry entry : bVar.f35076i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, bVar);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, bVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, b bVar) throws IOException {
        int i8 = 0;
        for (Map.Entry entry : bVar.f35076i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                c.p(outputStream, iIntValue - i8);
                c.p(outputStream, 0);
                i8 = iIntValue;
            }
        }
    }

    public static void J(OutputStream outputStream, b[] bVarArr) throws IOException {
        c.p(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String strJ = j(bVar.f35068a, bVar.f35069b, l.f35098e);
            c.p(outputStream, c.k(strJ));
            c.p(outputStream, bVar.f35076i.size());
            c.p(outputStream, bVar.f35075h.length);
            c.q(outputStream, bVar.f35070c);
            c.n(outputStream, strJ);
            Iterator it = bVar.f35076i.keySet().iterator();
            while (it.hasNext()) {
                c.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i8 : bVar.f35075h) {
                c.p(outputStream, i8);
            }
        }
    }

    public static void K(OutputStream outputStream, b[] bVarArr) throws IOException {
        c.r(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            int size = bVar.f35076i.size() * 4;
            String strJ = j(bVar.f35068a, bVar.f35069b, l.f35097d);
            c.p(outputStream, c.k(strJ));
            c.p(outputStream, bVar.f35075h.length);
            c.q(outputStream, size);
            c.q(outputStream, bVar.f35070c);
            c.n(outputStream, strJ);
            Iterator it = bVar.f35076i.keySet().iterator();
            while (it.hasNext()) {
                c.p(outputStream, ((Integer) it.next()).intValue());
                c.p(outputStream, 0);
            }
            for (int i8 : bVar.f35075h) {
                c.p(outputStream, i8);
            }
        }
    }

    public static void L(OutputStream outputStream, b[] bVarArr) throws IOException {
        byte[] bArrB = b(bVarArr, l.f35096c);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, bArrB);
    }

    public static void M(OutputStream outputStream, b[] bVarArr) throws IOException {
        byte[] bArrB = b(bVarArr, l.f35095b);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, bArrB);
    }

    public static void N(OutputStream outputStream, b[] bVarArr) throws IOException {
        O(outputStream, bVarArr);
    }

    public static void O(OutputStream outputStream, b[] bVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(bVarArr));
        arrayList.add(c(bVarArr));
        arrayList.add(d(bVarArr));
        long length2 = ((long) l.f35094a.length) + ((long) f35092a.length) + 4 + ((long) (arrayList.size() * 16));
        c.q(outputStream, arrayList.size());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            m mVar = (m) arrayList.get(i8);
            c.q(outputStream, mVar.f35101a.b());
            c.q(outputStream, length2);
            if (mVar.f35104d) {
                byte[] bArr = mVar.f35103c;
                long length3 = bArr.length;
                byte[] bArrB = c.b(bArr);
                arrayList2.add(bArrB);
                c.q(outputStream, bArrB.length);
                c.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(mVar.f35103c);
                c.q(outputStream, mVar.f35103c.length);
                c.q(outputStream, 0L);
                length = mVar.f35103c.length;
            }
            length2 += (long) length;
        }
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            outputStream.write((byte[]) arrayList2.get(i9));
        }
    }

    public static int a(b bVar) {
        Iterator it = bVar.f35076i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) throws IOException {
        int i8 = 0;
        int iK = 0;
        for (b bVar : bVarArr) {
            iK += c.k(j(bVar.f35068a, bVar.f35069b, bArr)) + 16 + (bVar.f35072e * 2) + bVar.f35073f + k(bVar.f35074g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, l.f35096c)) {
            int length = bVarArr.length;
            while (i8 < length) {
                b bVar2 = bVarArr[i8];
                G(byteArrayOutputStream, bVar2, j(bVar2.f35068a, bVar2.f35069b, bArr));
                F(byteArrayOutputStream, bVar2);
                i8++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                G(byteArrayOutputStream, bVar3, j(bVar3.f35068a, bVar3.f35069b, bArr));
            }
            int length2 = bVarArr.length;
            while (i8 < length2) {
                F(byteArrayOutputStream, bVarArr[i8]);
                i8++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    public static m c(b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < bVarArr.length; i9++) {
            try {
                b bVar = bVarArr[i9];
                c.p(byteArrayOutputStream, i9);
                c.p(byteArrayOutputStream, bVar.f35072e);
                i8 = i8 + 4 + (bVar.f35072e * 2);
                C(byteArrayOutputStream, bVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            m mVar = new m(d.CLASSES, i8, byteArray, true);
            byteArrayOutputStream.close();
            return mVar;
        }
        throw c.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    public static m d(b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < bVarArr.length; i9++) {
            try {
                b bVar = bVarArr[i9];
                int iA = a(bVar);
                byte[] bArrE = e(bVar);
                byte[] bArrF = f(bVar);
                c.p(byteArrayOutputStream, i9);
                int length = bArrE.length + 2 + bArrF.length;
                c.q(byteArrayOutputStream, length);
                c.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i8 = i8 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            m mVar = new m(d.METHODS, i8, byteArray, true);
            byteArrayOutputStream.close();
            return mVar;
        }
        throw c.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "!");
        }
        return Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(str2) ? str.replace("!", Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR) : str;
    }

    public static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static b i(b[] bVarArr, String str) {
        if (bVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i8 = 0; i8 < bVarArr.length; i8++) {
            if (bVarArr[i8].f35069b.equals(strH)) {
                return bVarArr[i8];
            }
        }
        return null;
    }

    public static int k(int i8) {
        return y(i8 * 2) / 8;
    }

    public static int l(int i8, int i9, int i10) {
        if (i8 == 1) {
            throw c.c("HOT methods are not stored in the bitmap");
        }
        if (i8 == 2) {
            return i9;
        }
        if (i8 == 4) {
            return i9 + i10;
        }
        throw c.c("Unexpected flag: " + i8);
    }

    public static int[] m(InputStream inputStream, int i8) {
        int[] iArr = new int[i8];
        int iH = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            iH += c.h(inputStream);
            iArr[i9] = iH;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i8, int i9) {
        int i10 = bitSet.get(l(2, i8, i9)) ? 2 : 0;
        return bitSet.get(l(4, i8, i9)) ? i10 | 4 : i10;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, c.d(inputStream, bArr.length))) {
            return c.d(inputStream, l.f35095b.length);
        }
        throw c.c("Invalid magic");
    }

    public static void p(InputStream inputStream, b bVar) {
        int iAvailable = inputStream.available() - bVar.f35073f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += c.h(inputStream);
            bVar.f35076i.put(Integer.valueOf(iH), 1);
            for (int iH2 = c.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw c.c("Read too much data during profile line parse");
        }
    }

    public static b[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        if (Arrays.equals(bArr, l.f35099f)) {
            if (Arrays.equals(l.f35094a, bArr2)) {
                throw c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, bVarArr);
        }
        if (Arrays.equals(bArr, l.f35100g)) {
            return t(inputStream, bArr2, bVarArr);
        }
        throw c.c("Unsupported meta version");
    }

    public static b[] r(InputStream inputStream, byte[] bArr, b[] bVarArr) throws IOException {
        if (!Arrays.equals(bArr, l.f35099f)) {
            throw c.c("Unsupported meta version");
        }
        int iJ = c.j(inputStream);
        byte[] bArrE = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() > 0) {
            throw c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            b[] bVarArrS = s(byteArrayInputStream, iJ, bVarArr);
            byteArrayInputStream.close();
            return bVarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static b[] s(InputStream inputStream, int i8, b[] bVarArr) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i8 != bVarArr.length) {
            throw c.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i8];
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int iH = c.h(inputStream);
            iArr[i9] = c.h(inputStream);
            strArr[i9] = c.f(inputStream, iH);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            b bVar = bVarArr[i10];
            if (!bVar.f35069b.equals(strArr[i10])) {
                throw c.c("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            bVar.f35072e = i11;
            bVar.f35075h = m(inputStream, i11);
        }
        return bVarArr;
    }

    public static b[] t(InputStream inputStream, byte[] bArr, b[] bVarArr) throws IOException {
        int iH = c.h(inputStream);
        byte[] bArrE = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() > 0) {
            throw c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            b[] bVarArrU = u(byteArrayInputStream, bArr, iH, bVarArr);
            byteArrayInputStream.close();
            return bVarArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static b[] u(InputStream inputStream, byte[] bArr, int i8, b[] bVarArr) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i8 != bVarArr.length) {
            throw c.c("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            c.h(inputStream);
            String strF = c.f(inputStream, c.h(inputStream));
            long jI = c.i(inputStream);
            int iH = c.h(inputStream);
            b bVarI = i(bVarArr, strF);
            if (bVarI == null) {
                throw c.c("Missing profile key: " + strF);
            }
            bVarI.f35071d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, l.f35098e)) {
                bVarI.f35072e = iH;
                bVarI.f35075h = iArrM;
            }
        }
        return bVarArr;
    }

    public static void v(InputStream inputStream, b bVar) {
        BitSet bitSetValueOf = BitSet.valueOf(c.d(inputStream, c.a(bVar.f35074g * 2)));
        int i8 = 0;
        while (true) {
            int i9 = bVar.f35074g;
            if (i8 >= i9) {
                return;
            }
            int iN = n(bitSetValueOf, i8, i9);
            if (iN != 0) {
                Integer num = (Integer) bVar.f35076i.get(Integer.valueOf(i8));
                if (num == null) {
                    num = 0;
                }
                bVar.f35076i.put(Integer.valueOf(i8), Integer.valueOf(iN | num.intValue()));
            }
            i8++;
        }
    }

    public static b[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, l.f35095b)) {
            throw c.c("Unsupported version");
        }
        int iJ = c.j(inputStream);
        byte[] bArrE = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() > 0) {
            throw c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            b[] bVarArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return bVarArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static b[] x(InputStream inputStream, String str, int i8) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int iH = c.h(inputStream);
            int iH2 = c.h(inputStream);
            bVarArr[i9] = new b(str, c.f(inputStream, iH), c.i(inputStream), 0L, iH2, (int) c.i(inputStream), (int) c.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i10 = 0; i10 < i8; i10++) {
            b bVar = bVarArr[i10];
            p(inputStream, bVar);
            bVar.f35075h = m(inputStream, bVar.f35072e);
            v(inputStream, bVar);
        }
        return bVarArr;
    }

    public static int y(int i8) {
        return (i8 + 7) & (-8);
    }

    public static void z(byte[] bArr, int i8, int i9, b bVar) {
        int iL = l(i8, i9, bVar.f35074g);
        int i10 = iL / 8;
        bArr[i10] = (byte) ((1 << (iL % 8)) | bArr[i10]);
    }

    public static m D(b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c.p(byteArrayOutputStream, bVarArr.length);
            int i8 = 2;
            for (b bVar : bVarArr) {
                c.q(byteArrayOutputStream, bVar.f35070c);
                c.q(byteArrayOutputStream, bVar.f35071d);
                c.q(byteArrayOutputStream, bVar.f35074g);
                String strJ = j(bVar.f35068a, bVar.f35069b, l.f35094a);
                int iK = c.k(strJ);
                c.p(byteArrayOutputStream, iK);
                i8 = i8 + 14 + iK;
                c.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i8 == byteArray.length) {
                m mVar = new m(d.DEX_FILES, i8, byteArray, false);
                byteArrayOutputStream.close();
                return mVar;
            }
            throw c.c("Expected size " + i8 + BpgIURjN.nwlpUPBPhYPwsO + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String j(String str, String str2, byte[] bArr) {
        String strA = l.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals(eGwOBWCdOTaKus.jsxafRAJhFxkkG)) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + l.a(bArr) + str2;
        }
        return g(str2, strA);
    }
}
