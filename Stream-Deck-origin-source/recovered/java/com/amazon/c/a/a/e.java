package com.amazon.c.a.a;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16942a = String.format("A valid instance of %s is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.", e.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16943b = String.format("A valid instance of %s is required to have a certificate ID.", e.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f16945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f16946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f16947f;

    public static String a() {
        return f16942a;
    }

    public static String b() {
        return f16943b;
    }

    public boolean c() {
        return (StringUtils.isBlank(e()) || StringUtils.isBlank(f())) ? false : true;
    }

    public boolean d() {
        return !StringUtils.isBlank(e());
    }

    public String e() {
        return StringUtils.isBlank(this.f16946e) ? this.f16944c : this.f16946e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return new EqualsBuilder().append(this.f16946e, eVar.f16946e).append(this.f16947f, eVar.f16947f).append(this.f16944c, eVar.f16944c).append(this.f16945d, eVar.f16945d).isEquals();
    }

    public String f() {
        return StringUtils.isBlank(this.f16947f) ? this.f16945d : this.f16947f;
    }

    public String g() {
        return this.f16944c;
    }

    public String h() {
        return this.f16945d;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(this.f16946e).append(this.f16947f).append(this.f16944c).append(this.f16945d).toHashCode();
    }

    public String i() {
        return this.f16946e;
    }

    public String j() {
        return this.f16947f;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public e a(String str) {
        this.f16944c = str;
        return this;
    }

    public void b(String str) {
        this.f16944c = str;
    }

    public e c(String str) {
        this.f16945d = str;
        return this;
    }

    public void d(String str) {
        this.f16945d = str;
    }

    public e g(String str) {
        this.f16947f = str;
        return this;
    }

    public void h(String str) {
        this.f16947f = str;
    }

    public e e(String str) {
        this.f16946e = str;
        return this;
    }

    public void f(String str) {
        this.f16946e = str;
    }
}
