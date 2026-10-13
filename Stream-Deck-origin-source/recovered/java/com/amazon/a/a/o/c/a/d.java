package com.amazon.a.a.o.c.a;

import java.io.Serializable;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public enum d implements Serializable {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", !b.a());


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f16800d = -6343169151696340687L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient boolean f16803f;

    d(String str, boolean z8) {
        this.f16802e = str;
        this.f16803f = z8;
    }

    public static d a(String str) {
        for (d dVar : values()) {
            if (dVar.a().equals(str)) {
                return dVar;
            }
        }
        throw new IllegalArgumentException(kDsnNkYbBsI.FqVRMYfIUTU + str);
    }

    private Object c() {
        return a(this.f16802e);
    }

    public boolean b() {
        return this.f16803f;
    }

    public boolean d(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.f16803f, str.length() - length, str2, 0, length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f16802e;
    }

    public boolean b(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f16803f ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public boolean c(String str, String str2) {
        return str.regionMatches(!this.f16803f, 0, str2, 0, str2.length());
    }

    public String a() {
        return this.f16802e;
    }

    public boolean b(String str, int i8, String str2) {
        return str.regionMatches(!this.f16803f, i8, str2, 0, str2.length());
    }

    public int a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f16803f ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public int a(String str, int i8, String str2) {
        int length = str.length() - str2.length();
        if (length < i8) {
            return -1;
        }
        while (i8 <= length) {
            if (b(str, i8, str2)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }
}
