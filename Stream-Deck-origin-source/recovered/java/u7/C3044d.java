package u7;

import M6.eLZq.eGwOBWCdOTaKus;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: u7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3044d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f34601n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3044d f34602o = new a().d().a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C3044d f34603p = new a().e().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f34610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f34611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f34612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f34613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f34614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f34615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f34616m;

    /* JADX INFO: renamed from: u7.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f34617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f34618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34619c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34620d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34621e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f34622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f34623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f34624h;

        public final C3044d a() {
            return new C3044d(this.f34617a, this.f34618b, this.f34619c, -1, false, false, false, this.f34620d, this.f34621e, this.f34622f, this.f34623g, this.f34624h, null, null);
        }

        public final int b(long j8) {
            if (j8 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j8;
        }

        public final a c(int i8, TimeUnit timeUnit) {
            kotlin.jvm.internal.t.g(timeUnit, "timeUnit");
            if (i8 >= 0) {
                this.f34620d = b(timeUnit.toSeconds(i8));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i8).toString());
        }

        public final a d() {
            this.f34617a = true;
            return this;
        }

        public final a e() {
            this.f34622f = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: u7.d$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a(String str, String str2, int i8) {
            int length = str.length();
            while (i8 < length) {
                if (Z6.w.L(str2, str.charAt(i8), false, 2, null)) {
                    return i8;
                }
                i8++;
            }
            return str.length();
        }

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004c  */
        /* JADX WARN: Code duplicated, block: B:17:0x006b  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:41:0x0107  */
        /* JADX WARN: Code duplicated, block: B:43:0x010f  */
        /* JADX WARN: Code duplicated, block: B:44:0x0115  */
        /* JADX WARN: Code duplicated, block: B:46:0x011d  */
        /* JADX WARN: Code duplicated, block: B:47:0x0123  */
        /* JADX WARN: Code duplicated, block: B:49:0x012b  */
        /* JADX WARN: Code duplicated, block: B:50:0x0131  */
        /* JADX WARN: Code duplicated, block: B:52:0x0139  */
        /* JADX WARN: Code duplicated, block: B:53:0x0140  */
        /* JADX WARN: Code duplicated, block: B:55:0x0148  */
        /* JADX WARN: Code duplicated, block: B:56:0x0150  */
        /* JADX WARN: Code duplicated, block: B:58:0x0158  */
        /* JADX WARN: Code duplicated, block: B:59:0x015e  */
        /* JADX WARN: Code duplicated, block: B:61:0x0167  */
        /* JADX WARN: Code duplicated, block: B:62:0x016f  */
        /* JADX WARN: Code duplicated, block: B:64:0x0177  */
        /* JADX WARN: Code duplicated, block: B:65:0x017f  */
        /* JADX WARN: Code duplicated, block: B:67:0x0187  */
        public final C3044d b(t tVar) {
            int iA;
            int iA2;
            boolean z8;
            String string;
            int i8;
            String str;
            String string2;
            t tVar2 = tVar;
            kotlin.jvm.internal.t.g(tVar2, eGwOBWCdOTaKus.VbiQinM);
            int size = tVar2.size();
            boolean z9 = true;
            boolean z10 = true;
            int i9 = 0;
            String str2 = null;
            boolean z11 = false;
            boolean z12 = false;
            int iX = -1;
            int iX2 = -1;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            int iX3 = -1;
            int iX4 = -1;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            while (i9 < size) {
                String strM = tVar2.m(i9);
                String strU = tVar2.u(i9);
                if (Z6.v.v(strM, "Cache-Control", z9)) {
                    if (str2 == null) {
                        str2 = strU;
                    }
                    iA = 0;
                    while (iA < strU.length()) {
                        iA2 = a(strU, "=,;", iA);
                        String strSubstring = strU.substring(iA, iA2);
                        z8 = z9;
                        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = Z6.w.W0(strSubstring).toString();
                        if (iA2 != strU.length()) {
                            i8 = size;
                            if (strU.charAt(iA2) == ',' && strU.charAt(iA2) != ';') {
                                int iD = v7.d.D(strU, iA2 + 1);
                                if (iD >= strU.length() || strU.charAt(iD) != '\"') {
                                    str = strU;
                                    iA = a(str, ",;", iD);
                                    String strSubstring2 = str.substring(iD, iA);
                                    kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = Z6.w.W0(strSubstring2).toString();
                                } else {
                                    int i10 = iD + 1;
                                    String str3 = strU;
                                    int iX5 = Z6.w.X(str3, '\"', i10, false, 4, null);
                                    str = str3;
                                    String strSubstring3 = str.substring(i10, iX5);
                                    kotlin.jvm.internal.t.f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iA = iX5 + 1;
                                    string2 = strSubstring3;
                                }
                            }
                            if (Z6.v.v("no-cache", string, z8)) {
                                z9 = z8;
                                z11 = z9;
                            } else if (Z6.v.v("no-store", string, z8)) {
                                z9 = z8;
                                z12 = z9;
                            } else {
                                if (Z6.v.v("max-age", string, z8)) {
                                    iX = v7.d.X(string2, -1);
                                } else if (Z6.v.v("s-maxage", string, z8)) {
                                    iX2 = v7.d.X(string2, -1);
                                } else if (Z6.v.v("private", string, z8)) {
                                    z9 = z8;
                                    z13 = z9;
                                } else if (Z6.v.v("public", string, z8)) {
                                    z9 = z8;
                                    z14 = z9;
                                } else if (Z6.v.v("must-revalidate", string, z8)) {
                                    z9 = z8;
                                    z15 = z9;
                                } else if (Z6.v.v("max-stale", string, z8)) {
                                    iX3 = v7.d.X(string2, Integer.MAX_VALUE);
                                } else if (Z6.v.v("min-fresh", string, z8)) {
                                    iX4 = v7.d.X(string2, -1);
                                } else if (Z6.v.v("only-if-cached", string, z8)) {
                                    z9 = z8;
                                    z16 = z9;
                                } else if (Z6.v.v("no-transform", string, z8)) {
                                    z9 = z8;
                                    z17 = z9;
                                } else if (Z6.v.v("immutable", string, z8)) {
                                    z9 = z8;
                                    z18 = z9;
                                }
                                z9 = z8;
                            }
                            strU = str;
                            size = i8;
                        } else {
                            i8 = size;
                        }
                        str = strU;
                        iA = iA2 + 1;
                        string2 = null;
                        if (Z6.v.v("no-cache", string, z8)) {
                            z9 = z8;
                            z11 = z9;
                        } else if (Z6.v.v("no-store", string, z8)) {
                            z9 = z8;
                            z12 = z9;
                        } else {
                            if (Z6.v.v("max-age", string, z8)) {
                                iX = v7.d.X(string2, -1);
                            } else if (Z6.v.v("s-maxage", string, z8)) {
                                iX2 = v7.d.X(string2, -1);
                            } else if (Z6.v.v("private", string, z8)) {
                                z9 = z8;
                                z13 = z9;
                            } else if (Z6.v.v("public", string, z8)) {
                                z9 = z8;
                                z14 = z9;
                            } else if (Z6.v.v("must-revalidate", string, z8)) {
                                z9 = z8;
                                z15 = z9;
                            } else if (Z6.v.v("max-stale", string, z8)) {
                                iX3 = v7.d.X(string2, Integer.MAX_VALUE);
                            } else if (Z6.v.v("min-fresh", string, z8)) {
                                iX4 = v7.d.X(string2, -1);
                            } else if (Z6.v.v("only-if-cached", string, z8)) {
                                z9 = z8;
                                z16 = z9;
                            } else if (Z6.v.v("no-transform", string, z8)) {
                                z9 = z8;
                                z17 = z9;
                            } else if (Z6.v.v("immutable", string, z8)) {
                                z9 = z8;
                                z18 = z9;
                            }
                            z9 = z8;
                        }
                        strU = str;
                        size = i8;
                    }
                    i9++;
                    tVar2 = tVar;
                    z9 = z9;
                    size = size;
                } else {
                    if (Z6.v.v(strM, "Pragma", z9)) {
                    }
                    i9++;
                    tVar2 = tVar;
                    z9 = z9;
                    size = size;
                }
                z10 = false;
                iA = 0;
                while (iA < strU.length()) {
                    iA2 = a(strU, "=,;", iA);
                    String strSubstring4 = strU.substring(iA, iA2);
                    z8 = z9;
                    kotlin.jvm.internal.t.f(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = Z6.w.W0(strSubstring4).toString();
                    if (iA2 != strU.length()) {
                        i8 = size;
                        if (strU.charAt(iA2) == ',') {
                        }
                        if (Z6.v.v("no-cache", string, z8)) {
                            z9 = z8;
                            z11 = z9;
                        } else if (Z6.v.v("no-store", string, z8)) {
                            z9 = z8;
                            z12 = z9;
                        } else {
                            if (Z6.v.v("max-age", string, z8)) {
                                iX = v7.d.X(string2, -1);
                            } else if (Z6.v.v("s-maxage", string, z8)) {
                                iX2 = v7.d.X(string2, -1);
                            } else if (Z6.v.v("private", string, z8)) {
                                z9 = z8;
                                z13 = z9;
                            } else if (Z6.v.v("public", string, z8)) {
                                z9 = z8;
                                z14 = z9;
                            } else if (Z6.v.v("must-revalidate", string, z8)) {
                                z9 = z8;
                                z15 = z9;
                            } else if (Z6.v.v("max-stale", string, z8)) {
                                iX3 = v7.d.X(string2, Integer.MAX_VALUE);
                            } else if (Z6.v.v("min-fresh", string, z8)) {
                                iX4 = v7.d.X(string2, -1);
                            } else if (Z6.v.v("only-if-cached", string, z8)) {
                                z9 = z8;
                                z16 = z9;
                            } else if (Z6.v.v("no-transform", string, z8)) {
                                z9 = z8;
                                z17 = z9;
                            } else if (Z6.v.v("immutable", string, z8)) {
                                z9 = z8;
                                z18 = z9;
                            }
                            z9 = z8;
                        }
                        strU = str;
                        size = i8;
                    } else {
                        i8 = size;
                    }
                    str = strU;
                    iA = iA2 + 1;
                    string2 = null;
                    if (Z6.v.v("no-cache", string, z8)) {
                        z9 = z8;
                        z11 = z9;
                    } else if (Z6.v.v("no-store", string, z8)) {
                        z9 = z8;
                        z12 = z9;
                    } else {
                        if (Z6.v.v("max-age", string, z8)) {
                            iX = v7.d.X(string2, -1);
                        } else if (Z6.v.v("s-maxage", string, z8)) {
                            iX2 = v7.d.X(string2, -1);
                        } else if (Z6.v.v("private", string, z8)) {
                            z9 = z8;
                            z13 = z9;
                        } else if (Z6.v.v("public", string, z8)) {
                            z9 = z8;
                            z14 = z9;
                        } else if (Z6.v.v("must-revalidate", string, z8)) {
                            z9 = z8;
                            z15 = z9;
                        } else if (Z6.v.v("max-stale", string, z8)) {
                            iX3 = v7.d.X(string2, Integer.MAX_VALUE);
                        } else if (Z6.v.v("min-fresh", string, z8)) {
                            iX4 = v7.d.X(string2, -1);
                        } else if (Z6.v.v("only-if-cached", string, z8)) {
                            z9 = z8;
                            z16 = z9;
                        } else if (Z6.v.v("no-transform", string, z8)) {
                            z9 = z8;
                            z17 = z9;
                        } else if (Z6.v.v("immutable", string, z8)) {
                            z9 = z8;
                            z18 = z9;
                        }
                        z9 = z8;
                    }
                    strU = str;
                    size = i8;
                }
                i9++;
                tVar2 = tVar;
                z9 = z9;
                size = size;
            }
            return new C3044d(z11, z12, iX, iX2, z13, z14, z15, iX3, iX4, z16, z17, z18, !z10 ? null : str2, null);
        }
    }

    public /* synthetic */ C3044d(boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, String str, AbstractC2633k abstractC2633k) {
        this(z8, z9, i8, i9, z10, z11, z12, i10, i11, z13, z14, z15, str);
    }

    public final boolean a() {
        return this.f34608e;
    }

    public final boolean b() {
        return this.f34609f;
    }

    public final int c() {
        return this.f34606c;
    }

    public final int d() {
        return this.f34611h;
    }

    public final int e() {
        return this.f34612i;
    }

    public final boolean f() {
        return this.f34610g;
    }

    public final boolean g() {
        return this.f34604a;
    }

    public final boolean h() {
        return this.f34605b;
    }

    public final boolean i() {
        return this.f34613j;
    }

    public String toString() {
        String str = this.f34616m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f34604a) {
            sb.append("no-cache, ");
        }
        if (this.f34605b) {
            sb.append("no-store, ");
        }
        if (this.f34606c != -1) {
            sb.append("max-age=");
            sb.append(this.f34606c);
            sb.append(", ");
        }
        if (this.f34607d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f34607d);
            sb.append(", ");
        }
        if (this.f34608e) {
            sb.append("private, ");
        }
        if (this.f34609f) {
            sb.append("public, ");
        }
        if (this.f34610g) {
            sb.append("must-revalidate, ");
        }
        if (this.f34611h != -1) {
            sb.append("max-stale=");
            sb.append(this.f34611h);
            sb.append(", ");
        }
        if (this.f34612i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f34612i);
            sb.append(", ");
        }
        if (this.f34613j) {
            sb.append("only-if-cached, ");
        }
        if (this.f34614k) {
            sb.append("no-transform, ");
        }
        if (this.f34615l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        this.f34616m = string;
        return string;
    }

    public C3044d(boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, String str) {
        this.f34604a = z8;
        this.f34605b = z9;
        this.f34606c = i8;
        this.f34607d = i9;
        this.f34608e = z10;
        this.f34609f = z11;
        this.f34610g = z12;
        this.f34611h = i10;
        this.f34612i = i11;
        this.f34613j = z13;
        this.f34614k = z14;
        this.f34615l = z15;
        this.f34616m = str;
    }
}
